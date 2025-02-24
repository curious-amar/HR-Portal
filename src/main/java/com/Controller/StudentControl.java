package com.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.DAO.StudentDAO;
import com.Model.StudentModel;


@WebServlet("/studentServlet")
public class StudentControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String firstName		=	request.getParameter("firstName");
	String lastName	=	request.getParameter("lastName");
	 String email  =	request.getParameter("email");
	 long	phNumber=	Long.parseLong(request.getParameter("phNumber"));
		String	gender=	request.getParameter("");
	String	qualifi	=	request.getParameter("qualifi");
	int 		PoY=	Integer.parseInt(request.getParameter("PoY" ))	;
	String	courseName	=	request.getParameter("courseName");
	int	duration	=	Integer.parseInt(request.getParameter("duration"));	
	String userid	=	request.getParameter("userid");
	String		password=	request.getParameter("password");
	String status		=	request.getParameter("status");
	
	StudentModel sm=new StudentModel();
	sm.setFirstName(firstName);
	sm.setLastName(lastName);
	sm.setE_mail(email);
	sm.setPh_num(phNumber);
	sm.setGender(gender);
	sm.setQualifi(qualifi);
	sm.setPassOutYear(PoY);
	sm.setCourseid(courseName);
	sm.setCo_duration(duration);
	sm.setUser_id(userid);
	sm.setPassword(password);
	sm.setStatus(status);
	
	StudentDAO sd=new StudentDAO();
	String stat_us= sd.insertStudent(sm);
	
	if(stat_us.equals("success")) {
	RequestDispatcher rd=	request.getRequestDispatcher("submit.jsp");
		rd.include(request, response);
	}
	else {
		RequestDispatcher rd= request.getRequestDispatcher("studentpage.jsp");
		rd.include(request, response);
	}
			
	}

}
