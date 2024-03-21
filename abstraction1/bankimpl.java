package com.java.mohit.abstraction1;

public class bankimpl implements bank{
	
	@Override
	public void deposit(account account, double amount) {
		if(amount>depositLimit)
		{
			System.out.println("Deposit limit exceeded..Try later");
		}
		else
		{
			account.setBalance(account.getBalance()+amount);
			System.out.println("Deposited amount is "
			+amount+" into account "+account.getAccNo());
		}

		
	}

	@Override
	public void withdraw(account account, double amount) {
		if(account.getBalance()-amount>minBalance)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("Amount is withdrawn "
					+amount+" from account "+account.getAccNo());
		}else
		{
			System.out.println("You can not withdraw amount");
		}
		
	}
	}
