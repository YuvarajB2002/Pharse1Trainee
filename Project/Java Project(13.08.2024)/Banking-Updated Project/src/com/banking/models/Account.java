package com.banking.models;

/**
 * Represents a bank account.
 */
public class Account {
    private String accountId;
    private String accountType;
    private String profileId;

    // Constructor
    public Account(String accountId, String accountType, String profileId) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.profileId = profileId;
    }

    // Getters and Setters
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    public String toString() {
        return "Account{" +
               "accountId='" + accountId + '\'' +
               ", accountType='" + accountType + '\'' +
               ", profileId='" + profileId + '\'' +
               '}';
    }
}
