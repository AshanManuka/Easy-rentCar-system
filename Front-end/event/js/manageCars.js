
let baseURL="http://localhost:8080/app/";


var updateId;
var transition;
var fType;
var passengerNo;
var iOne;
var iTwo;
var iThree;
var iFour;
var iFive;

//loadData();



// =======================select from boxes===================
$('#transition').on('change', function() {
   transition = $(this).val();
});

$('#fuel').on('change', function() {
    fType = $(this).val();
});

$('#passenger').on('change', function() {
    passengerNo = $(this).val();
});



// ============================= Get Images =========================
var count = 1;
$("#imgs").click(function(){
    if (count === 2){
        iOne = $("#imgs").val();
    }else if(count === 3){
        iTwo = $("#imgs").val();
    }else if(count === 4){
        iThree = $("#imgs").val();
    }else if(count === 5){
        iFour = $("#imgs").val();
    }
    count++;
});




// =============== save car ====================
$("#saveBtn").click(function(){
    iFive = $("#imgs").val();
     saveCar();
});

function saveCar(){
    let cBrand = $("#brand").val();
    let cRegId = $("#regId").val();
    let cType = $("#type").val();
    let cColor = $("#color").val();
    let cDReate = $("#DRate").val();
    let cMReate = $("#MRate").val();
    let cExPrice = $("#exPrice").val();



    var vehicle = {
        regNo : cRegId,
        brand : cBrand,
        color : cColor,
        imgOne : iOne,
        imgTwo : iTwo,
        imgThree : iThree,
        imgFour : iFour,
        imgFive : iFive,
        isAvailable : true,
        availableDate : "anyDay",
        transmissionType : transition,
        fuelType : fType,
        chargeForExtraKm : cExPrice,
        dailyRate : cDReate,
        monthlyRate : cMReate
    }

    console.log(vehicle);

    $.ajax({
        url: baseURL+'car',
        method: 'post',
        contentType:"application/json",
        data:JSON.stringify(vehicle),
        dataType:"json",
        success: function (res) {
            alert(res.message);
            //loadData();
        },
        error:function (error){
            let cause= JSON.parse(error.responseText).message;
            alert(cause);
        }

    });
}