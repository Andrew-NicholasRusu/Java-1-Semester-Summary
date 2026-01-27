// Write a program to check if a given number is a prime number or not. 
import java.util.Scanner;

public class Loop_Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count = count + 1;
            // Secretly finds all the factors in a number. It also counts the number of factors in a number with count.
            }
        }

        if (count == 2) { // Used to determine if there are 2 factors in a number (2 factors = prime number)
            System.out.println(+ number + " is a prime number.");
        } else {
            System.out.println(+ number + " is not a prime number.");
        }
    }
}