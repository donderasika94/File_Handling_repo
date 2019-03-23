package com.capgemini.file_handling.model;

import java.io.Serializable;

public class BankAccount implements Serializable {
	private int accountId;
	private String accountHoldername;
	private String accountType;
	private double accountbalance;
	private  transient DebitCard debitcard;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountId, String accountHoldername, String accountType, double accountbalance,
			DebitCard debitcard) {
		super();
		this.accountId = accountId;
		this.accountHoldername = accountHoldername;
		this.accountType = accountType;
		this.accountbalance = accountbalance;
		this.debitcard = debitcard;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
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
	public double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	public DebitCard getDebitcard() {
		return debitcard;
	}
	public void setDebitcard(DebitCard debitcard) {
		this.debitcard = debitcard;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHoldername=" + accountHoldername + ", accountType="
				+ accountType + ", accountbalance=" + accountbalance + ", debitcard=" + debitcard + "]";
	}
	
	

}
