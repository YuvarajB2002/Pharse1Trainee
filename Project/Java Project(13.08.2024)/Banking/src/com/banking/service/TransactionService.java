package com.banking.service;

import com.banking.impl.TransactionImpl;
import com.banking.models.Transaction;
import com.banking.repository.TransactionRepository;

import java.util.List;

public class TransactionService {
    public void manageTransactions() {
        TransactionImpl transactionImpl = new TransactionImpl();
        TransactionRepository transactionRepository = new TransactionRepository();

        // Add all transactions
        List<Transaction> transactions = transactionRepository.getSampleTransactions();
        transactionImpl.addAllTransactions(transactions);

        // Read a transaction
        Transaction transaction = transactionImpl.getTransaction("T001");
        System.out.println("Transaction Type: " + transaction.getType() + ", Amount: " + transaction.getAmount());

        // Update a transaction
        transaction.setAmount(600.0);
        transactionImpl.updateTransaction("T001", transaction);

        // Delete a transaction
        transactionImpl.deleteTransaction("T002");

        // Display all remaining transactions
        System.out.println("Remaining Transactions: ");
        for (Transaction remainingTransaction : transactionImpl.getTransactions().values()) {
            System.out.println("Transaction ID: " + remainingTransaction.getTransactionId() + ", Amount: " + remainingTransaction.getAmount());
        }
    }
}
