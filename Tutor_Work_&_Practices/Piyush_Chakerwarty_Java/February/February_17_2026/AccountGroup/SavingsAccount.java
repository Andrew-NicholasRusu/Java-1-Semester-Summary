package February.February_17_2026.AccountGroup;

public class SavingsAccount extends BankAccount {
    // New Attribute
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super (accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method Overriding
    @Override
    public void withdraw (double amount) {
        this.balance = this.balance - amount - 2.00;
        // Every withdrawal should substract an extra $2.00 fee from the balance.
        System.out.println(this.balance);
    }

    // Unique Method
    public void applyInterest() {
        // This method should multiply the current balance by the interestRate 
        // and add that amount to the total balance.
        this.balance = this.balance * interestRate + this.balance;
        System.out.println(this.balance); 
    }

    // Method to print the accountHolder name directly
    public void printHolder() {
        System.out.println(this.accountHolder);
    }
}
