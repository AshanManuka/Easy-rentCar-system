

        let baseURL = "http://localhost:8080/app/";


$("#reservationSection").css('display', 'none' );
var carList =[];
var perPart = "../../event/images/cars/";
loadAllCars();

// ============================ load all Cars on feed ===============================

        var idCount = 1;

        function loadAllCars(){
            $.ajax({
                url: baseURL+'car',
                method: 'get',
                dataType: "json",
                success: function (resp) {
                    for (let c of resp.data) {
                        let reg = c.regNo;
                        let br = c.brand;
                        let dRate = c.dailyRate;
                        let mRate = c.monthlyRate;
                        let exKM = c.chargeForExtraKm;
                        let tr = c.transmissionType;
                        let fType = c.fuelType;
                        let iOne = c.imageOne;
                        let iTwo = c.imageTwo;
                        let iThree = c.imageThree;
                        let iFour = c.imageFour;
                        let iFive = c.imageFive;

                        var car = {
                            re : reg,
                            bra : br,
                            dr : dRate,
                            mr : mRate,
                            er : exKM,
                            ft : fType,
                            i2 : iTwo,
                            i3 : iThree,
                            i4 : iFour,
                            i5 : iFive
                        }

                        carList.push(car);


                        var lastPartOne = iOne.substring(12,21);
                        var fullPartOne = perPart+lastPartOne;

   //================= load Box =======================
                            $("#brand").append(`<option>${br}</option>`);

                            var e = $(`<div style="display:block; background-color: rgba(16,0,3,0.25); border-radius:5px; float:left;width:`+375+`px; height:`+320+`px; margin-top:`+50+`px;margin-left:`+50+`px;border:1px solid #CCCCCC;"><img src=`+fullPartOne+` alt="image" style="width:`+350+`px; height:`+230+`px; margin-left:`+13+`px; margin-top:`+20+`px; border-radius: 5px"><br><br><button style="border-radius: 20px; border: black solid 1px; margin-left: 100px; width: 150px; height: 30px; background-color: #87d0de"><b>More</b></button><h5 style="display: none">`+idCount+`</h5> </div>`);
                            e.attr('id', idCount);
                            $('#vehicleFeed').append(e);
                            idCount++;

                    }
                    bindDiv();

                }
            });

        }



 // ======================== check details ========================================
var sVehicleId;

function bindDiv(){
    $("#vehicleFeed > div").click(function(){
        let count = $(this).find("h5").text()

        var vehi = carList[count-1];
        sVehicleId = vehi;

        var lastPartTwo = vehi.i2.substring(12,21);
        var lastPartThree = vehi.i3.substring(12,21);
        var lastPartFour = vehi.i4.substring(12,21);
        var lastPartFive = vehi.i5.substring(12,21);

        var fullPartTwo = perPart+lastPartTwo;
        var fullPartThree = perPart+lastPartThree;
        var fullPartFour = perPart+lastPartFour;
        var fullPartFive = perPart+lastPartFive;


                Swal.fire({
                    title: '<img src='+fullPartTwo+' width="200px" height="200px"> <img src='+fullPartThree+' width="200px" height="200px"> <img src='+fullPartFour+' width="200px" height="200px"> <img src='+fullPartFive+' width="200px" height="200px">',
                    html:
                        'Transition : <b>'+"Auto"+'</b> <br> Fuel : <b>'+vehi.ft+'</b> <br> Daily : <b>'+vehi.dr+'</b> <br> Monthly : <b>'+vehi.mr+'</b> <br> Extra KM : <b>'+vehi.er+'</b>',

                    showCloseButton: true,
                    focusConfirm: false,
                    confirmButtonText:
                        '<i class="fa-sharp fa-solid fa-cart-shopping" id="byBtn"></i> BUY',
                    confirmButtonAriaLabel: 'Thumbs up, great!',

                })

        $("#byBtn").click(function () {
            $("#vehicleFeed").css('display', 'none' );
            $("#reservationSection").css('display', 'inline' );
            $("#carBrand").text(vehi.bra);
            $("#carTransition").text("Auto");
            $("#carFuel").text(vehi.ft);



        });



    })
}



// =============================== Make Reservation =============================

        var lastReqId;

$("#withDriver").click(function(){
    calculateAmount();
});

$("#withoutDriver").click(function(){
     calculateAmount();
})


function calculateAmount(){
     let sDate = $("#upTime").val();
     let fDate = $("#downTime").val();

   let n1 = parseInt(sDate.substring(8,10));
   let n2 = parseInt(fDate.substring(8,10));

     let duration = n2 - n1;
     let amount = duration * 15000;
     $("#totalH").text(amount)
}



$("#resBtn").click(function () {
    $("#reservationSection").css('display', 'none' );
    $("#vehicleFeed").css('display', 'inline' );
    makeId();

});

$("#cancelBtn").click(function () {
    $("#reservationSection").css('display', 'none' );
    $("#vehicleFeed").css('display', 'inline' );
});


function makeId(){
    $.ajax({
        url: baseURL+'reservationReq',
        method: 'get',
        dataType: "json",
        success: function (resp) {
            const reqIdList = [0];
            for (let c of resp.data) {
                console.log("hhhh : "+c.id)
                    reqIdList.push(c.id);
            }
            lastReqId = reqIdList.slice(-1);
            makeReservation();
        }

    });
}


function makeReservation(){

    var resId = parseInt(lastReqId)+1;
    var upDate = $("#upTime").val();
    var downDate = $("#downTime").val();
    var payStatus = "done";
    var cusMail = $("#conMail").val();
    var vehiId = sVehicleId.re;
    var dStatus = "no";

    var reservation = {
        id : resId,
        pickupDate : upDate,
        finishDate : downDate,
        paymentStatus : payStatus,
        user : cusMail,
        car : vehiId,
        driverStatus : dStatus
    }

    $.ajax({
        url: baseURL+'reservationReq',
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

}


// ================ search vehicle ====================

$("#searchBtn").click(function(){
    let carBrand = $("#brand").val();
    let passNo = $("#passenger").val();
    let col = $("#colors").val();

    console.log(carBrand,passNo,col);


});


