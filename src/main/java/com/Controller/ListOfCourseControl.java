package com.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.DAO.CourseDAO;
import com.Model.CourseModel;



@WebServlet("/ListOfCourse_servlet")
public class ListOfCourseControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("do Post");
		
		CourseDAO cm=new CourseDAO();
		List<CourseModel> course= cm.selectAllCourse();
		System.out.println();
		
		
		HttpSession session=request.getSession();
		session.setAttribute("course1", course);
		for(CourseModel co:course) {
			System.out.println(co);
		}
		
		
		RequestDispatcher rd= request.getRequestDispatcher("courseList.jsp");
		rd.include(request, response);
	}

}
