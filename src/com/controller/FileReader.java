package com.controller;


import java.io.*;
import java.util.*;

import com.model.Account;
import com.model.CheckingAccount;
import com.model.SavingAccount;


public class FileReader {
	
	private Formatter x;
	private Scanner y;
	
	public void openFile(){
		try{
			x = new Formatter("bankData.txt");
		}catch(Exception e){
			System.out.println("Error opening file");
		}
	}
	
	public void openFileForReading(){
		try{
			y = new Scanner(new File("bankData.txt"));
		}catch(Exception e){
			System.out.println("Error reading file");
		}
	}
	
	public ArrayList<Account> readFile(){
		ArrayList<Account> accounts = new ArrayList<Account>();
		while(y.hasNext()){
			String checkingOrSaving = y.next();
			String firstName = y.next();
			String lastName = y.next();
			String amountOfMoney = y.next();
			Double amtMoney = Double.parseDouble(amountOfMoney);
			if(checkingOrSaving.equals("c"))
				accounts.add(new CheckingAccount(firstName, lastName, amtMoney));
			else if(checkingOrSaving.equals("s"))
				accounts.add(new SavingAccount(firstName, lastName, amtMoney));
		}
		return accounts;
	}
	
	
}

