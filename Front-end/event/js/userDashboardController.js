

        let baseURL = "http://localhost:8080/app/";


loadAllCars();



$("#searchBtn").click(function(){

});



// ============================ load all Cars on feed ===============================

        var idCount = 1;

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



                        var perPart = "../../event/images/cars/";
                        var lastPartOne = iOne.substring(12,21);
                        var lastPartTwo = iTwo.substring(12,21);
                        var lastPartThree = iThree.substring(12,21);
                        var lastPartFour = iFour.substring(12,21);
                        var lastPartFive = iFive.substring(12,21);
                        var fullPartOne = perPart+lastPartOne;
                        var fullPartTwo = perPart+lastPartTwo;
                        var fullPartThree = perPart+lastPartThree;
                        var fullPartFour = perPart+lastPartFour;
                        var fullPartFive = perPart+lastPartFive;
                        console.log("id Count"+idCount);

                            var e = $(`<div style="display:block; background-color: rgba(16,0,3,0.25); border-radius:5px; float:left;width:`+375+`px; height:`+320+`px; margin-top:`+50+`px;margin-left:`+50+`px;border:1px solid #CCCCCC;"><img src=`+fullPartOne+` alt="image" style="width:`+350+`px; height:`+230+`px; margin-left:`+13+`px; margin-top:`+20+`px; border-radius: 5px"><br><br><button style="border-radius: 20px; border: black solid 1px; margin-left: 100px; width: 150px; height: 30px; background-color: #87d0de"><b>More</b></button><h5 style="display: none">`+idCount+`</h5> </div>`);
                            e.attr('id', idCount);
                            $('#vehicleFeed').append(e);
                            idCount++;



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
                    bindDiv();

                }
            });

        }

 // ======================== check details ========================================

function bindDiv(){
    $("#vehicleFeed > div").click(function(){
        let rows = $(this).find("h5").text()
        // let rows = $(this).closest("h5").text();
        console.log("clicked");
        console.log(rows);
    })
}



      // function checkMoreDetails() {
      //     //set id
      //       $("#1").click(function(){
      //
      //         Swal.fire({
      //             title: '<img src='+fullPartTwo+' width="200px" height="200px"> <img src='+fullPartThree+' width="200px" height="200px"> <img src='+fullPartFour+' width="200px" height="200px"> <img src='+fullPartFive+' width="200px" height="200px">',
      //             html:
      //                 'Transition : <b>'+tr+'</b> <br> Fuel : <b>'+fType+'</b> <br> Daily : <b>'+dRate+'</b> <br> Monthly : <b>'+mRate+'</b> <br> Extra KM : <b>'+exKM+'</b>',
      //
      //             showCloseButton: true,
      //             focusConfirm: false,
      //             confirmButtonText:
      //                 '<i class="fa-sharp fa-solid fa-cart-shopping"></i> BUY',
      //             confirmButtonAriaLabel: 'Thumbs up, great!',
      //
      //         })
      //
      //     });
      // }