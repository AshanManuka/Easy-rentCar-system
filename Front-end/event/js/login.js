// ===================Login==============

    let baseURL = "http://localhost:8080/app/";



$("#twologinBtn").click(function(){
    saveCustomer();
});



// ======================== Save Customer ========================================
function saveCustomer(){

    let cusId = generateId();
    let name = $("#twotxtCusName").val();
    let eMail = $("#twotxtmail").val();
    let contact = $("#twotxtContact").val();
    let password = $("#twotxtPassword").val();
    let file = $("#twoLicense")[0].files[0];

    // var customer = {
    //     id : cusId,
    //     Name : name,
    //     Password : password,
    //     Email : eMail,
    //     Contact : contact,
    //     image : file
    // }

    // $.ajax({
    //     url: baseURL+"customer",
    //     method: "post",
    //     data: formData,
    //     dataType:"json",
    //     success: function (res) {
    //         alert(res.message);
    //         loadAllCustomers();
    //     },
    //     error:function(error){
    //         var jsObject=JSON.parse(error.responseText);
    //         alert(jsObject.message);
    //     }
    // });


}

function generateId(){
    let lId = checkLastId()+1;
    return lId;
}

function checkLastId(){
    const idList = [];


    $.ajax({
        url: baseURL+"customer",
        method: 'get',
        dataType: "json",
        success: function (resp) {
            console.log(resp);
            for (let cus of resp.data) {
                idList.push(cus.id);
            }
            console.log(idList);
        }
    });

    let lastId = idList.slice(-1);

    return lastId+1;
}


