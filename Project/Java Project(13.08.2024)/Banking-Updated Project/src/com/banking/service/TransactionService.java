package com.banking.service;

import com.banking.intf.TransactionIntf;
import com.banking.models.Transaction;

/**
 * Service class for managing transactions.
 * Handles business logic related to Transaction operations.
 */
public class TransactionService {
    private TransactionIntf transactionIntf;

    public TransactionService(TransactionIntf transactionIntf) {
        this.transactionIntf = transactionIntf;
    }

    public void createTransaction(Transaction transaction) {
        transactionIntf.createTransaction(transaction);
    }

    public Transaction getTransactionById(String transactionId) {
        return transactionIntf.getTransactionById(transactionId);
    }

    public void updateTransaction(Transaction transaction) {
        transactionIntf.updateTransaction(transaction);
    }

    public void deleteTransaction(String transactionId) {
        transactionIntf.deleteTransaction(transactionId);
    }
}
