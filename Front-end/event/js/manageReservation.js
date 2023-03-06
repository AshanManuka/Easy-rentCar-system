    let baseURL = "http://localhost:8080/app/";


loadRequest();
lastReservation();
// ====================== load requests ========================

    var rowId = 1;
    const reqList = [];
    var lastResId;

  function loadRequest() {
      $.ajax({
          url: baseURL + 'reservationReq',
          method: 'get',
          dataType: "json",
          success: function (res) {
              // const reqList = [];
              for (let request of res.data) {
                  let rId = request.id;
                  let upDate = request.pickupDate;
                  let downDate = request.finishDate;
                  let pymnt = request.paymentStatus;
                  let uMail = request.user;
                  let vehId = request.car;
                  let driv = request.driverStatus;

                  var req = {
                      reId: rId,
                      pUpDate: upDate,
                      pDownDate: downDate,
                      payment: pymnt,
                      userMail: uMail,
                      vehiId: vehId,
                      driverId: driv
                  }
                  reqList.push(req);
                  console.log(reqList)

                  var row = "<tr class='nr'><td style='background-color: rgba(250,11,34,0.25)'>" + rId + "</td><td>" + uMail + "</td><td>" + vehId + "</td><td>" + driv + "</td><td>" + pymnt + "</td><td>"+`<button class="acceptBtn" id=`+rowId+` style="border-radius: 50px; border: #b6d4fe 2px black"><i class="fa-sharp fa-solid fa-xmark"></i></button>`+" </td></tr>";
                  $("#reqTable").append(row);
                  rowId++;
              }
              bindRow();
          },
          error: function (error) {
              let cause = JSON.parse(error.responseText).message;
              alert(cause);
          }
      })
  }



 function bindRow(){
     $("#reqTable > tbody > tr > td").click(function() {
          let count = $(this).text();
          denyRequest(count);

     });

     }


 function denyRequest(rId){

     $.ajax({
         url: baseURL+"reservationReq?code=" + rId,
         method: "delete",
         success: function (resp) {
             loadRequest();
             alert(resp.message);
         },
         error: function (error) {
             let message = JSON.parse(error.responseText).message;
             alert(message);
         }
     });

 }


  function lastReservation(){
      $.ajax({
          url: baseURL + 'reservation',
          method: 'get',
          dataType: "json",
          success: function (res) {
               const resIdList = [0];
              for (let request of res.data) {
                  resIdList.push(request.id);
              }
              lastResId = resIdList.slice(-1);
          },
          error: function (error) {
              let cause = JSON.parse(error.responseText).message;
              alert(cause);
          }
      })
  }


  function setPayment(){
      var amount = [];
      let pId = lastResId;
      let pDate = "22-05-2023";
      let valu = 25000;

      var payment = {
          id : pId,
          date : pDate,
          value : valu
      }
      amount.push(payment);
      return amount;
  }


  // ================== save Reservation ====================

