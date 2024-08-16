package com.banking.intf;

import com.banking.models.Account;

/**
 * Interface for Account operations.
 * Defines methods for CRUD operations related to Account.
 */
public interface AccountIntf {
    void createAccount(Account account);
    Account getAccountById(String accountId);
    void updateAccount(Account account);
    void deleteAccount(String accountId);
}
