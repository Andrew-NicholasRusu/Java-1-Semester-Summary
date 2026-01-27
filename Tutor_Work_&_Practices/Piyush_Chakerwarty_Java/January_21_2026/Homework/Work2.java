import java.util.Scanner;

public class Work2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int integer1 = sc.nextInt();
        System.out.println("Enter the second integer:");
        int integer2 = sc.nextInt();
        System.out.println("Enter the third integer:");
        int integer3 = sc.nextInt();

        int sum = (integer1 + integer2 + integer3);
        int average = integer2;
        double difference = (sum / average);
        System.out.printf("The difference between the sum and average is: " + difference);
    }
}