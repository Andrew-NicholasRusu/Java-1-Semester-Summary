import java.util.Scanner;

public class Decision_Structure_Homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Please print a number for me to determine if it is and odd or an even.");
        number = sc.nextInt();
        System.out.println("Input: number = " + number);
        if (number % 2 == 0) {
            System.out.println("Output: " + number + " is an even number.");
        } else {
            System.out.println("Output: " + number + " is an odd number.");
        }
    }
}