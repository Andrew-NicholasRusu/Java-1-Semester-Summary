import java.util.Scanner; 

// Write a program to enter the numbers till the user enters -1 and at the end it should display 
// the sum of all the numbers entered. 
public class While_Loop_Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negative = -1;
        int total = 0;

        System.out.println("Enter numbers and put -1 to stop the program: ");
        int number = sc.nextInt();

        while (number != negative) {
            total = total + number;
            System.out.println("Enter numbers and put -1 to stop the program: ");
            number = sc.nextInt();
        }
        System.out.println("Finish!");
        System.out.println(total);
    }

}