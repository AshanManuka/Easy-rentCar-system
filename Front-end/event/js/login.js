// ===================Login==============

    let baseURL = "http://localhost:8080/app/";




$("#twologinBtn").click(function(){
    saveCustomer();
});



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

function saveCustomer(){

    let cusId = parseInt(lastId)+1;
    alert("last Id : "+cusId);
    let name = $("#twotxtCusName").val();
    let eMail = $("#twotxtmail").val();
    let contact = $("#twotxtContact").val();
    let password = $("#twotxtPassword").val();
    let file = $("#twoLicense")[0].files[0];

    var customer = {
        id : cusId,
        Name : name,
        Password : password,
        Email : eMail,
        Contact : contact,
        image : file
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




