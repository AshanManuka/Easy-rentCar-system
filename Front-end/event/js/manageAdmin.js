
        let baseURL = "http://localhost:8080/app/";

// ================== load Last Admin =========================

var lastId;
loadAdmin();

function loadAdmin(){
    $.ajax({
        url: baseURL+'admin',
        method: 'get',
        dataType: "json",
        success: function (resp) {
            const idList = [0];
            for (let adm of resp.data) {
                idList.push(adm.id);
            }
            lastId = idList.slice(-1);
        }
    });
}






// ===================== save Admin ================================

$("#twologinBtn").click(function(){
   checkSuperAdmin();
});

function checkSuperAdmin() {
    createAdmin();
}

function createAdmin(){
    let adminId = parseInt(lastId)+1;
    let adminName = $("#twotxtCusName").val();
    let adminNic = $("#twotxtNic").val();
    let adminMail = $("#twoMail").val();
    let adminPassword = $("#twotxtPassword").val();

    var admin = {
        id : adminId,
        name : adminName,
        nic : adminNic,
        email : adminMail,
        password : adminPassword
    }

    $.ajax({
        url: baseURL+'admin',
        method: 'post',
        contentType:"application/json",
        data:JSON.stringify(admin),
        dataType:"json",
        success: function (res) {
            alert(res.message);
        },
        error:function (error){
            let cause= JSON.parse(error.responseText).message;
            alert(cause);
        }

    });

    location.reload();
}