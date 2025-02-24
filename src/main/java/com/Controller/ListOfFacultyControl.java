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

import com.DAO.FacultyDAO;
import com.Model.FacultyModel;


@WebServlet("/listofFacultyServlet")
public class ListOfFacultyControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FacultyDAO facultyD=new FacultyDAO();
	 	List<FacultyModel>  facultyList =facultyD.selectAllFaculty();
		
	 	HttpSession session=request.getSession();
		session.setAttribute("Faculty", facultyList);
	 	
	RequestDispatcher rd =request.getRequestDispatcher("facultyList.jsp");
	rd.include(request,response);
	
	}
}
