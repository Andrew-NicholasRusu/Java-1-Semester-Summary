package BankingApplication;

public class BankAccountMain {
    public static void main(String[] args) {

        // Instantiate a BankAccount and deposit $100. 
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(100);

        // Wrap a withdrawal of $150 in a try-catch block.
        // Catch your custom exception and print e.getMessage(). 
        try {
            bankAccount.withdraw(150);
        } catch (InsufficientFundsException e) {
            // InsufficientFundsException is the custom exception
            System.out.println(e.getMessage());
        }

 
        
    }

}
