package February.February_17_2026.AccountGroup;

public class BankAccount {
    // Attributes
    protected String accountHolder;
    protected double balance;
    
    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method Overloading (Depositing)
    public void deposit (double amount) {
        this.balance = this.balance + amount;
        System.out.println(this.balance);
    }

    public void deposit (double amount, String source) {
        this.balance = this.balance + amount;
        // Adds the amount to the balance
        System.out.println("Received $[" + amount + "] from [" + source + "]. \nNew balance: $[" + balance + "]");
    }

    // Method to Override
    public void withdraw (double amount) {
        this.balance = this.balance - amount;
        System.out.println(this.balance);
        
    }



    
}
