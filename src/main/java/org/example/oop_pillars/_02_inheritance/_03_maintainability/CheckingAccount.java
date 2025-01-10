package org.example.oop_pillars._02_inheritance._03_maintainability;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String password, double initialBalance, double overdraftLimit) {
        super(accountNumber, password, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount, String enteredPassword) {
        if (authenticate(enteredPassword)) {
            if (amount > 0 && getBalance(enteredPassword) + overdraftLimit >= amount) {
                double currentBalance = getBalance(enteredPassword);
                if (currentBalance >= amount) {
                    super.withdraw(amount, enteredPassword);
                } else {
                    double overdraftUsed = amount - currentBalance;
                    logTransaction("Overdraft", overdraftUsed);
                    System.out.println("Overdraft of " + overdraftUsed + " used.");
                    System.out.println("Transaction completed.");
                }
            } else {
                System.out.println("Invalid withdrawal amount or exceeds overdraft limit!");
            }
        } else {
            System.out.println("Invalid password! Transaction denied.");
        }
    }
}