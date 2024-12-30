package org.example.oop_pillars._01_encapsulation._04_maintenance_flexibility._01_encrypted_password;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String encryptedPassword;

    public BankAccount(String accountNumber, String password, double initialBalance) {
        this.accountNumber = accountNumber;
        this.encryptedPassword = encryptPassword(password);
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(String enteredPassword) {
        if (authenticate(enteredPassword)) {
            return balance;
        } else {
            System.out.println("Invalid password! Access denied.");
            return -1;
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount, String enteredPassword) {

        if (authenticate(enteredPassword)) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Invalid withdrawal amount or insufficient balance!");
            }
        } else {
            System.out.println("Invalid password! Access denied.");
        }

    }

    private String encryptPassword(String password) {
        // Simple encryption logic (placeholder)
        return "encrypted_" + password;
    }

    private boolean authenticate(String enteredPassword) {
        return this.encryptedPassword.equals(enteredPassword);
    }

}