<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" />
    <title>vcube</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<style>

    * {
        padding: 0%;
    }
</style>

<body>
    <script>
        function usercontrol() {
            var user_input = document.getElementById("userid").value;
            var user_pswd = document.getElementById("userpswd").value;
            var role=document.getElementById("role").value;
			console.log(user_input);
            if (user_input == "" || user_pswd == "" ) {
                document.getElementById("para1ht").innerHTML = "Enter All Fields";
                document.getElementById("para1ht").style.color = "red";
                return false;
            }

            else {
                return true;
            }
        }
    </script>

    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-4">

            </div>
            <div class="col-sm-4">
                <form class="form-group" action="IndexServlet" method="post"
                    onsubmit="return usercontrol()">
                    
                    <div class="row">
                        <h3 style="margin: 5% 0 0 0;">login</h3>
                        
                        <div class="row">
                        <div class="col-sm-12">
                            
                            <select name="role" id="role" class="form-select"  style="width:60%;
                            margin-top:5%"  required>
                                <option  selected value=""> Select Role</option>
                                <option value="admin">Admin </option>
                                <option value="faculty"> Faculty</option>
                                <option value="student">Student</option>
                            </select>
                        </div>
                    </div>
                        <div class="col-sm-12">
                            <input class="form-control" type="text" name="userid" id="userid" onfocus="focususer()"
                                placeholder="user id" style="margin:10% 0% 5% 0%;width: 60%;">

                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <input class="form-control" type="text" name="password" id="userpswd" placeholder="password"
                                style="width: 60%;">
                        </div>
                    </div>

                    
                    <div class="row">
                        <div class="col-sm-12">
                            <button type="submit" class="btn btn-success" style="margin:10% 0% 0% 0%">login </button>
                            <p id="para1ht"> </p>
                        </div>
                    </div>

                </form>
            </div>
            <div class="col-sm-4">

            </div>
        </div>
    </div>

</body>

</html>