package com.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.DAO.AdminDAO;
import com.Model.AdminModel;



@WebServlet("/AdminServlet")
public class AdminControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String firstName	=request.getParameter("firstName");
	String lastName=	request.getParameter("lastName");
	String Email=	request.getParameter("email");
	long phoneN=Long.parseLong(request.getParameter("phoneN"))	;
	String qualification=	request.getParameter("Qualif");
	int yearOfExp=Integer.parseInt(request.getParameter("yearOfExp"));
	String skils=	request.getParameter("skill");
	String userid=	request.getParameter("userid");
	String password=	request.getParameter("password");
	String status=	request.getParameter("status");
	
	AdminModel am=new AdminModel();
	//am.setAdminId();
	am.setFirstName(firstName);	
	am.setLastName(lastName);
	am.setE_mail(Email);
	am.setPh_num(phoneN);
	am.setQualification(qualification);
	am.setExperience(yearOfExp);
	am.setSkills(skils);
	am.setUser_id(userid);
	am.setPassword(password);
	am.setStatus(status);
	
	AdminDAO ad =new AdminDAO();
	String statusDAO =ad.insertAdmin(am);
	 
	if(statusDAO.equals("success") ) {
		
	RequestDispatcher rd=	request.getRequestDispatcher("submit.jsp");
		rd.include(request, response);
	}
	
	else {
		RequestDispatcher rd=	request.getRequestDispatcher("Admin.jsp");
		rd.include(request, response);
	}
	
	}

}
