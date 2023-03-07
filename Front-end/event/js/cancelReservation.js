
    let baseURL = "http://localhost:8080/app/";

loadAllMessages();


// ========= load messages ==================
//when clicking btn load data from two tablles


function loadAllMessages(){
    $.ajax({
        url: baseURL+'cancelRequest',
        method: 'get',
        dataType: "json",
        success: function (resp) {
            for (let c of resp.data) {
                let regNo = c.vehiNo;
                let rDate = "2023-00-11";
                let rStatus = "Not Approved";
                let rMessage = c.message;




                var row = "<tr class='nr'><td style='background-color: rgba(250,11,34,0.25)'>" + regNo + "</td><td style='background-color: rgba(8,45,229,0.25)'>" + rDate + "</td><td style='background-color: rgba(95,250,11,0.25)'>" + rStatus + "</td><td style='background-color: rgba(250,182,11,0.25)'>" + rMessage + "</td></tr>";
                $("#messageTable").append(row);
            }
        }

    });
}