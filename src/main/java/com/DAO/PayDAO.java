package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.Model.CourseModel;
import com.Model.PayModel;

public class PayDAO {
	public String insertPay(PayModel pm) {
		String status="failed";
		Connection coi = RegisterConnection.dataConnection();
 
		try {
			PreparedStatement ps1 = coi.prepareStatement(
					"insert into payment(payment_id,,phoneNumber,date_of_payment,course_id,paid_fee,due_fee) values(?,?,?,?)");
			// ps1.setInt(1, 1);
			
			
			ps1.setString(3,pm.getFirstName());
			ps1.setString(0, status);
			ps1.setLong( 4, pm.getPhNumber());
			ps1.setString(5, pm.getdOfPay());
			ps1.setInt(6, pm.getCourseId());
			ps1.setInt(7, pm.getPaidFee());
			ps1.setInt(8, pm.getDueFee());
			
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

	public void updatePay() {
	Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("update payment set course_fee='2000' where course_id='1'");
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

	public void deletePay() {
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("delete from payment  where course_id='1'");
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

	public void selectAllPay( ) {
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pt=coi.prepareStatement("select *from payment");
			ResultSet	m=pt.executeQuery();
			
			while(m.next()) {
				System.out.println(m.getInt(1)+" "+m.getString(2)+" "+m.getInt(3));
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void selectCourseById() {
		Connection coi=	RegisterConnection.dataConnection();
		try {
			PreparedStatement pa=coi.prepareStatement("select * from where payment_id=1");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

