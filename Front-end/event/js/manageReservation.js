    let baseURL = "http://localhost:8080/app/";


loadRequest();
// ====================== load requests ========================

  function loadRequest(){
      alert("hiiii")
      $.ajax({
          url: baseURL+'reservationReq',
          method: 'get',
          dataType:"json",
          success: function (res) {
              const reqList = [];
              for (let request of res.data) {
                  let rId = request.id;
                  let upDate = request.pickupDate;
                  let downDate = request.finishDate;
                  let pymnt = request.paymentStatus;
                  let uMail = request.user;
                  let vehId = request.car;
                  let driv = request.driverStatus;

                  var req = {
                      reId : rId,
                      pUpDate : upDate,
                      pDownDate : downDate,
                      payment : pymnt,
                      userMail : uMail,
                      vehiId : vehId,
                      driverId : driv
                  }
                  reqList.push(req);
                  console.log(reqList)

              }
          },
          error:function (error){
              let cause= JSON.parse(error.responseText).message;
              alert(cause);
          }

      });

  }


