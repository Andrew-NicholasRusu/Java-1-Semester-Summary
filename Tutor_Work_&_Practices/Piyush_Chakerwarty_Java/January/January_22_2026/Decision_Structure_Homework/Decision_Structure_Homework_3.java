import java.util.Scanner;

public class Decision_Structure_Homework_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int TotalCost;
        System.out.println("Enter the total cost: ");
        TotalCost = sc.nextInt();
        if (TotalCost < 200) {
            double Discount = 0.05;
            double amount = TotalCost - (TotalCost * Discount);
            System.out.println("Total cost: $" + TotalCost);
            System.out.println("Amount to be paid after discount: $" + amount);
        } else if (TotalCost >= 201 && TotalCost <= 500) {
            double Discount = 0.25;
            double amount = TotalCost - (TotalCost * Discount);
            System.out.println("Total cost: $" + TotalCost);
            System.out.println("Amount to be paid after discount: $" + amount);
        } else if (TotalCost >= 501 && TotalCost <= 1000) {
            double Discount = 0.35;
            double amount = TotalCost - (TotalCost * Discount);
            System.out.println("Total cost: $" + TotalCost);
            System.out.println("Amount to be paid after discount: $" + amount);
        } else if (TotalCost > 1000) {
            double Discount = 0.50;
            double amount = TotalCost - (TotalCost * Discount);
            System.out.println("Total cost: $" + TotalCost);
            System.out.println("Amount to be after discount: $" + amount);
        }
    }
}