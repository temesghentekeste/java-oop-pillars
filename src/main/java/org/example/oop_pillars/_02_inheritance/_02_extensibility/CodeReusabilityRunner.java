package org.example.oop_pillars._02_inheritance._02_extensibility;

public class CodeReusabilityRunner {
    public static void main(String[] args) {
        SavingsAccount savingAccount = new SavingsAccount("00900675420", "password", 45000, 20);
        double initialBalance = savingAccount.getBalance("password");
        System.out.println("Initial Balance: " + initialBalance);
        savingAccount.applyInterest("password");
        double interestAppliedBalance = savingAccount.getBalance("password");
        System.out.println("Post Interest Balance: " + interestAppliedBalance);



    }
}
