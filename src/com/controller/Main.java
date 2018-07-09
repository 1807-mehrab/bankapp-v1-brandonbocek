package com.controller;

import java.util.List;
import java.util.Scanner;

import com.model.Account;

public class Main {

	public static void main(String[] args) {
		
		LoginController lic = new LoginController();
		lic.showInitialView();
		lic.chooseAccountToLoginTo();
		LoginSessionController lsc = new LoginSessionController(lic.getLoggedIntoAccount(), lic.getAccounts());
		
		while(lsc.getIsLoggedIn()){
			lsc.displayOptions();
			lsc.getMenuInput();
		}
		
		
	}

}
