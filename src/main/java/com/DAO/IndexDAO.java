package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DAO.RegisterConnection;
import com.Model.IndexModel;

public class IndexDAO {
	
		public String DataAccess(IndexModel im) {
			String status ="fail";
			try {
				
				Connection con= RegisterConnection.dataConnection();
				
				PreparedStatement pd= con.prepareStatement("select user_id ,password from login where user_id=? and password=?");
				
//				pd.setString(1, );
//				pd.setString(2, );
				ResultSet rs= pd.executeQuery();
				
				if(rs.next()) {
					status ="success";
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return status;
		}
}
