package com.model;

import java.util.Random;

public class CheckingAccount extends Account implements Transferable {

	
	

	public CheckingAccount(String ownerFirstName, String ownerLastName, Double amountOfMoney) {
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.amountOfMoney = amountOfMoney;
		this.underAudit = false;
		Random rand = new Random();
		this.accountNumber = rand.nextInt(32000);
	}

	@Override
	public void transferFunds(Account to, Account from, double amountToTransfer) {
		
		double cashSenderOriginal = from.getAmountOfMoney();
		double cashReceiverOriginal = from.getAmountOfMoney();
		
		//the amount to subtract from the sender
		double cashToTake = amountToTransfer;
		
		//the final amount in the receiver's account 
		double cashToGive = cashReceiverOriginal;
		
		if(cashToTake > cashSenderOriginal){
			System.out.println("Invalid funds for this transaction");
			System.out.println("Trying to take " + cashToTake + " from an amount of " + cashSenderOriginal);
			
		// the transfer will succeed
		}else{
			
			//give the money to the receiver
			cashToGive += amountToTransfer;
			to.setAmountOfMoney(cashToGive);
			
			//take the money from the sender
			from.setAmountOfMoney((cashSenderOriginal - cashToTake));
			System.out.println("Transferred " + amountToTransfer + " to " + to.getOwnerFirstName());
		}
	}

}
