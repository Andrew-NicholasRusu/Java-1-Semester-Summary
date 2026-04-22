package January_30_2026.Homework;

public class ATM {

    public static String validateWithdrawal (double currentBalance, double requestAmount) {
        if (requestAmount > currentBalance) {
            return "Insufficient Funds";
        } else if (requestAmount <= 0) {
            return "Invalid Amount";
        } else {
            return ("Remaining Balance: " + (currentBalance - requestAmount));
        }
        }
        public static void main(String[] args) {
            String status = validateWithdrawal(500.0, 600);
            System.out.println(status);
            status = validateWithdrawal(500.0, 150.0);
            System.out.println(status);
            status = validateWithdrawal(500.0, -20.0);
            System.out.println(status);
        }
    }
