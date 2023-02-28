
let baseURL="http://localhost:8080/app/";


var lastId;
checkLastId();
loadData();


// ================ checking last id================
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
        }
    });

}


// ================== save Driver =======================
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

    $.ajax({
        url: baseURL+'driver',
        method: 'post',
        contentType:"application/json",
        data:JSON.stringify(driver),
        dataType:"json",
        success: function (res) {
            alert(res.message);
            checkLastId();
            loadData();
        },
        error:function (error){
            let cause= JSON.parse(error.responseText).message;
            alert(cause);
        }

    });

});


// ==============load data to box============================
function loadData(){
    $("#driver").empty();

    $.ajax({
        url: baseURL+'driver',
        method: 'get',
        dataType: "json",
        success: function (resp) {
            for (let cus of resp.data) {
                $("#driver").append(`<option>${cus.name}</option>`);
            }
        }
    });
}

// =======================select from box===================
$('#driver').on('change', function() {
    var selectedName = $(this).val();
    loadDatatoField(selectedName);
});


function loadDatatoField(value){

    $.ajax({
        url: baseURL+"driver",
        method: "get",
        dataType: "json",
        success: function (resp) {

            for (let driver of resp.data) {
                let nam = driver.name;
                let con = driver.contact;
                let mail = driver.email;
                let add = driver.address;

                if (nam === value) {
                    var d = {
                        na : nam,
                        cont : con,
                        eMail : mail,
                        addr : add
                    }

                    $("#twotxtCusName").val(d.na);
                    $("#twotxtmail").val(d.eMail);
                    $("#twotxtPassword").val(d.cont);
                    $("#twotxtContact").val(d.addr);

                }
            }



        },
        error: function (error) {
            let message = JSON.parse(error.responseText).message;
            alert(message);
        }
    });
}
