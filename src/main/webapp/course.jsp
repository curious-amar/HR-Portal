
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" />
    <title>course </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<style >
	.size{
	margin-top:5%;
	width:60%;
	}
</style>
</head>

<body>
    <div class="container">
        <form action="courseServlet" class="form-group" style="width:80%" method="post" onsubmit="return verify()">
            <div class="row">
                <div class="col-sm-12">
                    <h4 style="margin: 5% 0 0 0;">Course Registration</h4>
                </div>
            </div>
            <div class="row" >
                <div class="col-sm-6">

                    <input class="form-control size" name="courseName" type="text"
                     id="crsID" placeholder="Course Name" required>
                     <p id="lettid"></p>
                </div>
                <div class="col-sm-6">

                    <select name="courseDuration" class="form-select size" width="60%" id="coursedu" required>
                        <option selected> Course Duration</option>
      
                        <option value="6"> 6 months</option>
                        <option value="8">8 months</option>
                    </select>
                </div>
            </div>
            <div class="row" >
                <div class="col-sm-6">
                    <input type="text" class="form-control size" maxlength=5 name="courseFee"
                     id="feeID" placeholder="Course fee" required>
                     <p id="numid"></p>
                </div>
                <div class="col-sm-6">
                    <input type="text" class="form-control size" name="location" 
                    id="locID" placeholder="Location" required>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-success" style="margin:5% 0% 0% 0%;width:20%">Submit </button>
                    <p id="para1ht"> </p>
                </div>
            </div>
        </form>

    </div>

    <script>
    
    	function verify(){
    	let c_name	=document.getElementById("crsID").value
    	let c_duration	=document.getElementById("coursedu").value	
    	let c_fee	=document.getElementById("feeID").value	
    	let c_location	=document.getElementById("locID").value	
    	
    	if(c_name==""||c_duration==""||c_fee==""||c_location==""){
    		document.getElementById("para1ht").innerHTML="Enter All Fields";
    		document.getElementById("para1ht").style.color="red";
    		return false;
    	}
    	else{
    		return true;
    	}
    	}

        document.getElementById("feeID").addEventListener("keypress", allowNum);

        function allowNum(event) {

            var ch = event.which
            if (!((ch >= 48 && ch <= 57) || (ch == 8) || (ch == 0))) {

                event.preventDefault("numid").innerHTML;
            }
        }

        document.getElementById("crsID").addEventListener("keypress", allowLett);

        function allowLett(event) {

            var ch = event.which
            
            if (!((ch >= 65 && ch <= 90) ||(ch>=97 && ch<=122) || (ch == 8) || (ch==32) )) {
                event.preventDefault("lettid").innerHTML;
            }
        }

    </script>
</body>

</html>