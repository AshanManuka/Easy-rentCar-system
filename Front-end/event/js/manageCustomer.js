// ===================Manage Customer==============

let baseURL = "http://localhost:8080/app/";
let requestList = [];

 // ========================= load all Customer =========================


loadPendingCustomer();
loadAllCustomers();


// ================== Pending Customers=========================
function loadPendingCustomer(){

    let imgStatus = "-";
    let ids = 1;

    $.ajax({
        url: baseURL+'pendingCustomer',
        method: 'get',
        dataType: "json",
        success: function (resp) {
            for (let c of resp.data) {
                let idd = c.id;
                let na = c.userName;
                let pas = c.password;
                let em = c.email;
                let co = c.contact;
                let image = c.nicImage;

                var customer = {
                    id : idd,
                    userName : na,
                    password : pas,
                    email : em,
                    contact: co,
                    incImage : image
                }

                requestList.push(customer);
                console.log(requestList);

                if(image !== null){
                   imgStatus = "NIC Verified";
                }else{
                   imgStatus = "NIC Not Verified";
                }

                 var e = $(`<br><div style="display:block; background-color: rgba(10,87,102,0.65); border-radius:20px; float:left; width:`+800+`px;   margin-left:`+50+`px;border:2px solid #cccccc;"><h4 style="margin-left: 30px; color: azure; display: inline; width: auto" >${na}</h4><h4 style="color: azure; margin-left: 20px; display: inline">${em}</h4><h4 style="color: azure; margin-left: 20px; display: inline">${co}</h4><h4 style="color: azure; margin-left: 20px; display: inline">${imgStatus}</h4> <button style="background-color: #a52834; border-radius: 40px; width: 100px; height: 40px; display: inline; margin-left: 20px" class="btnClass" id="#`+ids+`"  data-bs-toggle="modal"  type="button"><b>Accept</b></button><button style="background-color: #a52834; border-radius: 40px; width: 100px; height: 40px; margin-top: 20px; margin-bottom:20px; margin-left: 20px " class="buyTicket" id="btnTwo" data-bs-toggle="modal"  type="button"><b>Deny</b></button></div><br>`);
                 e.attr('id', 'myid');
                 $('#reqList').append(e);
                 ids++;

            }
        }
    });

}


// ====================== All Customers ===================

function loadAllCustomers(){
    $.ajax({
        url: baseURL+'customer',
        method: 'get',
        dataType: "json",
        success: function (resp) {
            for (let c of resp.data) {
                let cId = c.id;
                let cName = c.userName;
                let cMail = c.email;
                let cContact = c.contact;

                var row = "<tr><td>" + cId + "</td><td>" + cName + "</td><td>" + cMail + "</td><td>" + cContact + "</td><td>" + `<button value="sample" style="border-radius: 50px; border: #b6d4fe 2px black"><i class="fa-solid fa-trash"></i></button>` + "</td></tr>";
                $("#cusTable").append(row);

            }
        }
    });
}







// ========================= Accept All Requests ========================
$("#acceptBtn").click(function () {


    for (let i = 0; i<requestList.length; i++){
        var Customer = requestList[i];

        $.ajax({
            url: baseURL+'customer',
            method: 'post',
            contentType:"application/json",
            data:JSON.stringify(Customer),
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

    location.reload();
    deleteRequests();

});


// ======================== Delete Requests ===========================

function deleteRequests() {
    $.ajax({
        url: baseURL+"pendingCustomer",
        method: "delete",
        success: function (resp) {
            alert(resp.message);
        },
        error: function (error) {
            let message = JSON.parse(error.responseText).message;
            alert(message);
        }
    });
}


