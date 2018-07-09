package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Account;

public class LoginSessionController {

	Account account, transferToAccount;
	List<Account> allAccounts;
	
	public LoginSessionController(Account account, List<Account> allAccounts){
		this.account = account;
		this.allAccounts = allAccounts;
	}
	
	public void displayOptions(){
		System.out.println("1. (Amount) to check the amount of money you have.");
		System.out.println("2. (Transfer) to transfer money to another account.");
		System.out.println("3 (Audit) to see if you are being audited.");
		System.out.println("4. (Quit) to logout of this account.");
	}
	
	public void getMenuInput(){
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		switch(input){
		case "Amount":
			System.out.println("You have " + String.format("%.2f", account.getAmountOfMoney()));
			break;
		case "Transfer":
			System.out.println("How much would you like to transfer?");
			Double amount = scan.nextDouble();
			System.out.println("Who would you like to receive this money?");
			String receiver = scan.next();
			
			transferToAccount = getAccountFromName(receiver);
			account.transferFunds(transferToAccount, account, amount);
			
			break;
		default:
			System.out.println("I don't know that command.");
		}
	}
	
	private Account getAccountFromName(String name){
		for(Account a : allAccounts){
			if(a.getOwnerFirstName().equals(name))
				return a;
		}
		return null;
	}
	
	
}