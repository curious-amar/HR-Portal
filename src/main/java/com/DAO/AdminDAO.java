package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DAO.RegisterConnection;
import com.Model.AdminModel;

public class AdminDAO {
	public String insertAdmin(AdminModel am) {
		
		String status="failed";
		Connection coi = RegisterConnection.dataConnection();
 
		try {
			PreparedStatement ps1 = coi.prepareStatement(
					"insert into course_details(First_name,Last_name,E_mail,phone_number,qualif,experience,status,user_id,password) values(?,?,?,?,?,?,?,?,?)");
			// ps1.setInt(1, 1);
			
			
			ps1.setString(1,am.getFirstName() );
			ps1.setString(2, am.getLastName());
			ps1.setString(3,am.getE_mail());
			ps1.setLong(4, (long) am.getPh_num());
			ps1.setString(5, am.getQualification());
			ps1.setInt(6, am.getExperience());
			ps1.setString(7,am.getStatus());
			ps1.setString(8, am.getUser_id());
			ps1.setString(9, am.getPassword());
			
			int n = ps1.executeUpdate();
			if (n > 0) {
				status="success";
				
				
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				coi.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return status;
	}

	public String updateAdmin(Connection c) {

			Connection coi=	RegisterConnection.dataConnection();
		
		String status ="fail";
		try {
			PreparedStatement pt=coi.prepareStatement("update admin set password=? where student_id='1'");
			
			
			ResultSet rs	=pt.executeQuery();
				while(rs.next()) {
					status = "success";
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

	public String deleteAdmin() {
		String status ="fail";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("delete from admin  where student_id=?");
		
			ResultSet rs	=pt.executeQuery();
			while(rs.next()) {
				status = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		}
	

	public String selectAllAdmin( ) {
		String status ="fail";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("select *from admin");
			
			ResultSet	m=pt.executeQuery();
			
			while(m.next()) {
				status ="success";
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public String selectCourseById() {
		String status ="fail";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pa=coi.prepareStatement("select * from where admin_id=?");
			ResultSet	m=pa.executeQuery();
			while(m.next()) {
				status ="success";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public String loginById(AdminModel am) {
		String status ="failed";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pa=coi.prepareStatement("select user_id ,pass_word  from admin where user_id=? and pass_word=?");
			pa.setString(1,am.getUser_id());
			pa.setString(2, am.getPassword());
			ResultSet	m=pa.executeQuery();
			while(m.next()) {
				status="success";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
}
