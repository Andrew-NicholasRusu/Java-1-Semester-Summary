package February.February_17_2026.AccountGroup;

public class AccountMain {
    public static void main(String[] args) {
        // Task 1: Testing Overloaded Deposits
        SavingsAccount account1 = new SavingsAccount("Alex", 1000, 0);

        // Perform a simple deposit of $500.
        account1.deposit(500); // Adds 500 to the balance. 

        // Perform a deposit of $200 with the source "Birthday Gift."
        account1.deposit(200, "Birthday Card");
        // Received $[200.0] from [Birthday Card].
        
        // Do both methods update the same balance correctly?

        System.out.println();
        // Task 2: Testing Overridden Withdrawals 
        // Withdraw $100 from the account. 
        account1.withdraw( 100);
        // Print the final balance. 
        account1.getBalance();
        // Logic Check: If the balance was $1,700, after withdrawing $100, is the balance $1,600 or $1,598? (It should be $1,598 because of the $2 fee). 
        
        // Task 3: Access Control Check 
        // Inside the SavingsAccount class, try to write a method that prints the accountHolder name directly. 
        // Now, change the accountHolder in the parent class from protected to private. 
        account1.printHolder();

        // Observation: What happens to your child class code? This demonstrates why we use protected for inheritance. 
            // if accountHolder is private, then the printHolder method won't work in the child class. 
    }

}
