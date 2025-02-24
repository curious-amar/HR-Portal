package com.Model;

public class CourseModel {
	
	private int course_id;
	private String course_name;
	private int fee;
	private int duration; 
	private String location;
	
	
	public CourseModel(int course_id,String course_name,int fee,int duration,String location) {
		
		this.course_id=course_id;
		this.course_name=course_name;
		this.fee=fee;
		this.duration=duration;
		this.location=location;
		
	}
	
			public CourseModel(int course_id) {
				
					this.course_id=course_id;
				}
	public CourseModel() {
		
	}
	
	public int getCourse_id() {
		return course_id;
	}


	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}


	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
		
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String ToString() {
		
		return location;
	}
}
