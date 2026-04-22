import java.util.Scanner;

public class Loop_Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number;
        int count = 0;
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        System.out.println("Factors: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count = count + 1;
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Total number of factors: " + count);
    }
}