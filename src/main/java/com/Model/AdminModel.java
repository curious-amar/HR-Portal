package com.Model;

public class AdminModel {
	
	private int adminId;
	private String firstName;
	private String lastName;
	private String gender;
	private String e_mail;
	private long ph_num;
	private int experience;
	private String qualification;
	private String skills;
	//private int ecourse_id;
	private String user_id;
	private String password;
	private String status;
	

	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

//	public int getEcourse_id() {
//		return ecourse_id;
//	}
//
//	public void setEcourse_id(int ecourse_id) {
//		this.ecourse_id = ecourse_id;
//	}


	
	public AdminModel(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public double getPh_num() {
		return ph_num;
	}

	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String ToString() {
		
		return password;
	}
}
