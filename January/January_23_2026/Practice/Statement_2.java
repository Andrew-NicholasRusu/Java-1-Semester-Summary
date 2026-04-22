import java.util.Scanner;

public class Statement_2 {
    // Write a program to input an integer and check whether it's a 5 digit number or not. If it is, extract the middle digit.
    // Ex: Input: Enter an integer: 12345  
    // output: Central digit: 3
    // Input: Enter an integer: 123
    // Output: Not a 5 digit number
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number;
        System.out.println("Input an integer with a 5 digit number.");
        number = sc.nextInt();

        if (number >= 10000 && number <= 99999) {
            int x = number / 100; // This makes the next number have 3 digits and 2 decimals
            int middle = x % 10; // The modules checks the last number and focuses to remove the first 2 digits.
            System.out.println("Output: Central Digit: " + middle);
        } else {
            System.out.println("Output: Not a 5 digit number");
        }
    }

}

