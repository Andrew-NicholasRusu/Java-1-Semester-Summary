import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = sc.nextInt();
        int lastDigit1 = number1 % 10;
        System.out.println("Enter a number:");
        int number2 = sc.nextInt();
        int lastDigit2 = number2 % 10;
        System.out.println("Enter a number:");
        int number3 = sc.nextInt();
        int lastDigit3 = number3 % 10;
        int total = lastDigit1 + lastDigit2 + lastDigit3;
        System.out.println("Sum of last digits:" +total);
    }
}