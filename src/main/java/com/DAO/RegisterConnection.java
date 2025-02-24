package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
 
public class RegisterConnection {
	public static Connection dataConnection() 
	{
		Connection co=null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		co=DriverManager.getConnection("jdbc:mysql://localhost:3306/applicationvcube","root","root");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return co;
		
	}
}
