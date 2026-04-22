// Write a program to input 10 integers using a loop and display the largest and smallest numbers among them. 
import java.util.Scanner; 

public class Loop_Work_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int largest = number;
        int smallest = number;

        System.out.println("Input 10 integers to find the largest and smallest numbers among them.");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number " + i + ": ");
            number = sc.nextInt();
            if (number > largest) {
                largest = number;
            } 

            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}