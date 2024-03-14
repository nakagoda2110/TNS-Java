package com.java.daythree;

public class student extends citizen {
       private int rollno;
       private String coursename;
       private String collegeName;
	   
       public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public student(String name, int age, double phn_no, String gender, int rollno, String coursename,
			String collegeName) {
		super(name, age, phn_no, gender);
		this.rollno = rollno;
		this.coursename = coursename;
		this.collegeName = collegeName;
	}
	public student(String name, int age, double phn_no, String gender) {
		super(name, age, phn_no, gender);
		// TODO Auto-generated constructor stub
	}
       
       
	  

}