package com.java.mohit.abstraction1;

public interface bank {
	
	double minBalance = 10000;
	double depositLimit = 25000;
//	methods declared in interfces are static
	void deposit(account account,double amount);
	
	void withdraw(account account,double amount);
	
}