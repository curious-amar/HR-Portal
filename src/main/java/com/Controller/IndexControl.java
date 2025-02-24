package com.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.DAO.AdminDAO;
import com.DAO.FacultyDAO;
import com.DAO.IndexDAO;
import com.Model.AdminModel;
import com.Model.FacultyModel;
import com.Model.IndexModel;

/**
 * Servlet implementation class IndexControl
 */

@WebServlet("/IndexServlet")
public class IndexControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("userid");
		String pass = request.getParameter("password");
		String role = request.getParameter("role");
		
		
		if(role.equals("admin")) {
			AdminModel am=new AdminModel();
			am.setUser_id(user);
			am.setPassword(pass);
			
		 System.out.println(am.getUser_id());	
		 
			AdminDAO ad=new AdminDAO();
			String status = ad.loginById(am);
			
			if(status.equals("success")) {
			RequestDispatcher rd=	request.getRequestDispatcher("listOfPages.jsp");
			rd.include(request, response);
			}
			
			else {
				RequestDispatcher rd=	request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
			}
			
			}
		

		
		
	
	
		else if(role.equals("faculty")) {
			// here have to create object of model
			FacultyModel fm=new FacultyModel();
			fm.setUser_id(user);
			fm.setPassword(pass);
			
			FacultyDAO fd=new FacultyDAO();
		String [] status=	fd.loginById(fm);
			
			
			if(status[0].equals("success")) {
				RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
				rd.include(request, response);
				
				HttpSession ses=request.getSession();
				ses.setAttribute("status1",status[1]);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			}
		}
		
		else if (role.equals("student")) {
			
		}


	}

}
