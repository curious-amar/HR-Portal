<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<title>WebApp</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<style>
</style>
</head>


<body>

	<div class="container">
		<div class="row" style="margin-top: 10%;">
			<h3 style="text-align:center; margin-bottom:2%" > Registration </h3>
				
					<div class="col-md-3" >
						<a href="./Admin.jsp" style="float: center" class="btn btn-primary"
							role="button">Register For Admin</a>

					</div>
					<div class="col-md-3">
						<a href="./course.jsp" style="float: center"
						class="btn btn-primary" role="button">Register For Course</a>

					</div>
					<div class="col-md-3">
						<a href="./Faculty.jsp" style="float: center"
						class="btn btn-primary" role="button">Register For Faculty</a>


					</div>
					<div class="col-md-3">
						<a href="./studentpage.jsp" style="float: center"
						class="btn btn-primary" role="button">Register For Student</a>
					</div>
				</div>
			
			
				<div class="row" style="margin-top: 5%;" >
				<h3 style="text-align:center; margin-bottom:2%"> List Of Data </h3>
					<div class="col-md-3">
						<!-- <a href="#" style="float: center" class="btn btn-primary"
							role="button">list Of Admin</a> -->
							<form>
							<button type="submit" action="ListOfAdmin_servlet" 
							class="btn btn-primary">Admin List</button>
							</form>
					</div>
					<div class="col-md-3">
						<!-- <a href="#" style="float: center" class="btn btn-primary"
							role="button">list of Course</a> -->
							<form method="post"  action="ListOfCourse_servlet">
							<button  type="submit"  
							class="btn btn-primary">Course List</button>
							</form>
					</div>
					
					<div class="col-md-3">
					<!-- 	<a href="#" style="float: center" class="btn btn-primary"
							role="button">list Of Student</a> -->
							<form>
							
							<button type="submit" action="ListOfStudent_servlet" class="btn btn-primary">Student List</button>
							</form>
					</div>
				</div>
		
	
		
		
	</div>
</body>

</html>