package com.Controller;

import java.io.IOException;
import java.util.List;

import com.DAO.CourseDAO;
import com.Model.CourseModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/editCourseServlet")
public class editCourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			
		
	String  edit1	=request.getParameter("course_id");
	System.out.println("courseId is "+edit1);
	int intId	=	Integer.parseInt(edit1);
		
		CourseModel cm=new CourseModel(intId);
		
		CourseDAO cd=new CourseDAO();
		
		List<CourseModel> cod =cd.selectCourseById(cm);
		
				HttpSession	session=request.getSession();
				session.setAttribute("sess1", cod);
		System.out.println("before edit dispatcher");
		RequestDispatcher rd=request.getRequestDispatcher("/editCourse.jsp");
		rd.forward(request, response);
		
	}
}
