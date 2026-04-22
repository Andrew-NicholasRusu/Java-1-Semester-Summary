// Write a program to take time in hours as input and convert it into minutes and seconds.
import java.util.Scanner;

public class Structure_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours;

        System.out.println("Please enter the time in hours: ");
        hours = sc.nextInt();

        int minutes = hours * 60;
        System.out.println("Time in minutes: " + minutes + " minutes");

        int seconds = hours * 3600;
        System.out.println("Time in seconds: " + seconds + " seconds");
    }
}