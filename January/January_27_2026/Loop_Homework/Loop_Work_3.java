// Take 10 integer inputs using a loop. Print the sum of all two-digit numbers and three-digit numbers separately. 
import java.util.Scanner;

public class Loop_Work_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumTwoDigit = 0;
        int sumThreeDigit = 0;
        int number;

        System.out.println("Enter a total of 10 integers.");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number "+ i + ": " );
            number = sc.nextInt();

            if (number >= 10 && number <= 99) {
                sumTwoDigit = sumTwoDigit + number;
            } else if (number >= 100 && number <= 999) {
                sumThreeDigit = sumThreeDigit + number;
            }
        }
        System.out.println("Sum of two-digit numbers: " + sumTwoDigit);
        System.out.println("Sum of three-digit numbers: " + sumThreeDigit);
    }
}