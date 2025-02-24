package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DAO.RegisterConnection;
import com.Model.AdminModel;
import com.Model.FacultyModel;

public class FacultyDAO {
	public String insertFaculty(FacultyModel fm) {
		
		String status="failed";
		Connection coi = RegisterConnection.dataConnection();
 
		try {
			PreparedStatement ps1 = coi.prepareStatement(
					"insert into faculty(first_name,last_name,E_mail,phone_number,gender,qualif,experience,skills,course_id,stat_us,user_id,pass_word) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			// ps1.setInt(1, 1);
			ps1.setString(1,fm.getFirstName());
			ps1.setString(2, fm.getLastName());
			ps1.setString(3,fm.getE_mail());
			ps1.setLong(4, (long) fm.getPh_num());
			ps1.setString(5,fm.getGender() );
			ps1.setString(6, fm.getQualification());
			ps1.setInt(7, fm.getExperience());
			ps1.setString(8,fm.getSkills());
			ps1.setInt(9, fm.getCourseid());
			ps1.setString(10, fm.getStatus());
			ps1.setString(11, fm.getUser_id());
			ps1.setString(12, fm.getPassword());
			
			int n=ps1.executeUpdate();
			
			
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

	public String updateFaculty() {

			Connection coi=	RegisterConnection.dataConnection();
		
		String status ="fail";
		try {
			PreparedStatement pt=coi.prepareStatement("update faculty set password=? where student_id='1'");
			
			
			ResultSet rs	=pt.executeQuery();
				while(rs.next()) {
					status = "success";
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}

	public String deleteFaculty() {
		String status ="fail";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("delete from faculty  where student_id=?");
			
			ResultSet rs	=pt.executeQuery();
			while(rs.next()) {
				status = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		}
	

	public List<FacultyModel> selectAllFaculty( ) {
		String status ="failed";
		Connection coi=	RegisterConnection.dataConnection();
		List <FacultyModel> faculty= new  ArrayList<FacultyModel>();
		try {
			PreparedStatement pt=coi.prepareStatement("select *from faculty");
			
			ResultSet	m=pt.executeQuery();
			
			while(m.next()) {
				
			int	fa_id	=m.getInt(1);
			String fa_Fname=m.getString(2);
			String fa_Lname=m.getString(3);
			String e_mail=m.getString(4);
			long ph_num=m.getLong(5);
			String gender=m.getString(6);
			String qua=m.getString(7);
			int exp=m.getInt(8);
			String skills=m.getString(9);
			int co_id=m.getInt(10);
			String user_id=m.getString(11);
			String pass_word=m.getString(12);
			String stat_us=m.getString(13);
			FacultyModel fm= new FacultyModel(fa_id,fa_Fname,fa_Lname,e_mail,
					 ph_num,gender,qua,exp,skills,co_id,user_id,
					 pass_word,stat_us);
			faculty.add(fm);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return faculty;

	}

	public String selectFacultyById() {
		String status ="fail";
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pa=coi.prepareStatement("select * from faculty ");
			ResultSet	m=pa.executeQuery();
			while(m.next()) {
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public String[] loginById(FacultyModel fm) {
		String status ="failed";
		String name=null;
		String[] s= new String[2];
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pa=coi.prepareStatement("select last_name from faculty where user_id=? and pass_word=?");
			pa.setString(1,fm.getUser_id());
			pa.setString(2, fm.getPassword());
			ResultSet	m=pa.executeQuery();
			while(m.next()) {
				status="success";
			 name=	m.getString(1);
			 
				System.out.println(name);
				s[0]=status;
				s[1]=name;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
}

