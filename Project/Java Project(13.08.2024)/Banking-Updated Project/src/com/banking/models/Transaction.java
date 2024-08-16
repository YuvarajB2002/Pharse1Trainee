package com.banking.models;

/**
 * Represents a transaction in the banking system.
 */
public class Transaction {
    private String transactionId;
    private String accountId;
    private double amount;
    private String type;

    // Constructor
    public Transaction(String transactionId, String accountId, double amount, String type) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.type = type;
    }

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
               "transactionId='" + transactionId + '\'' +
               ", accountId='" + accountId + '\'' +
               ", amount=" + amount +
               ", type='" + type + '\'' +
               '}';
    }
}
