package com.cap.beans;

public class Account {
	public Account(int accountNumber, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	private int accountNumber;
	private int amount;
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}


}
