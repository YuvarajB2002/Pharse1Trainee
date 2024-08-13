package com.banking.repository;

import com.banking.models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    public List<Transaction> getSampleTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("T001", "101", 500.0, "credit", "2024-08-01"));
        transactions.add(new Transaction("T002", "101", 200.0, "debit", "2024-08-02"));
        transactions.add(new Transaction("T003", "102", 1000.0, "credit", "2024-08-03"));
        return transactions;
    }
}
