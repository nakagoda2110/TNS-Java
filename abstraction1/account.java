package com.java.mohit.abstraction1;

public class account {
	private int accNo;
	private String name;
	private double balance;
	private bank bank;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public bank getBank() {
		return bank;
	}
	public void setBank(bank bank) {
		this.bank = bank;
	}
	public account() {
		super();
	}
	public account(int accNo, String name, double balance, bank bank) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", bank=" + bank+ "]";
	}
	
	
}