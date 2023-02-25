// ===================Login==============

    let baseURL = "http://localhost:8080/app/";


// ======================== Save Customer ========================================
 let lastId;
checkLastId();

function checkLastId(){

    $.ajax({
        url: baseURL+"customer",
        method: 'get',
        dataType: "json",
        success: function (resp) {
            const idList = [0];
            for (let cus of resp.data) {
                idList.push(cus.id);
            }
            lastId = idList.slice(-1);
        }
    });
}

$("#twologinBtn").click(function(){
    saveCustomer();
});

function saveCustomer(){

    let cusId = parseInt(lastId)+1;
    let name = $("#twotxtCusName").val();
    let eMail = $("#twotxtmail").val();
    let contact = $("#twotxtContact").val();
    let password = $("#twotxtPassword").val();
    let file = $("#twoLicense").val();

    var customer = {
        id : cusId,
        userName : name,
        Password : password,
        email : eMail,
        contact : contact,
        nicImage : file
    }

    $.ajax({
        url: baseURL+"customer",
        method: "post",
        data: customer,
        dataType:"json",
        success: function (res) {
            alert(res.message);
        },
        error:function(error){
            var jsObject=JSON.parse(error.responseText);
            alert(jsObject.message);
        }
    });


}




