package com.Model;

public class StudentModel {
	private String student_id;
	private String firstName;
	private String lastName;
	private long ph_num;
	private String e_mail;
	private String gender;
	private String qualifi;
	private int  passOutYear;
	private String courseid;
	private int co_duration;
	private String user_id;
	private String password;	
	private String status;
	
	public  StudentModel() {
		
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
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

	public long getPh_num() {
		return ph_num;
	}

	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualifi() {
		return qualifi;
	}

	public void setQualifi(String qualifi) {
		this.qualifi = qualifi;
	}

	public int  getPassOutYear() {
		return passOutYear;
	}

	public void setPassOutYear(int  passOutYear) {
		this.passOutYear = passOutYear;
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public int getCo_duration() {
		return co_duration;
	}

	public void setCo_duration(int co_duration) {
		this.co_duration = co_duration;
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
		 return status;
	 }
}
