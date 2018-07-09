package com.model;

public interface Transferable {

	public void transferFunds(Account to, Account from, double amountToTransfer);
	
}
