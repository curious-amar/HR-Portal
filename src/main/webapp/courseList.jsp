<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.Model.CourseModel ,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>CourseList
</title>
</head>
<body>
	<h3 style="margin-left:15%;margin-bottom:5%">Course List</h3>
	<div class="container">
		<div class="row">
		
		<div class="col-sm-12">
		
		<table class="table table-striped" >
		<% List <CourseModel> course1=(List<CourseModel>) session.getAttribute("course1"); %>
		<thead>
		<tr>  
		
		<th> SI.NO</th>
		<th> Course Name</th>
		<th> Course fee</th>
		<th> Course Duration</th>
		<th>Location</th>
		<th> Update</th>
		</tr>
		
		</thead>
		<tbody>
		<% if(course1!=null){%>
			<%! int a=10; %>
		<% for(CourseModel course:course1){ %>
		
		<tr>
		<td><%=course.getCourse_id() %> </td>
		<td><%=course.getCourse_name() %></td>
		<td><%=course.getFee() %> </td>
		<td><%=course.getDuration() %> </td>
		<td><%=course.getLocation() %> </td>
		<td>
<!-- 		<form action="editCourseServlet?course_id=course.getCourse_id()" method="get">
		<button class="btn btn-success" type="submit">Edit</button> 
		</form> -->
		<%System.out.println(course.getCourse_id()+"jsp id"); %>
		<a href="editCourseServlet?course_id=<%=course.getCourse_id() %>">edit</a>
		<%-- <a href="deleterowstudent?id=<%=fo.getId() %>">delete</a> </td> --%>
		</td>
		<td>
	<!-- 	<form action="editCourseServlet?id=course.getCourse_id()" method="get">
		<button class="btn btn-primary" type="submit">Status</button> 
		</form> -->
		</td>
		</tr>
		<%}
	} %>			
		</tbody>
		
		</table>
	
		</div>
		</div>
	</div>

</body>
</html>