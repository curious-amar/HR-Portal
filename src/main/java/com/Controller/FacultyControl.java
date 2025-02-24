package com.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;

import com.DAO.FacultyDAO;
import com.Model.FacultyModel;



@WebServlet("/facultyservlet")
public class FacultyControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String		firstNaame	=	request.getParameter("firstName");
	String		lastName	=	request.getParameter("lastName");
	String		email		=	request.getParameter("email");
	long		pNumber		=	Long.parseLong(request.getParameter("pNumber"));
	String		gender		=	request.getParameter("gender");
	String		qualif		=	request.getParameter("qualif");
	int			yOexp		=	Integer.parseInt(request.getParameter("yOexp"));
	String		skill		=	request.getParameter("skill");
	int		course		=		Integer.parseInt(request.getParameter("course"));
	String		userid		=	request.getParameter("userid");
	String		password	=	request.getParameter("password");
	String		status		=	request.getParameter("status");
	
	FacultyModel fm =new FacultyModel();
	fm.setFirstName(firstNaame);
	fm.setLastName(lastName);
	fm.setE_mail(email);
	fm.setPh_num(pNumber);
	fm.setGender(gender);
	fm.setQualification(qualif);
	fm.setExperience(yOexp);
	fm.setSkills(skill);
	fm.setCourseid(course);
	fm.setStatus(status);
	fm.setUser_id(userid);
	fm.setPassword(password);
	
	FacultyDAO fd=new FacultyDAO();
	String stat_us=	fd.insertFaculty(fm);
	
	if(stat_us.equals("success")) {
	RequestDispatcher rd=	request.getRequestDispatcher("submit.jsp");
	rd.include(request, response);
	
	
	}
	else {
		RequestDispatcher rd=	request.getRequestDispatcher("Faculty.jsp");
		rd.include(request, response);
	}
	
	}

}
