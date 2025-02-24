<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" />
    <title>student page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<style>
    .size {
        margin-top: 5%;
        width: 60%;
    }
</style>

<body>
    <div class="container">
        <form class="form-group" action="../password_beg.html" method="post" onsubmit="return formact()"
            style="width:80%">
            <div class="row">
                <div class="col-sm-12">
                    <h4 style="margin: 5% 0 0 0;">Student Registration</h4>
                </div>
            </div>
            <div class="row">

                <div class="col-sm-6">

                    <input class="form-control size" type="text" id="fname" placeholder="First Name" required>
                </div>
                <div class="col-sm-6">
                    <input class="form-control size" type="text" id="lname" placeholder="Last Name" required>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <input class="form-control size" type="email" id="mailid" placeholder="E-mail">
                </div>
                <div class="col-sm-6">
                    <input class="form-control size" type="text" maxlength="10" id="phid" placeholder="Phone Number">
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">

                    <label style="margin: 5% 0 0 0;"> Gender</label>
                    <div class="form-check ">

                        <input type="radio" class="form-check-input" id="m2" name="mn2" required>
                        <label for="m1" style="margin: 0% 10% 0 0;"> Female</label>

                        <input type="radio" class="form-check-input" id="m3" name="mn2" required>
                        <label for="m1" style="margin: 0% 10% 0 0;"> Male</label>

                        <input type="radio" class="form-check-input" id="m3" name="mn2" required>
                        <label for="m1"> Others</label>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <input class="form-control size" type="text" id="dreid" placeholder="Degree">
                </div>
                <div class="col-sm-6">
                    <input class="form-control size" type="text" id="poyid" maxlength="4" placeholder="Passed Out Year">
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <select name="course1" class="form-select size" id="coursena" required>
                        <option value="" selected> Select Course</option>
                        <option value="1"> Java Full Stack</option>
                        <option value="2"> Python Full Stack</option>
                        <option value="3"> Testing Tools</option>
                        <option value="4"> DeVops</option>
                    </select>
                </div>
                <div class="col-sm-6">
                    <select name="course1" class="form-select size" id="coursedu" required>
                        <option selected> Select Duration</option>
                        <option value="6"> 6 months</option>
                        <option value="8"> 8 months</option>
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <input class="form-control size" type="text" id="creUserid" placeholder="Create User Id" required>
                </div>
                <div class="col-sm-6">

                    <select name="course1" class="form-select size" id="coursedu" required>
                        <option selected> Select Status</option>
                        <option value="1">Active</option>
                        <option value="2">Deactive</option>
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">

                    <input class="form-control size" type="text" id="crePassid" placeholder="Create Password" required>
                </div>
                <div class="col-sm-6">
                    <input class="form-control size" type="text" id="poyid" placeholder="Confirm Password" required>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-success" style="margin:5% 0% 0% 0%;width: 20%;">Submit
                    </button>
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

        document.getElementById("phid").addEventListener("keypress", func1);
        document.getElementById("poyid").addEventListener("keypress", func1);

        function func1(event) {

            var ch = event.which
            // allow numbers
            if (!((ch >= 48 && ch <= 57) || (ch == 8) || (ch == 0))) {
                event.preventDefault();
            }

        }

        document.getElementById("fname").addEventListener("keypress", func2);
        document.getElementById("lname").addEventListener("keypress", func2);
        document.getElementById("dreid").addEventListener("keypress", func2);



        function func2(event) {
            var ch = event.which
            //allow letters
            if (((ch >= 48 && ch <= 57) || (ch == 8) || (ch == 0))) {
                event.preventDefault();
            }


        }




    </script>
</body>

</html>