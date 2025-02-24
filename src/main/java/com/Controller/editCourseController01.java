package com.Controller;

import java.io.IOException;

import com.DAO.CourseDAO;
import com.Model.CourseModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/courseUpdate01")
public class editCourseController01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String courseId01 = request.getParameter("courseId");
		int courseId02 = Integer.parseInt(courseId01);
		String courseName01 = request.getParameter("courseName");
		String courseDuration01 = request.getParameter("courseDuration");
		int courseDuration02 = Integer.parseInt(courseDuration01);
		String courseFee01 = request.getParameter("courseFee");
		int courseFee02 = Integer.parseInt(courseFee01);
		String location01 = request.getParameter("location");

		CourseModel cm = new CourseModel();
		cm.setCourse_id(courseId02);
		cm.setCourse_name(courseName01);
		cm.setDuration(courseDuration02);
		cm.setFee(courseFee02);
		cm.setLocation(location01);
		CourseDAO cd = new CourseDAO();
		boolean status = false;
		status = cd.courseUpdate(cm);

		if (status) {
			RequestDispatcher rd = request.getRequestDispatcher("ListOfCourse_servlet");
			rd.include(request, response);
		}

	}

}
