package com.abcbank.domain;

public class CustomerAccount {
    private int currentBalance;

    public CustomerAccount(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void deposit(int amount) {
        currentBalance = currentBalance + amount;
    }

    public int getBalance() {
        return currentBalance;
    }
}
