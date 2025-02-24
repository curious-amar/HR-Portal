package com.Model;

public class FacultyModel {
	
	public FacultyModel(int faculty_id, String firstName,String lastName,String e_mail,
	long ph_num,String gender,String qualification,int experience,
	String skills,int courseid,String user_id,String password,String status) {
	
		this.faculty_id=faculty_id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.e_mail=e_mail;
		this.ph_num=ph_num;
		this.gender=gender;
		this.qualification=qualification;
		this.experience=experience;
		this.skills=skills;
		this.courseid=courseid;
		this.user_id=user_id;
		this.password=password;
		this.status=status;
	}
	
	public FacultyModel() {
		// TODO Auto-generated constructor stub
	}
	private int faculty_id;
	private String firstName;
	private String lastName;
	private String e_mail;
	private long ph_num;
	private String gender;	
	private String qualification;
	private int experience;
	private String skills;
	private int courseid;
	private String user_id;
	private String password;	
	private String status;
	
	
	
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
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
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public long getPh_num() {
		return ph_num;
	}
	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
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
	
	
}
