package com.banking.repository;

import com.banking.models.Transaction;
import java.util.*;

/**
 * Repository for managing Transaction data.
 */
public class TransactionRepository {
    private Map<String, Transaction> transactionMap = new HashMap<>();

    // Adds a new transaction to the repository
    public void addTransaction(Transaction transaction) {
        transactionMap.put(transaction.getTransactionId(), transaction);
    }

    // Retrieves a transaction by its ID
    public Transaction getTransactionById(String transactionId) {
        return transactionMap.get(transactionId);
    }

    // Updates an existing transaction
    public void updateTransaction(Transaction transaction) {
        transactionMap.put(transaction.getTransactionId(), transaction);
    }

    // Deletes a transaction by its ID
    public void deleteTransaction(String transactionId) {
        transactionMap.remove(transactionId);
    }

    // Retrieves all transactions
    public Collection<Transaction> getAllTransactions() {
        return transactionMap.values();
    }
}
