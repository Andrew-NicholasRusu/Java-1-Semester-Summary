// Write a program to enter the numbers till the user enters ZERO and at the end.
// It should display the count of positive and negative numbers entered
import java.util.Scanner;

public class While_Loop_Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zero = 0;
        int positivecount = 0;
        int negativecount = 0;
        int number;

        System.out.println("Enter multiple numbers until you enter 0.");
        number = sc.nextInt();

        while (number != zero) {
            System.out.println("Enter multiple numbers until you enter 0.");
            number = sc.nextInt();
            if (number >= 0) {
                positivecount = positivecount + 1;
            } else if (number == 0) {
                System.out.println(); 
            } else {
                negativecount = negativecount + 1; 
            }
        }
        System.out.println("Finish!");
        System.out.println("Amount of positive numbers: " + positivecount);
        System.out.println("Amount of negative numbers: " + negativecount);
        
    }
}
