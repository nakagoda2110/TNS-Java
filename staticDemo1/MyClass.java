package com.java.mohit.staticDemo1;

public class MyClass {
	
	private int branchId;
	private String Surname;
	private static int noOfstudents;
	static {
		System.out.println("in static block:");
		noOfstudents=44;
		
	}
	public  MyClass() {
		System.out.println("in default constructor");
		branchId++;
		noOfstudents++;
		}
	@Override
	public String toString() {
		return "MyClass [branchId=" + branchId + ", Surname=" + Surname + "]";
	}
		public void show()
		{
			System.out.println(branchId);
			System.out.println(noOfstudents);
			
		}
		
		public static void addStudents() {
			System.out.println(noOfstudents);
		}
}
