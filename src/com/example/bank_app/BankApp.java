package com.example.bank_app;

class BankApp {
    public static void main(String[] args) {
        // Create a bank account instance
        BankAccount customerAcct = new BankAccount(100.0, 500.0);

        // Get the starting balances
        System.out.println("Starting balances: ");
        System.out.println("Checking: $" + customerAcct.getCheckingBalance());
        System.out.println("Savings:  $" + customerAcct.getSavingsBalance());
        System.out.println();

        // Attempt to withdraw
        System.out.println("Withdrawing $50 from checking account...");
        customerAcct.withdrawChecking(50.0);
        System.out.println("New checking balance is $" + customerAcct.getCheckingBalance());
        System.out.println();

        System.out.println("Withdrawing $250 from savings account...");
        customerAcct.withdrawSavings(250.0);
        System.out.println("New savings balance is $" + customerAcct.getSavingsBalance());
        System.out.println();

        // Attempt to withdraw too much
        System.out.println("Attempting to withdraw $100 from checking...");
        customerAcct.withdrawChecking(100.0);
        System.out.println("New checking balance is $" + customerAcct.getCheckingBalance());
        System.out.println();

        System.out.println("Withdrawing $300 from savings account...");
        customerAcct.withdrawSavings(300.0);
        System.out.println("New savings balance is $" + customerAcct.getSavingsBalance());
        System.out.println();

        // Transfer 100 from savings to checking
        System.out.println("Transfering $100 from savings to checkings...");
        customerAcct.transferToChecking(100.0);

        // Transfer 50 from checkings to savings
        System.out.println("Transferring $50 from checkings to savings...");
        customerAcct.transferToSavings(50.0);

        // Check the balance again
        System.out.println("Current balances:");
        System.out.println("Checking: $" + customerAcct.getCheckingBalance());
        System.out.println("Savings:  $" + customerAcct.getSavingsBalance());
        System.out.println();

        // Deposit money into each account
        System.out.println("Depositing $100 into checkings...");
        customerAcct.depositChecking(100.0);

        System.out.println("Depositiing $200 into savings...");
        customerAcct.depositSavings(200.0);

        // Check the balance again
        System.out.println("Current balances:");
        System.out.println("Checking: $" + customerAcct.getCheckingBalance());
        System.out.println("Savings:  $" + customerAcct.getSavingsBalance());
    }
}
