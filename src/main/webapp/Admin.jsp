<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" />
    <title> Admin</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<style>


</style>
</head>

<body>
    <div class="container">
        <form class="form-group" action="AdminServlet" method="post" onsubmit="return formact()"
            style="width:80%">
            <div class="row">
                <div class="col-sm-12">
                    <h4 style="margin: 5% 0 0 0;">Admin Registration</h4>
                </div>
            </div>
            <div class="row">

                <div class="col-sm-6">

                    <input class="form-control" name="firstName" type="text" id="fname" placeholder="First Name"
                        style="margin: 5% 0 0 0;width:60%">
                      
                </div>
                <div class="col-sm-6">
                    <input class="form-control"  name="lastName" type="text" id="lname" placeholder="Last Name"
                        style="margin: 5% 0 0 0;width:60%" required>
                          <p id="namepara"> </p>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <input class="form-control" name="email" type="email" id="mailid" 
                    placeholder="E-mail" style="margin: 5% 0 0 0;width:60%">
                </div>
                <div class="col-sm-6">
                    <input class="form-control" name="phoneN" type="text" maxlength="10" id="phid" 
                    placeholder="Phone Number" style="margin: 5% 0 0 0; width:60%;">
                   <p id="numid"></p> 
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">

                    <label name="gender" style="margin: 5% 0 0 0;"> Gender</label>
                    <div class="form-check">

                        <input type="radio" class="form-check-input" id="m2" name="gender" value="female" required>
                         Female <label for="m1" style="margin: 0% 10% 0 0;"> </label>

                        <input type="radio" class="form-check-input" id="m3" name="gender" value="male" required>
                        Male  <label for="m1" style="margin: 0% 10% 0 0;"> </label>

                        <input type="radio" class="form-check-input" id="m4" name="gender" value="other" required>
                         Others  <label for="m1" style="margin: 0% 10% 0 0;"> </label>

                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <input class="form-control" name="Qualif" type="text" id="Qid" placeholder="Qualification"
                        style="margin: 5% 0 0 0;width:60% ;" required>
                      
                </div>
                <div class="col-sm-6">
                    <input class="form-control"name="yearOfExp" type="text" id="YoEid" maxlength="2" placeholder="Year of Experience"
                        style="margin: 5% 0 0 0;width:60%;" required>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <input class="form-control" name="skill" type="text" id="skillid"  placeholder="Skills"
                        style="margin: 5% 0 0 0;width:60%" required>
                        
                </div>

            </div>
            <div class="row">
                <div class="col-sm-6">
                    <input class="form-control" name="userid" type="text" id="userid" placeholder="Create User Id"
                        style="margin: 5% 0 0 0;width:60%" required>
                </div>
                <div class="col-sm-6">
                     <select name="status"  style="margin: 5% 0 0 0;width:60%" class="form-select size" id="coursedu" required>
                        <option selected> Select Status</option>
                        <option value="1">Active</option>
                        <option value="2">Deactive</option>
                    </select>
                        
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">

                    <input class="form-control" type="text" width="60%" id="creid" placeholder="Create Password"
                        style="margin: 5% 0 0 0;width:60%" onblur="passBlur()" required>

                </div>
                <div class="col-sm-6">
                    <input class="form-control" name="password" type="text" id="conid" onblur="passBlur()"
                        placeholder="Confirm Password" style="margin: 5% 0 0 0;width:60%;" required>
                    <p id="conpassw1"> </p>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-success" style="margin:5% 0% 0% 0%">Submit </button>
                    <p id="para1ht"> </p>
                </div>
            </div>
        </form>
    </div>

    <script>

        function formact() {
            var f_name = document.getElementById("fname").value;
            var l_name = document.getElementById("lname").value;
            var mail_id = document.getElementById("mailid").value;
            var ph_id = document.getElementById("phid").value;
            var rad_id = document.getElementById("m2").value;
            var dre_id = document.getElementById("dreid").value;
            var poy_id = document.getElementById("poyid").value;
            var cod_id = document.getElementById("codid").value;


            if (f_name == "" || l_name == "" || mail_id == "" || ph_id == "" || dre_id == "" || poy_id == "" || cod_id == "") {
                document.getElementById("para1ht").innerHTML = "Enter All Fields";
                return false;
            }
            else {
                return true;
            }
        }

        function passBlur() {
            var user_id = document.getElementById("userid").value;
            var cre_pwd = document.getElementById("creid").value;
            var con_pwd = document.getElementById("conid").value;

            if (cre_pwd !== con_pwd) {
                document.getElementById("conpassw1").innerHTML = "password does not match";
                document.getElementById("conpassw1").style.color = "red";
            }
            else{
            	document.getElementById("conpassw1").innerHTML = "";
            }


        }



        document.getElementById("phid").addEventListener("keypress", func1);
        document.getElementById("YoEid").addEventListener("keypress", func1);
        
        function func1(event) {

            var ch = event.which
		//allow numbers
            if (!((ch >= 48 && ch <= 57) || (ch == 8) || (ch == 0))) {
            	
                event.preventDefault("numid").innerHTML;
            }
        }

        document.getElementById("fname").addEventListener("keypress", func2);
        document.getElementById("lname").addEventListener("keypress", func2);
        document.getElementById("Qid").addEventListener("keypress", func2);
        document.getElementById("skillid").addEventListener("keypress", func2);
        document.getElementById("statusid").addEventListener("keypress", func2);

        function func2(event) {
            var ch = event.which
		//allow letters
            if (!((ch >= 65 && ch <= 90) ||(ch>=97 && ch<=122) || (ch == 8) || (ch==32) )) {
                event.preventDefault("namepara").innerHTML;
            }
        }


    </script>

</body>

</html>