

        let baseURL = "http://localhost:8080/app/";


loadAllCars();



$("#searchBtn").click(function(){
    Swal.fire({
        title: '<img src="../../event/images/carLogo.jpg" width="200px" height="200px"> <img src="../../event/images/carLogo.jpg" width="200px" height="200px"> <img src="../../event/images/carLogo.jpg" width="200px" height="200px"> <img src="../../event/images/carLogo.jpg" width="200px" height="200px">',
        html:
            'Transition : <b>Auto</b> <br> Fuel : <b>Petrol</b> <br> Daily : <b>10000</b> <br> Monthly : <b>100000</b> <br> Extra KM : <b>800</b>',

        showCloseButton: true,
        focusConfirm: false,
        confirmButtonText:
            '<i class="fa-sharp fa-solid fa-cart-shopping"></i> BUY',
        confirmButtonAriaLabel: 'Thumbs up, great!',

    })
});



// ============================ load all Cars on feed ===============================

        function loadAllCars(){
            $.ajax({
                url: baseURL+'car',
                method: 'get',
                dataType: "json",
                success: function (resp) {
                    for (let c of resp.data) {
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



                        var ii = "../../event/images/cars/alto2.jpg"


                        var perPart = "../../event/images/cars/";
                        var lastPart = iOne.substring(12,21);
                        var fullPart = perPart+lastPart;
                        console.log(fullPart);

                            var e = $(`<div style="display:block; background-color: rgba(16,0,3,0.25); border-radius:5px; float:left;width:`+300+`px; height:`+320+`px; margin-top:`+50+`px;margin-left:`+50+`px;border:1px solid #CCCCCC;"><img src=`+fullPart+` alt="image" style="width:`+200+`px; height:`+230+`px; margin-left:`+50+`px; margin-top:`+20+`px; border-radius: 5px"><br><br><button style="border-radius: 20px; border: black solid 1px; margin-left: 70px; width: 150px; height: 30px; background-color: #87d0de"><b>More</b></button> </div>`);
                            e.attr('id', 'carId');
                            $('#vehicleFeed').append(e);



                        // var car = {
                        //     rN : c.regNo,
                        //     bran : c.brand,
                        //     co : c.color,
                        //     i1 : c.imageOne,
                        //     i2 : c.imageTwo,
                        //     i3 : c.imageThree,
                        //     i4 : c.imageFour,
                        //     i5 : c.imageFive,
                        //     b : c.isAvailable,
                        //     d : c.availableD,
                        //     tType : c.transmissionType,
                        //     fType : c.fuelType,
                        //     cEx : c.chargeForExtraKm,
                        //     dr : c.dailyRate,
                        //     mR : c.monthlyRate
                        // }

                    }
                }
            });

        }