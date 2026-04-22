// Write a  program to take a number as input and display the sum of all its factors. 
import java.util.Scanner;

public class Loop_Work_1 {
    public static void main(String[] args) {
        int number;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % 1 == 0) {
                System.out.println(i);
                total = total + 1;
            }
        }
        System.out.println("Sum of factors: " + total);
    }
}