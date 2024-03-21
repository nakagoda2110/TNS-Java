package com.java.mohit.abstraction1;

public class driver {
public static void main(String[] args) {
	bank b=new bankimpl(); 
	
	account acc1=new account(10,"mohit",86000,b);
	
	b.deposit(acc1, 10000);
	System.out.println(acc1);
	
	b.deposit(acc1, 30000);
	
	b.withdraw(acc1, 20000);
	System.out.println(acc1);
	
	
	b.withdraw(acc1, 45000);
	System.out.println(acc1);
	
}
}
