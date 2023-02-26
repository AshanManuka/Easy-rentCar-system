// ===================Manage Customer==============

let baseURL = "http://localhost:8080/app/";


 // ========================= load all Customer =========================


loadPendingCustomer();

function loadPendingCustomer(){

    let imgStatus = "-";
    let ids = 1;

    $.ajax({
        url: baseURL+'pendingCustomer',
        method: 'get',
        dataType: "json",
        success: function (resp) {
            for (let c of resp.data) {
                let name = c.userName;
                let email = c.email;
                let contact = c.contact;
                let image = c.nicImage;

                if(image !== null){
                   imgStatus = "NIC Verified";
                }else{
                   imgStatus = "NIC Not Verified";
                }

                 var e = $(`<br><div style="display:block; background-color: rgba(10,87,102,0.65); border-radius:20px; float:left; width:`+800+`px;   margin-left:`+50+`px;border:2px solid #cccccc;"><h4 style="margin-left: 30px; color: azure; display: inline; width: auto" >${name}</h4><h4 style="color: azure; margin-left: 20px; display: inline">${email}</h4><h4 style="color: azure; margin-left: 20px; display: inline">${contact}</h4><h4 style="color: azure; margin-left: 20px; display: inline">${imgStatus}</h4> <button style="background-color: #a52834; border-radius: 40px; width: 100px; height: 40px; display: inline; margin-left: 20px" class="btnClass" id="#`+ids+`"  data-bs-toggle="modal"  type="button"><b>Accept</b></button><button style="background-color: #a52834; border-radius: 40px; width: 100px; height: 40px; margin-top: 20px; margin-bottom:20px; margin-left: 20px " class="buyTicket" id="btnTwo" data-bs-toggle="modal"  type="button"><b>Deny</b></button></div><br>`);
                 e.attr('id', 'myid');
                 $('#reqList').append(e);
                 ids++;

            }
        }
    });

}





