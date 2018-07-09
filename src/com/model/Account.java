package com.model;

public abstract class Account {

	protected int accountNumber;
	protected String ownerFirstName;
	protected String ownerLastName;
	protected boolean underAudit;
	protected double amountOfMoney;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accouuntNumber) {
		this.accountNumber = accouuntNumber;
	}
	public String getOwnerFirstName() {
		return ownerFirstName;
	}
	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}
	public String getOwnerLastName() {
		return ownerLastName;
	}
	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}
	public boolean isUnderAudit() {
		return underAudit;
	}
	public void setUnderAudit(boolean underAudit) {
		this.underAudit = underAudit;
	}
	public double getAmountOfMoney() {
		return amountOfMoney;
	}
	public void setAmountOfMoney(double amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}
	
	public void transferFunds(Account to, Account from, double amountToTransfer) {}
	
	
}
