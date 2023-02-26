// ===================Login==============

    let baseURL = "http://localhost:8080/app/";


// ======================== Save Customer ========================================
//  var lastId;
// checkLastId();
//
// function checkLastId(){
//
//     $.ajax({
//         url: baseURL+"pendingCustomer",
//         method: 'get',
//         dataType: "json",
//         success: function (resp) {
//             const idList = [0];
//             for (let cus of resp.data) {
//                 idList.push(cus.id);
//             }
//             lastId = idList.slice(-1);
//             console.log("in first method : "+lastId);
//         }
//     });
// }

$("#twologinBtn").click(function(){
    //console.log("last id in clicking: "+lastId);
    saveCustomer();
});

function saveCustomer(){
    //console.log("last save Customer: "+lastId)
    // let cusId = parseInt(lastId)+1;
    let cusId = 5;
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




