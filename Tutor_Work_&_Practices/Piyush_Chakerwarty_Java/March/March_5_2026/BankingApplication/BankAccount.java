package BankingApplication;

public class BankAccount {
    // Create a private double balance variable. 
    private double balance;

    // Write a method public void deposit(double amount) that adds to the balance.
    public void deposit (double amount) {
        balance += amount; // Adds the amount to the balance
    }

    // Write a method public void withdraw(double amount) throws InsufficientFundsException. 
    public void withdraw(double amount) throws InsufficientFundsException {
        // Inside withdraw, check if amount > balance. If it is, calculate the difference 
        // and throw new InsufficientFundsException(difference);. Otherwise, deduct the amount. 
        if (amount > this.balance) {
            double difference;
            difference = amount - this.balance;
            throw new InsufficientFundsException(difference);

        } 
        balance -= amount;
        // Line 19 subtracts the amount from the balance. 
        System.out.println("Successfully withdrew amount: " + amount);
        System.out.println("Current Balance = " + balance);
    }
}

