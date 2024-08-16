package com.banking.impl;

import com.banking.intf.AccountIntf;
import com.banking.models.Account;
import com.banking.repository.AccountRepository;

/**
 * Implementation of AccountIntf using AccountRepository for data storage.
 */
public class AccountImpl implements AccountIntf {
    private AccountRepository accountRepository = new AccountRepository();

    @Override
    public void createAccount(Account account) {
        accountRepository.addAccount(account);
    }

    @Override
    public Account getAccountById(String accountId) {
        return accountRepository.getAccountById(accountId);
    }

    @Override
    public void updateAccount(Account account) {
        accountRepository.updateAccount(account);
    }

    @Override
    public void deleteAccount(String accountId) {
        accountRepository.deleteAccount(accountId);
    }
}
