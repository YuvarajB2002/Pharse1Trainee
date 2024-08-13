package com.banking.impl;

import com.banking.intf.AccountIntf;
import com.banking.models.Account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountImpl implements AccountIntf {
    private Map<String, Account> accounts = new HashMap<>();

    @Override
    public void addAccount(Account account) {
        accounts.put(account.getAccountId(), account);
    }

    @Override
    public void addAllAccounts(List<Account> accountsList) {
        for (Account account : accountsList) {
            accounts.put(account.getAccountId(), account);
        }
    }

    @Override
    public Account getAccount(String accountId) {
        return accounts.get(accountId);
    }

    @Override
    public void updateAccount(String accountId, Account account) {
        accounts.put(accountId, account);
    }

    @Override
    public void deleteAccount(String accountId) {
        accounts.remove(accountId);
    }
}
