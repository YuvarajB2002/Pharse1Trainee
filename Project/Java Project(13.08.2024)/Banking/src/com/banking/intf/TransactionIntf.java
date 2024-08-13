package com.banking.intf;

import com.banking.models.Transaction;

import java.util.List;

public interface TransactionIntf {
    void addTransaction(Transaction transaction);
    void addAllTransactions(List<Transaction> transactions);
    Transaction getTransaction(String transactionId);
    void updateTransaction(String transactionId, Transaction transaction);
    void deleteTransaction(String transactionId);
}
