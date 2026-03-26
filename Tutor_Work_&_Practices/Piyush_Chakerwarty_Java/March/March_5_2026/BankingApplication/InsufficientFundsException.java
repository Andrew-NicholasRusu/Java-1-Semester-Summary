package BankingApplication;
// Create a new class named InsufficientFundsException that extends 
// Exception (making it a Checked Exception). 

public class InsufficientFundsException extends Exception {
    // Create a constructor that accepts a String message and passes it to the superclass using super(message);. 
    public InsufficientFundsException (String message) {
        super(message);
    }

    // Create a second constructor that accepts a double shortfall and passes a message like 
    // "Transaction failed. Short by: $" + shortfall to the superclass. 
    public InsufficientFundsException (double shortfall) {
        System.out.println("Transaction failed. Short by: $" + shortfall);
    }

}
