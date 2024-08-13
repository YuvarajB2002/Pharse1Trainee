package com.banking.intf;

import com.banking.models.Account;

import java.util.List;

public interface AccountIntf {
    void addAccount(Account account);
    void addAllAccounts(List<Account> accounts);
    Account getAccount(String accountId);
    void updateAccount(String accountId, Account account);
    void deleteAccount(String accountId);
}
