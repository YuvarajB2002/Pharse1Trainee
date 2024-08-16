package com.banking.models;

/**
 * Represents a request for a checkbook.
 */
public class CheckBookRequest {
    private String requestId;
    private String accountId;
    private String requestDate;

    // Constructor
    public CheckBookRequest(String requestId, String accountId, String requestDate) {
        this.requestId = requestId;
        this.accountId = accountId;
        this.requestDate = requestDate;
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

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    @Override
    public String toString() {
        return "CheckBookRequest{" +
               "requestId='" + requestId + '\'' +
               ", accountId='" + accountId + '\'' +
               ", requestDate='" + requestDate + '\'' +
               '}';
    }
}
