package org.example.oop_pillars._01_encapsulation.reusability;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String password;

    public BankAccount(String accountNumber, String password, double initialBalance) {
        this.accountNumber = accountNumber;
        this.password = password;
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

    private boolean authenticate(String enteredPassword) {
        return this.password.equals(enteredPassword);
    }

}