package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DAO.RegisterConnection;
import com.Model.StudentModel;

public class StudentDAO {
	public String insertStudent(StudentModel sm) {
		Connection coi = RegisterConnection.dataConnection();
			String status="failed";
		try {
			PreparedStatement ps1 = coi.prepareStatement(
					"insert into student(first_name,Last_name,phone_number,e_mail,gender,"
					+ "qualif,p_outYear,co_duratiom,course_id,status,user_id,password) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			// ps1.setInt(1, 1);
			ps1.setString(2,sm.getFirstName());
			ps1.setString(3, sm.getLastName());
			ps1.setLong(4,sm.getPh_num());
			ps1.setString(5,sm.getE_mail());
			ps1.setString(6, sm.getGender());
			ps1.setString(7,sm.getQualifi());
			ps1.setInt(8,sm.getPassOutYear());
			ps1.setString(9,sm.getCourseid());
			ps1.setInt(10,sm.getCo_duration());
			ps1.setString(11, sm.getStatus());
			ps1.setString(12, sm.getUser_id());
			ps1.setString(13,sm.getPassword());
			
			
		
			int n = ps1.executeUpdate();
			if (n > 0) {
				status="success";
			} else {
				System.out.println("invalid");
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

	public String updateStudent() {
		Connection coi=	RegisterConnection.dataConnection();
		
		String status ="fail";
		try {
			PreparedStatement pt=coi.prepareStatement("update student set password=? where student_id='1'");
		
			ResultSet rs	=pt.executeQuery();
				while(rs.next()) {
					status = "success";
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

	public String deleteStudent() {
			String status ="fail";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("delete from student  where student_id=?");
			pt.setInt(1, 1);
			ResultSet rs	=pt.executeQuery();
			while(rs.next()) {
				status = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public String selectAllStudent( ) {
		String status ="fail";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("select *from student");
			
			ResultSet	m=pt.executeQuery();
			
			while(m.next()) {
				status ="success";
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

	public String selectStudentById() {
		String status ="fail";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pa=coi.prepareStatement("select * from where course_id=?");
			ResultSet	m=pa.executeQuery();
			while(m.next()) {
				status ="success";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public String loginById() {
		String status ="fail";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pa=coi.prepareStatement("select user_id ,password from where course_id=? and password=?");
			ResultSet	m=pa.executeQuery();
			while(m.next()) {
				status ="success";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
}
