package Exception_Handling;

// Object_Serialization_Example
import java.io.Serial;
import java.io.Serializable;

public class BankAccount implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String accountHolder;
    private double balance;

    private transient int securityPin;

    public BankAccount(String accountHolder, double balance, int securityPin) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.securityPin = securityPin;
    }

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

    public int getSecurityPin() {
        return securityPin;
    }

    public void setSecurityPin(int securityPin) {
        this.securityPin = securityPin;
    }

    @Override
    public String toString() {
        return "Account Holder: " + accountHolder +
                "\nBalance: $" + balance +
                "\nSecurity PIN: " + securityPin;
    }
}
