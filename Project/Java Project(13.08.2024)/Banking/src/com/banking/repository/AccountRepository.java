package com.banking.repository;

import com.banking.models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public List<Account> getSampleAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("101", "Savings", 5000.0));
        accounts.add(new Account("102", "Checking", 1500.0));
        return accounts;
    }
}
