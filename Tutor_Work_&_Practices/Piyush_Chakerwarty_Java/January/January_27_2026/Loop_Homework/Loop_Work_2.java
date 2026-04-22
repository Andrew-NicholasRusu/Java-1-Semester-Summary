// Write a program that asks the user to input 5 integers using a loop and calculates their total sum. 
import java.util.Scanner;

public class Loop_Work_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 5;
        int total = 0;
        System.out.println("Enter a total of 5 numbers to find its sum");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            number = sc.nextInt();
            total = total + i;
        }
        System.out.println(total);
        
    }
}