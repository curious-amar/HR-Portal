package com.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.DAO.CourseDAO;
import com.Model.CourseModel;



@WebServlet("/courseServlet")

public class CourseControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String course_name= request.getParameter("courseName");
		int course_fee =Integer.parseInt(request.getParameter("courseFee"));
		int course_duration =Integer.parseInt(request.getParameter("courseDuration"));
		
		String location= request.getParameter("location");  
	
		System.out.println(course_duration);
		
		CourseModel cm =new CourseModel();
		cm.setCourse_name(course_name);
		cm.setDuration(course_duration);
		cm.setFee(course_fee);
		cm.setLocation(location);	
		System.out.println();
		
		CourseDAO cd=new CourseDAO();
		String status=	cd.insertCourse(cm);
		
		System.out.println("above success"+status);
		if(status.equals("success")){
		RequestDispatcher rd=	request.getRequestDispatcher("submit.jsp");
			rd.include(request, response);
			
		}
		
		else {
		RequestDispatcher rd=	request.getRequestDispatcher("course.jsp");
		rd.include(request, response);
			
		}
		
		
		
	}

}
