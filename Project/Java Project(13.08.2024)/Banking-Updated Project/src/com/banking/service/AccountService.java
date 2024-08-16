package com.banking.service;

import com.banking.intf.AccountIntf;
import com.banking.models.Account;

/**
 * Service class for managing accounts.
 * Handles business logic related to Account operations.
 */
public class AccountService {
    private AccountIntf accountIntf;

    public AccountService(AccountIntf accountIntf) {
        this.accountIntf = accountIntf;
    }

    public void createAccount(Account account) {
        accountIntf.createAccount(account);
    }

    public Account getAccountById(String accountId) {
        return accountIntf.getAccountById(accountId);
    }

    public void updateAccount(Account account) {
        accountIntf.updateAccount(account);
    }

    public void deleteAccount(String accountId) {
        accountIntf.deleteAccount(accountId);
    }
}
