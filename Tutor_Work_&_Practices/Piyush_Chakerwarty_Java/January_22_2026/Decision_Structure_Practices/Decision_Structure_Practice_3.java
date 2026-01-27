import java.util.Scanner;

public class Decision_Structure_Practice_3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Input an integer:");
        input = sc.nextInt();

        if (input >= 10 && input < 100) {
            System.out.println(+ input + " is a two digit number.");
        } else {
            System.out.println(+ input + " is not a two digit number."); 
        }
    }
}