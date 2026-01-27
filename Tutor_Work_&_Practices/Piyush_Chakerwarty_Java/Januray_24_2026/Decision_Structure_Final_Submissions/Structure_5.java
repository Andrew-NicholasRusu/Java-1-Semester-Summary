// Write a program to calculate total time in seconds when hours, minutes, and seconds are given as input.

import java.util.Scanner;

public class Structure_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int hour;
        int minute;
        int second;

        System.out.println("Enter the amount of hours: ");
        hour = sc.nextInt();

        System.out.println("Enter the amount of minutes: ");
        minute = sc.nextInt();

        System.out.println("Enter the amount of seconds: ");
        second = sc.nextInt();

        int totalseconds = (hour * 3600) + (minute * 60) + second;
        System.out.println("Total time in seconds: " + totalseconds + " seconds");

    }
}