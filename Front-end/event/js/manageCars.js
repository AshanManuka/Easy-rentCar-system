
let baseURL="http://localhost:8080/app/";



var transition;
var fType;
var passengerNo;
var iOne;
var iTwo;
var iThree;
var iFour;
var iFive;
var selectedCar;
var carList = [];

loadAllCars();
loadRegNumbers();


// ==============load data to box============================
function loadRegNumbers(){
    $("#regIdBox").empty();

    $.ajax({
        url: baseURL+'car',
        method: 'get',
        dataType: "json",
        success: function (resp) {
            for (let car of resp.data) {
                $("#regIdBox").append(`<option>${car.regNo}</option>`);
            }
        }
    });
}


// ===================load all Class ==========================
    function loadAllCars(){
        $.ajax({
            url: baseURL+'car',
            method: 'get',
            dataType: "json",
            success: function (resp) {
                for (let c of resp.data) {
                    let rNo = c.regNo;
                    let br = c.brand;
                    let col = c.color;
                    let dRate = c.dailyRate;
                    let mRate = c.monthlyRate;
                    let exKM = c.chargeForExtraKm;
                    let tr = c.transmissionType;
                    let fType = c.fuelType;

                    var row = "<tr><td>" + rNo + "</td><td>" + br + "</td><td>" + "Car" + "</td><td>" + col + "</td><td>" + dRate + "</td><td>" + mRate + "</td><td>" + exKM + "</td><td>" + tr + "</td><td>" + fType + "</td><td>" + "00" + "</td><td>" + `<button value="sample" style="border-radius: 50px; border: #b6d4fe 2px black"><i class="fa-solid fa-trash"></i></button>` + "</td></tr>";
                    $("#carTable").append(row);

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

$('#regIdBox').on('change', function() {
    selectedCar = $(this).val();
    loadDataToField();
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
        imageOne : iOne,
        imageTwo : iTwo,
        imageThree : iThree,
        imageFour : iFour,
        imageFive : iFive,
        isAvailable : true,
        availableD : "2022",
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
        },
        error:function (error){
            let cause= JSON.parse(error.responseText).message;
            alert(cause);
        }
    });

    location.reload();
}

// ==================== load data to Field =======================

function loadDataToField(){
    for (let i = 0; i < carList.length; i++ ){
        tempCar = carList[i];
        if(tempCar.rN === selectedCar){
            $("#brand").val(tempCar.bran);
            $("#regId").val(tempCar.rN);
            $("#color").val(tempCar.co);
            $("#type").val("Seydan");
            $("#DRate").val(tempCar.dr);
            $("#MRate").val(tempCar.mR);
            $("#exPrice").val(tempCar.cEx);
            $("#transition").val(tempCar.tType);
            $("#fuel").val(tempCar.fType);
            $("#passenger").val("5");

        }
    }
}


// ==================== update details ===========================
$("#updateBtn").click(function(){




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
    imageOne : iOne,
    imageTwo : iTwo,
    imageThree : iThree,
    imageFour : iFour,
    imageFive : iFive,
    isAvailable : true,
    availableD : "2022",
    transmissionType : transition,
    fuelType : fType,
    chargeForExtraKm : cExPrice,
    dailyRate : cDReate,
    monthlyRate : cMReate
}

    $.ajax({
        url: baseURL+'car',
        method: 'put',
        contentType:"application/json",
        data:JSON.stringify(vehicle),
        dataType:"json",
        success: function (res) {
            alert(res.message);
        },
        error:function (error){
            let cause= JSON.parse(error.responseText).message;
            alert(cause);
        }

    });

    location.reload()

});