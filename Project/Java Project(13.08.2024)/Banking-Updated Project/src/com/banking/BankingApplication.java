package com.banking;

import com.banking.models.*;
import com.banking.repository.*;

/**
 * Main class for the Banking Application.
 * <p>
 * This application demonstrates how to use repositories to manage data for
 * Profile, Account, Transaction, and CheckBookRequest entities. It performs
 * CRUD operations (Create, Read, Update, Delete) and displays the results.
 * </p>
 */
public class BankingApplication {

    /**
     * Main method that executes the application logic.
     * <p>
     * It creates instances of repository classes, performs CRUD operations on
     * each type of entity (Profile, Account, Transaction, CheckBookRequest), 
     * and prints the results to the console.
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create repository instances
        ProfileRepository profileRepo = new ProfileRepository();
        AccountRepository accountRepo = new AccountRepository();
        TransactionRepository transactionRepo = new TransactionRepository();
        CheckBookRequestRepository checkBookRequestRepo = new CheckBookRequestRepository();

        // Create new profiles
        Profile profile1 = new Profile("1", "John Doe", "john.doe@example.com");
        Profile profile2 = new Profile("2", "Jane Smith", "jane.smith@example.com");
        profileRepo.addProfile(profile1);
        profileRepo.addProfile(profile2);

        // Create new accounts
        Account account1 = new Account("A1", "Savings", "1");
        Account account2 = new Account("A2", "Checking", "2");
        accountRepo.addAccount(account1);
        accountRepo.addAccount(account2);

        // Create new transactions
        Transaction transaction1 = new Transaction("T1", "A1", 100.00, "Deposit");
        Transaction transaction2 = new Transaction("T2", "A2", 50.00, "Withdrawal");
        transactionRepo.addTransaction(transaction1);
        transactionRepo.addTransaction(transaction2);

        // Create new check book requests
        CheckBookRequest request1 = new CheckBookRequest("R1", "A1", "2024-08-15");
        CheckBookRequest request2 = new CheckBookRequest("R2", "A2", "2024-08-16");
        checkBookRequestRepo.addCheckBookRequest(request1);
        checkBookRequestRepo.addCheckBookRequest(request2);

        // Display all profiles
        System.out.println("All Profiles:");
        profileRepo.getAllProfiles().forEach(System.out::println);

        // Display all accounts
        System.out.println("\nAll Accounts:");
        accountRepo.getAllAccounts().forEach(System.out::println);

        // Display all transactions
        System.out.println("\nAll Transactions:");
        transactionRepo.getAllTransactions().forEach(System.out::println);

        // Display all check book requests
        System.out.println("\nAll Check Book Requests:");
        checkBookRequestRepo.getAllCheckBookRequests().forEach(System.out::println);

        // Update profile
        Profile updatedProfile1 = new Profile("1", "John Doe", "john.new@example.com");
        profileRepo.updateProfile(updatedProfile1);
        System.out.println("\nUpdated Profile with ID 1: " + profileRepo.getProfileById("1"));

        // Delete profile
        profileRepo.deleteProfile("2");
        System.out.println("\nProfiles after deletion:");
        profileRepo.getAllProfiles().forEach(System.out::println);

        // Delete account
        accountRepo.deleteAccount("A2");
        System.out.println("\nAccounts after deletion:");
        accountRepo.getAllAccounts().forEach(System.out::println);

        // Update transaction
        Transaction updatedTransaction1 = new Transaction("T1", "A1", 200.00, "Deposit");
        transactionRepo.updateTransaction(updatedTransaction1);
        System.out.println("\nUpdated Transaction with ID T1: " + transactionRepo.getTransactionById("T1"));

        // Delete check book request
        checkBookRequestRepo.deleteCheckBookRequest("R2");
        System.out.println("\nCheck Book Requests after deletion:");
        checkBookRequestRepo.getAllCheckBookRequests().forEach(System.out::println);
    }
}
