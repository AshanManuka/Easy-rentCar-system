

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

                        // var e = $(`<div style="display:block; background-color: #0a5766; border-radius:20px; float:left;width:`+500+`px; height:`+520+`px; margin-top:`+100+`px;margin-left:`+100+`px;border:1px solid #CCCCCC;"><div style="border-radius:10px;  background-color: #2c3034; margin-top: 50px" ><img src={iOne} alt="image" style="width : 100px; height : 100px"> </div><br><br><h1 style="margin-left: 120px; color: azure" >${br}</h1> <button style="background-color: #a52834; border-radius: 40px; width: 200px; height: 60px; margin-left: 150px; margin-bottom: 20px;" class="buyTicket" id="btnn" data-bs-target="#buy1" data-bs-toggle="modal"  type="button">Buy Ticket</button></div>`);
                        // e.attr('id', 'carId');
                        // $('#vehicleFeed').append(e);

                        var ii = "../../event/images/cars/alto2.jpg"
                        if (iOne != null){
                            var image = $('<img>').attr('src', ii);
                            $('#vehicleFeed').append(image);
                            console.log("just ok");
                        }


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