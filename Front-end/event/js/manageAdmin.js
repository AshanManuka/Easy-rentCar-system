
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
                $("#twotxtCusName").val(adm.name);
                $("#twotxtNic").val(adm.nic);
                $("#twoMail").val(adm.email);
                // $("#twotxtPassword").val();

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


// ======================== update admin =============================

        $("#updateBtn").click(function(){

            let admName = $("#twotxtCusName").val();
            let admNic = $("#twotxtNic").val();
            let admMail = $("#twoMail").val();
            let admPassword = $("#twotxtPassword").val();

            var admin = {
                id : 1,
                name : admName,
                nic : admNic,
                email : admMail,
                password : admPassword
            }

            $.ajax({
                url: baseURL+'admin',
                method: 'put',
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


        });


// ===================== Delete Admin ========================