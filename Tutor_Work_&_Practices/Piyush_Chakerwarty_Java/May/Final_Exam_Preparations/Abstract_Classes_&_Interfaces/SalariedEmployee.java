import java.util.*;

public class SalariedEmployee {

    // Field
    private double monthlySalary;

    public static void main(String[] args) {
        // Create an ArrayList<Payable>
        ArrayList<Payable> payables = new ArrayList<Payable>();

        payabl



        // Loop through the list and print the calculated pay for each item, demonstrating polymorphism with interfaces.
        for (Payable payable : payables) {
            System.out.println("Calculated Pay: " + payable.getPaymentAmount());
        }
    }

}
