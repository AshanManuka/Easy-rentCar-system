    let baseURL = "http://localhost:8080/app/";


loadRequest();
lastReservation();
loadDrivers();
loadUsers();
loadCars();
loadcancelIDS();

// ====================== load requests ========================

    var rowId = 1;
    const reqList = [];
    const custoList =[];
    const carList =[];
    const driverList = [];
    var lastResId;
    var lastCancelId;

  function loadRequest() {
      $.ajax({
          url: baseURL + 'reservationReq',
          method: 'get',
          dataType: "json",
          success: function (res) {

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

                  var row = "<tr class='nr'><td style='background-color: rgba(250,11,34,0.25)'>" + rId + "</td><td>" + uMail + "</td><td>" + vehId + "</td><td>" + driv + "</td><td>" + pymnt + "</td><td style='background-color: rgba(36,240,13,0.45)'>"+`<button class="acceptBtn" value=`+rowId+` style="border-radius: 50px; border: #b6d4fe 2px black"><i class="fa-sharp fa-solid fa-check"></i></button> `+` &nbsp <button class="denyBtn" value=`+rowId+` style="border-radius: 50px; border: #b6d4fe 2px black"><i class="fa-sharp fa-solid fa-xmark"></i></button>`+" </td></tr>";
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
     $("#reqTable > tbody > tr > td > .acceptBtn ").click(function() {
          let count = $(this).val();
          setReservationData(count);
     });

     $("#reqTable > tbody > tr > td > .denyBtn").click(function() {
         let denyId = $(this).val();
         denyRequest(denyId);
     });

     }


 function setReservationData(id){
     for (let arg of reqList) {
         if (arg.reId == id){
             $("#resId").val(parseInt(lastResId)+1);
             $("#upDate").val(arg.pUpDate);
             $("#downDate").val(arg.pDownDate);
             $("#payment").val(arg.payment);
             $("#user").val(arg.userMail);
             $("#car").val(arg.vehiId);
         }
     }

 }


 function loadDrivers(){

     $.ajax({
         url: baseURL+'driver',
         method: 'get',
         dataType: "json",
         success: function (resp) {

             for (let driver of resp.data) {
                 let dId = driver.id;
                 let dName = driver.name;

                 $("#drivers").append(`<option>${driver.name}</option>`);

                var dr = {
                    drId : dId,
                    drName : dName,
                    drContact : driver.contact,
                    drMail : driver.email,
                    drAddress : driver.address
                }
                driverList.push(dr);
             }
         }
     });

 }



    function loadUsers(){

        $.ajax({
            url: baseURL+'customer',
            method: 'get',
            dataType: "json",
            success: function (resp) {

                for (let cus of resp.data) {
                    let cId = cus.id;
                    let cName = cus.userName;
                    let cPassword = cus.password;
                    let cEMail = cus.email;
                    let cContact = cus.contact;
                    let cNic = cus.nicImage;

                    var customer = {
                        id : cId,
                        userName : cName,
                        password : cPassword,
                        email : cEMail,
                        contact : cContact,
                        nicImage : cNic
                    }
                    custoList.push(customer);
                }
            }
        });

    }



 function loadCars(){

     $.ajax({
         url: baseURL+'car',
         method: 'get',
         dataType: "json",
         success: function (resp) {
             for (let c of resp.data) {

                 var car = {
                     rN : c.regNo,
                     bran : c.brand,
                     co : c.color,
                     i1 : c.imageOne,
                     i2 : c.imageTwo,
                     i3 : c.imageThree,
                     i4 : c.imageFour,
                     i5 : c.imageFive,
                     b : c.isAvailable,
                     d : c.availableD,
                     tType : c.transmissionType,
                     fType : c.fuelType,
                     cEx : c.chargeForExtraKm,
                     dr : c.dailyRate,
                     mR : c.monthlyRate
                 }
                 carList.push(car);

             }
         }
     });

 }


 function loadcancelIDS(){
     $.ajax({
         url: baseURL+'cancelRequest',
         method: 'get',
         dataType: "json",
         success: function (resp) {
             const idList = [0];
             for (let cus of resp.data) {
                 idList.push(cus.id);
             }
             lastCancelId = idList.slice(-1);
         }
     });
 }



 $("#confirmBtn").click(function(){
    makeNewReservation();
 });







function makeNewReservation(){

    // let userMail = $("#user").val();
    // for (let customer of custoList) {
    //     if(userMail == customer.email){
    //         userMail = customer;
    //     }
    // }


    // let resCar = $("#car").val();
    // for (let car of carList) {
    //     if(resCar == car.rN){
    //         resCar = car;
    //     }
    // }

    let resDriver = $("#drivers").val();
    for (let driver of driverList) {
        if(resDriver == driver.drName){
            resDriver = driver.drId;
        }
    }



    let resId = $("#resId").val();
    let resDate = $("#upDate").val();
    let redFinishDate = $("#downDate").val();
    let rePayment = $("#payment").val();
    let userMail = $("#user").val();
    let resCar = $("#car").val();


    var reservation = {
        id : resId,
        pickupDate : resDate,
        finishDate : redFinishDate,
        amount : rePayment,
        userMail : userMail,
        carNo : resCar,
        driverId : resDriver
    }




    $.ajax({
        url: baseURL+'reservation',
        method: 'post',
        contentType:"application/json",
        data:JSON.stringify(reservation),
        dataType:"json",
        success: function (res) {
            alert(res.message);
        },
        error:function (error){
            let cause= JSON.parse(error.responseText).message;
            alert(cause);
        }
    });
    deleteRequest(userMail,resCar);
}



function deleteRequest(mail,carNo){
    for (let request of reqList) {
        if (mail == request.userMail && carNo == request.vehiId){
            let reqId = request.reId;
            denyRequest(reqId);
        }
    }
}


 function denyRequest(rId){

     $.ajax({
         url: baseURL+"reservationReq?code=" + rId,
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


  // ================== deny Reservation ====================



  $("#denyBtn").click(function(){
      let lId = parseInt(lastCancelId)+1;
      let uMail = $("#user").val();
      let lCar = $("#car").val();
      let lMessage = $("#denyMessage").val();

      var warMessage = {
          id : lId,
          userMail : uMail,
          vehiNo : lCar,
          message : lMessage
      }

      $.ajax({
          url: baseURL+'cancelRequest',
          method: 'post',
          contentType:"application/json",
          data:JSON.stringify(warMessage),
          dataType:"json",
          success: function (res) {
              alert(res.message);
          },
          error:function (error){
              let cause= JSON.parse(error.responseText).message;
              alert(cause);
          }
      });

      deleteRequest(uMail,lCar);
      loadcancelIDS();
  });

