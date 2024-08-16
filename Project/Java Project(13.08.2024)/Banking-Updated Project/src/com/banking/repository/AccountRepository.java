package com.banking.repository;

import com.banking.models.Account;
import java.util.*;

/**
 * Repository for managing Account data.
 */
public class AccountRepository {
    private Map<String, Account> accountMap = new HashMap<>();

    // Adds a new account to the repository
    public void addAccount(Account account) {
        accountMap.put(account.getAccountId(), account);
    }

    // Retrieves an account by its ID
    public Account getAccountById(String accountId) {
        return accountMap.get(accountId);
    }

    // Updates an existing account
    public void updateAccount(Account account) {
        accountMap.put(account.getAccountId(), account);
    }

    // Deletes an account by its ID
    public void deleteAccount(String accountId) {
        accountMap.remove(accountId);
    }

    // Retrieves all accounts
    public Collection<Account> getAllAccounts() {
        return accountMap.values();
    }
}
