package org.example.oop_pillars._02_inheritance._04_scalability;

public class FixedDepositAccount extends BankAccount {
    private int lockInPeriodInMonths;

    public FixedDepositAccount(String accountNumber, String password, double initialBalance, int lockInPeriodInMonths) {
        super(accountNumber, password, initialBalance);
        this.lockInPeriodInMonths = lockInPeriodInMonths;
    }

    public int getLockInPeriod() {
        return lockInPeriodInMonths;
    }

    @Override
    public void withdraw(double amount, String enteredPassword) {
        System.out.println("Withdrawals are not allowed before the lock-in period.");
    }
}