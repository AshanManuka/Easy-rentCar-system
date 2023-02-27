
let baseURL="http://localhost:8080/app/";



$("#twologinBtn").click(function(){

    let cusName = $("#twotxtCusName").val();
    let cusNic = $("#twotxtmail").val();
    let cusAddress = $("#twotxtPassword").val();


    var driver = {
        nic : cusNic,
        name : cusName,
        address : cusAddress
    }

    console.log(driver);
    $.ajax({
        url: baseURL+'driver',
        method: 'post',
        contentType:"application/json",
        data:JSON.stringify(driver),
        dataType:"json",
        success: function (res) {
            alert(res.message);
        },
        error:function (error){
            let cause= JSON.parse(error.responseText).message;
            alert(cause);
        }

    });

});