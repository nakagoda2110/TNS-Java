package com.java.daytwo;




import java.util.Scanner;

public class DriverClass
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter Gender");
		String gender=sc.next();
		
		System.out.println("Enter income");
		double income=sc.nextDouble();
		taxcalculation t = new taxcalculation();
		person p1=new person(age,gender,income,name);
		t.calculateTax(p1);
		System.out.println(p1);
		
	}


}