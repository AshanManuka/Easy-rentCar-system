
    let baseURL = "http://localhost:8080/app/";


// ================ get Data ==================
  var uName;
  var pWord;


$("#loginBtn").click(function(){
    uName = $("#txtUserName").val();
    pWord = $("#txtPassword").val();

    loadCustomers();

});



// =============== load Users ======================

  function loadCustomers(){
             $.ajax({
                 url: baseURL+'customer',
                 method: 'get',
                 dataType: "json",
                 success: function (resp) {
                     for (let c of resp.data) {
                         let cMail = c.email;
                         let cPassword = c.password;

                         if (cMail === uName && cPassword === pWord){

                             Swal.fire({
                                 position: 'bottom-end',
                                 icon: 'success',
                                 title: 'Logged In',
                                 showConfirmButton: false,
                                 timer: 1500
                             })

                             window.location.replace("userDashboard.html");


                         }

                     }
                 }
             });
         }