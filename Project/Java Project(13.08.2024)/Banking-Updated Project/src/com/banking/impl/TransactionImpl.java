package com.banking.impl;

import com.banking.intf.TransactionIntf;
import com.banking.models.Transaction;
import com.banking.repository.TransactionRepository;

/**
 * Implementation of TransactionIntf using TransactionRepository for data storage.
 */
public class TransactionImpl implements TransactionIntf {
    private TransactionRepository transactionRepository = new TransactionRepository();

    @Override
    public void createTransaction(Transaction transaction) {
        transactionRepository.addTransaction(transaction);
    }

    @Override
    public Transaction getTransactionById(String transactionId) {
        return transactionRepository.getTransactionById(transactionId);
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        transactionRepository.updateTransaction(transaction);
    }

    @Override
    public void deleteTransaction(String transactionId) {
        transactionRepository.deleteTransaction(transactionId);
    }
}
