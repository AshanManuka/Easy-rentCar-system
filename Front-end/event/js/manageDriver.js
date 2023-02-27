
let baseURL="http://localhost:8080/app/";


var lastId;
checkLastId();

function checkLastId(){

    $.ajax({
        url: baseURL+'driver',
        method: 'get',
        dataType: "json",
        success: function (resp) {
            const idList = [0];
            for (let cus of resp.data) {
                idList.push(cus.id);
            }
            lastId = idList.slice(-1);
            alert(lastId);
        }
    });
}



$("#twologinBtn").click(function(){

    let driveId = parseInt(lastId)+1;
    let cusName = $("#twotxtCusName").val();
    let cusNic = $("#twotxtmail").val();
    let cusAddress = $("#twotxtPassword").val();
    let cusContact = $("#twotxtContact").val();


    var driver = {
        id : driveId,
        name : cusName,
        contact : cusContact,
        nic : cusNic,
        address : cusAddress
    }

    console.log(driver);
    $.ajax({
        url: baseURL+'driver',
        method: 'post',
        contentType:"application/json",
        data:JSON.stringify(driver),
        dataType:"json",
        success: function (res) {
            alert(res.message);
        },
        error:function (error){
            let cause= JSON.parse(error.responseText).message;
            alert(cause);
        }

    });

});