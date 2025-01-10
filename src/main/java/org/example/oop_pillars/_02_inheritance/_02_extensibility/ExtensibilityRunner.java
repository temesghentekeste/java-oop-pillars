package org.example.oop_pillars._02_inheritance._02_extensibility;

public class ExtensibilityRunner {
    public static void main(String[] args) {
        System.out.println("Saving account transactions:");
        SavingsAccount savingAccount = new SavingsAccount("00900675420", "password", 45000, 20);
        double initialBalance = savingAccount.getBalance("password");
        System.out.println("Initial Balance: " + initialBalance);
        savingAccount.applyInterest("password");
        double interestAppliedBalance = savingAccount.getBalance("password");
        System.out.println("Post Interest Balance: " + interestAppliedBalance);


        System.out.println("Checking account transactions:");
        CheckingAccount checkingAccount = new CheckingAccount("200908765002", "abc", 55000, 5000);
        checkingAccount.withdraw(3000, "abc");
        checkingAccount.withdraw(53000, "abc");
        checkingAccount.withdraw(90000, "abc");
    }
}
