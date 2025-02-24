package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.CourseModel;

public class CourseDAO {
	
	public String insertCourse(CourseModel cm) {
		String status="fail";
		Connection coi = RegisterConnection.dataConnection();
		
		try {
			PreparedStatement ps1 = coi.prepareStatement(
					"insert into course_details(course_name,course_fee,course_duration,location) values(?,?,?,?)");
			// ps1.setInt(1, 1);
			
			ps1.setString(1,cm.getCourse_name() );
			ps1.setInt(2,cm.getFee());
			ps1.setInt(3,cm.getDuration() );
			ps1.setString(4,cm.getLocation());
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

	public void updateCourse() {
	Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("update course_details set course_fee='2000' where course_id='1'");
			boolean	m=pt.execute();
			if(m==false) {
				System.out.println(m);
			}
			else {
				System.out.println(m+"true");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteCourse() {
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("delete from course_details  where course_id='1'");
			boolean	m=pt.execute();
			if(m==true) {
				System.out.println(m);
			}
			else {
				System.out.println(m+":false");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<CourseModel> selectAllCourse( ) {
		Connection coi=	RegisterConnection.dataConnection();
		
		List<CourseModel> course=new ArrayList<CourseModel>();
		try {
			PreparedStatement pt=coi.prepareStatement("select *from selectAll");
			
			ResultSet	m=pt.executeQuery();  
			
			while(m.next()) {
				int c_id=m.getInt(1);
				String c_name=m.getString(2);
				int c_fee=m.getInt(3);
				int c_duration =m.getInt(4);
				String location=m.getString(5);
				
				System.out.println(c_name);
				
				CourseModel cd =new CourseModel(c_id,c_name,c_fee,c_duration,location);
				course.add(cd);
				
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
			return course;
	}

	public List<CourseModel> selectCourseById (CourseModel cd) {
		Connection coi=	RegisterConnection.dataConnection();
		List<CourseModel> course=new ArrayList<CourseModel>();
		try {
			PreparedStatement pa=coi.prepareStatement("select * from course_details where course_id=?");
			pa.setInt(1, cd.getCourse_id());
			
			ResultSet rse	=pa.executeQuery();
			while(rse.next()) {
			int course_id=rse.getInt(1);
			String CName=	rse.getString(2);
			int CFee=	rse.getInt(3);
			int Cduration=	rse.getInt(4);
			String CLocation=	rse.getString(5);
			CourseModel cm=new CourseModel( course_id, CName, CFee, Cduration,CLocation);
			course.add(cm);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return course;
	}

	public boolean courseUpdate(CourseModel cm) {
		boolean status=false;
		Connection coi=	RegisterConnection.dataConnection(); 
		try {
			PreparedStatement pa=coi.prepareStatement("update course_details set course_name=?,course_fee=?,course_duration=?,location=? where course_id=?");
			pa.setString(1,cm.getCourse_name() );
			pa.setInt(2,cm.getFee());
			pa.setInt(3,cm.getDuration() );
			pa.setString(4,cm.getLocation());
			pa.setInt(5, cm.getCourse_id());
			
			int n=pa.executeUpdate();
			if(n>0) {
				status=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return status;
	}
}

