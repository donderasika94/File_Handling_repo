package com.capgemini.bankapp.model;

public class BankAccount {
	private long accountId;
	private String accountHoldername;
	private String accountType;
	private double accountBalance;
	
	public BankAccount() {
		super();
		
	}

	public BankAccount(long accountId, String accountHoldername, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHoldername = accountHoldername;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountHoldername() {
		return accountHoldername;
	}

	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double withdraw(double amount) {
		if(accountBalance >= amount)
			accountBalance = accountBalance - amount;
		else
			System.out.println("You dont have sufficient fund");
		return accountBalance;	
	}

	public double deposit(double amount) {
		
		accountBalance = accountBalance + amount;
		return accountBalance;
	}
	

	
	

}
