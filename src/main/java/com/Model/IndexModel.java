package com.Model;

public class IndexModel {
	private String userid;
	private String password;
	private String role;
	
	public IndexModel() {
		
	}
	
public IndexModel(String userid,String password ,String role) {
		
	}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

	public String toString() {
		
		return this.userid;
	}
}
