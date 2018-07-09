package com.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.model.Account;

public class LoginController {
	
	List<Account> accounts;
	Account loggedInto;
	
	public void showInitialView(){
		addAllAccounts();
		System.out.println("The following accounts exist: ");
		for(Account a : accounts){
			
			System.out.println(a.getClass().getSimpleName() + " " +
					a.getOwnerFirstName() + " " +
					a.getOwnerLastName() + " " +
					String.format("%.2f", a.getAmountOfMoney()));
		}
	}
	
	private void addAllAccounts(){
		FileReader fr = new FileReader();
		fr.openFileForReading();
		accounts = fr.readFile();
	}
	
	private String getNameInput(){
		System.out.println("\n Enter a name to login: ");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
	
	public boolean chooseAccountToLoginTo(){
		String userEntry = getNameInput();
		for(Account a : accounts){
			if(userEntry.equals(a.getOwnerFirstName())){
				loggedInto = a;
				return true;
			}
		}
		return false;
	}
	
	public Account getLoggedIntoAccount(){
		return loggedInto;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	
	
}
