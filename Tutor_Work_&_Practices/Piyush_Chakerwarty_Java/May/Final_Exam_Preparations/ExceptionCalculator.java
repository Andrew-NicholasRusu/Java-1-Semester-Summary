import java.util.*;


public class ExceptionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int addition = 1;
        int subtraction = 2;
        int multiplication = 3;
        int division = 4;
        try {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();
            System.out.println("Enter the operation you want to perform: ");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("The result of addition is: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("The result of subtraction is: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("The result of multiplication is: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("The result of division is: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        } catch (Exception e) {
        }
    }
}
