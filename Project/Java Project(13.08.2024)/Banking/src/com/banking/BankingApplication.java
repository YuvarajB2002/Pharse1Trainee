package com.banking;

import com.banking.service.*;


public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    // Manage Profiles
		    ProfileService profileService = new ProfileService();
	        profileService.manageProfiles();
	        
	        // Manage Accounts
	        AccountService accountService = new AccountService();
	        accountService.manageAccounts();
	        
	        // Manage Transactions
	        TransactionService transactionService = new TransactionService();
	        transactionService.manageTransactions();
	        
	        // Manage CheckBook Requests
	        CheckBookRequestService checkBookRequestService = new CheckBookRequestService();
	        checkBookRequestService.manageCheckBookRequests();
	}

}
