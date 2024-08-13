package com.banking.impl;

import com.banking.intf.TransactionIntf;
import com.banking.models.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionImpl implements TransactionIntf {
    private Map<String, Transaction> transactions = new HashMap<>();

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.put(transaction.getTransactionId(), transaction);
    }

    @Override
    public void addAllTransactions(List<Transaction> transactionsList) {
        for (Transaction transaction : transactionsList) {
            transactions.put(transaction.getTransactionId(), transaction);
        }
    }

    @Override
    public Transaction getTransaction(String transactionId) {
        return transactions.get(transactionId);
    }

    @Override
    public void updateTransaction(String transactionId, Transaction transaction) {
        transactions.put(transactionId, transaction);
    }

    @Override
    public void deleteTransaction(String transactionId) {
        transactions.remove(transactionId);
    }

	public Map<String, Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Map<String, Transaction> transactions) {
		this.transactions = transactions;
	}
}
