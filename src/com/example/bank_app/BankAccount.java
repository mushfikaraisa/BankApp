package com.example.bank_app;

class BankAccount {
    /**
     * Balance of the checking account
     */
    private double checkingBalance = 0.0;

    /**
     * Balance of the savings account
     */
    private double savingsBalance = 0.0;

    /**
     * The opening deposit for the checking account
     */
    private final double checkingOpeningDeposit;

    /**
     * The opening deposit for the savings account
     */
    private final double savingsOpeningDeposit;

    /**
     * Constructor
     *
     * @param checkingOpeningDeposit The opening deposit for the checking account
     * @param savingsOpeningDeposit The opening deposit for the savings account
     */
    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;

        // Set the starting balances
        this.checkingBalance += checkingOpeningDeposit;
        this.savingsBalance += savingsOpeningDeposit;
    }

    /**
     * Get the checking account balance
     *
     * @return The checking account balance
     */
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    /**
     * Get the savings account balance
     *
     * @return The savings account balance
     */
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    /**
     * Withdraw money from the checking account
     *
     * @param amount The amount to withdraw
     */
    public void withdrawChecking(double amount) {
        // Check for a sufficient balance
        if (amount <= checkingBalance) {
            checkingBalance -= amount;
        } else if (amount <= checkingBalance + savingsBalance) {
            // If the savings balance has enough, let the user know
            System.out.println("A balance transfer is required to withdraw this amount.");
        } else {
            // Insufficient balance
            System.out.println("Insufficient balance.");
        }
    }

    /**
     * Withdraw money from the savings account
     *
     * @param amount The amount to withdraw
     */
    public void withdrawSavings(double amount) {
        // Check for a sufficient balance
        if (amount <= savingsBalance) {
            savingsBalance -= amount;
        } else if (amount <= checkingBalance + savingsBalance) {
            // Enough funds only after balance transfer
            System.out.println("A balance transfer is required to withdraw this amount.");
        } else {
            // Not enough funds
            System.out.println("Insufficient balance.");
        }
    }

    /**
     * Transfer money to checking account from savings
     *
     * @param amount The amount to transfer
     */
    public void transferToSavings(double amount) {
        // If there are enough funds
        if (amount <= checkingBalance) {
            checkingBalance -= amount;
            savingsBalance += amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    /**
     * Transfer money to savings account from checking
     *
     * @param amount The amount to transfer
     */
    public void transferToChecking(double amount) {
        // If there are enough funds
        if (amount <= savingsBalance) {
            savingsBalance -= amount;
            checkingBalance += amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    /**
     * Deposit money into checkings account
     *
     * @param amount The amount to deposit
     */
    public void depositChecking(double amount) {
        this.checkingBalance += amount;
    }

    /**
     * Deposit money into savings account
     *
     * @param amount The amount to deposit
     */
    public void depositSavings(double amount) {
        this.savingsBalance += amount;
    }
}
