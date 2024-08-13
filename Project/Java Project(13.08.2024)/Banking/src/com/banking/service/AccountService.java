package com.banking.service;

import com.banking.impl.AccountImpl;
import com.banking.models.Account;
import com.banking.repository.AccountRepository;

import java.util.List;

public class AccountService {
    public void manageAccounts() {
        AccountImpl accountImpl = new AccountImpl();
        AccountRepository accountRepository = new AccountRepository();

        // Add all accounts
        List<Account> accounts = accountRepository.getSampleAccounts();
        accountImpl.addAllAccounts(accounts);

        // Read an account
        Account account = accountImpl.getAccount("101");
        System.out.println("Account Type: " + account.getAccountType() + ", Balance: " + account.getBalance());

        // Update an account
        account.setBalance(6000.0);
        accountImpl.updateAccount("101", account);

        // Delete an account
        accountImpl.deleteAccount("102");

        // Display all remaining accounts
        System.out.println("Remaining Accounts: ");
        Account remainingAccount = accountImpl.getAccount("101");
        System.out.println("Account Type: " + remainingAccount.getAccountType() + ", Balance: " + remainingAccount.getBalance());
    }
}
