package com.banking.models;

public class CheckBookRequest {
    private String requestId;
    private String accountId;
    private int numberOfLeaves;
    private String requestDate;
    private String status; // "pending", "approved", "rejected"

    public CheckBookRequest(String requestId, String accountId, int numberOfLeaves, String requestDate, String status) {
        this.requestId = requestId;
        this.accountId = accountId;
        this.numberOfLeaves = numberOfLeaves;
        this.requestDate = requestDate;
        this.status = status;
    }

    // Getters and Setters
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
