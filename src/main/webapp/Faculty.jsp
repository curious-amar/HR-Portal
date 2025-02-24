<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" />
    <title>Faculty Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        .form-container {
            margin-top: 5%;
            width: 60%;
        }

        .form-control {
            margin-bottom: 20px;
        }

        .form-title {
            text-align: center;
            margin-bottom: 20px;
            font-weight: bold;
            font-size: 24px;
        }

        .form-label {
            margin-bottom: 10px;
        }

        .gender-options {
            display: flex;
            gap: 20px;
        }

        .btn-submit {
            width: 100%;
            margin-top: 20px;
        }

        .error-text {
            color: red;
        }

        @media (max-width: 768px) {
            .form-container {
                width: 90%;
            }
        }
    </style>
</head>

<body>
    <div class="container form-container">
        <h4 class="form-title">Faculty Registration</h4>
        <form class="form-group" action="facultyservlet" method="post" onsubmit="return formact()">
            <div class="row">
                <div class="col-md-6">
                    <label for="fname" class="form-label">First Name</label>
                    <input class="form-control" name="firstName" type="text" id="fname" placeholder="First Name" required>
                    <p id="namepara" class="error-text"></p>
                </div>
                <div class="col-md-6">
                    <label for="lname" class="form-label">Last Name</label>
                    <input class="form-control" name="lastName" type="text" id="lname" placeholder="Last Name" required>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <label for="mailid" class="form-label">Email</label>
                    <input class="form-control" name="email" type="email" id="mailid" placeholder="E-mail">
                </div>
                <div class="col-md-6">
                    <label for="phid" class="form-label">Phone Number</label>
                    <input class="form-control" name="pNumber" type="text" maxlength="10" id="phid" placeholder="Phone Number">
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <label class="form-label">Gender</label>
                    <div class="gender-options">
                        <div class="form-check">
                            <input type="radio" class="form-check-input" id="m2" name="gender" value="female" required>Female
                        </div>
                        <div class="form-check">
                            <input type="radio" class="form-check-input" id="m3" name="gender" value="male" required>Male
                        </div>
                        <div class="form-check">
                            <input type="radio" class="form-check-input" id="m4" name="gender" value="others" required>Others
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <label for="dreid" class="form-label">Qualification</label>
                    <input class="form-control" name="qualif" type="text" id="dreid" placeholder="Qualification">
                </div>
                <div class="col-md-6">
                    <label for="poyid" class="form-label">Year of Experience</label>
                    <input class="form-control" name="yOexp" type="text" id="poyid" maxlength="2" placeholder="Year of Experience">
                    <p id="numid" class="error-text"></p>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <label for="skillid" class="form-label">Skills</label>
                    <input class="form-control" name="skill" type="text" id="skillid" placeholder="Skills">
                </div>
                <div class="col-md-6">
                    <label for="coursena" class="form-label">Course</label>
                    <select name="course" class="form-select" id="coursena" required>
                        <option value="" selected>Select Course</option>
                        <option value="1">Java Full Stack</option>
                        <option value="2">Python Full Stack</option>
                        <option value="3">Testing Tools</option>
                        <option value="4">DevOps</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <label for="userid" class="form-label">Create User ID</label>
                    <input class="form-control" name="userid" type="text" id="userid" placeholder="Create User ID" required>
                </div>
                <div class="col-md-6">
                    <label for="coursedu" class="form-label">Status</label>
                    <select name="status" class="form-select" id="coursedu" required>
                        <option selected>Select Status</option>
                        <option value="active">Active</option>
                        <option value="inactive">inactive</option>
                    </select>
                </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <label for="creid" class="form-label">Create Password</label>
                    <input class="form-control" type="password" id="creid" placeholder="Create Password" onblur="passBlur()" required>
                </div>
                <div class="col-md-6">
                    <label for="conid" class="form-label">Confirm Password</label>
                    <input class="form-control" name="password" type="password" id="conid" placeholder="Confirm Password" onfocus="passBlur()" required>
                    <p id="conpassw1" class="error-text"></p>
                </div>
            </div>

            <button type="submit" class="btn btn-success btn-submit">Submit</button>
            <p id="para1ht" class="error-text"></p>
        </form>
    </div>

    <script>
        function formact() {
            var f_name = document.getElementById("fname").value;
            var l_name = document.getElementById("lname").value;
            var mail_id = document.getElementById("mailid").value;
            var ph_id = document.getElementById("phid").value;
            var dre_id = document.getElementById("dreid").value;
            var poy_id = document.getElementById("poyid").value;

            if (f_name == "" || l_name == "" || mail_id == "" || ph_id == "" || dre_id == "" || poy_id == "") {
                document.getElementById("para1ht").innerHTML = "Please fill in all required fields.";
                return false;
            } else {
                return true;
            }
        }

        function passBlur() {
            var cre_pwd = document.getElementById("creid").value;
            var con_pwd = document.getElementById("conid").value;

            if (cre_pwd !== con_pwd) {
                document.getElementById("conpassw1").innerHTML = "Password does not match.";
            } else {
                document.getElementById("conpassw1").innerHTML = "";
            }
        }

        document.getElementById("phid").addEventListener("keypress", restrictNumbers);
        document.getElementById("poyid").addEventListener("keypress", restrictNumbers);
        document.getElementById("fname").addEventListener("keypress", restrictChars);
        document.getElementById("lname").addEventListener("keypress", restrictChars);
        document.getElementById("dreid").addEventListener("keypress", restrictChars);
        document.getElementById("skillid").addEventListener("keypress", restrictChars);

        function restrictNumbers(event) {
            var ch = event.which;
            if (!((ch >= 48 && ch <= 57) || ch == 8)) {
                event.preventDefault();
            }
        }

        function restrictChars(event) {
            var ch = event.which;
            if (!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || ch == 8 || ch == 32)) {
                event.preventDefault();
            }
        }
    </script>
</body>

</html>
