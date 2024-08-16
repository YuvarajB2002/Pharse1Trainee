package com.banking.intf;

import com.banking.models.Transaction;

/**
 * Interface for Transaction operations.
 * Defines methods for CRUD operations related to Transaction.
 */
public interface TransactionIntf {
    void createTransaction(Transaction transaction);
    Transaction getTransactionById(String transactionId);
    void updateTransaction(Transaction transaction);
    void deleteTransaction(String transactionId);
}
