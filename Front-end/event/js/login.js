// ===================Login==============

    let baseURL = "http://localhost:8080/app/";


// ======================== Save Customer ========================================
 var lastId;
checkLastId();

function checkLastId(){

    $.ajax({
        url: baseURL+'customer',
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
        password : password,
        email : eMail,
        contact : contact,
        nicImage : file
    }

    console.log(customer);

    $.ajax({
        url: baseURL+'pendingCustomer',
        method: 'post',
        contentType:"application/json",
        data:JSON.stringify(customer),
        dataType:"json",
        success: function (res) {
            alert(res.message);
        },
        error:function (error){
            let cause= JSON.parse(error.responseText).message;
            alert(cause);
        }

    });


}




