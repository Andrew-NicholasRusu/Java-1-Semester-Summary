package February.February_2_2026;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import javax.sound.sampled.SourceDataLine;
public class Array_And_Arraylist_Practice_For_Java {
    /**
     * Problem 1: Hours for each employee
     */

    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 3; // Number of employees
        int[] hours = new int [NUM_EMPLOYEES]; // Array that holds employee hours
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hours work by " + NUM_EMPLOYEES + " employees.");

        // Get employee 1's hours
        System.out.println("Employee 1: ");
        hours[0] = sc.nextInt(); // Arrays start at index 0.

        // Get employee 2's hours
        System.out.println("Employee 2: ");
        hours[1] = sc.nextInt();

        // Get employee 3's hours
        System.out.println("Employee 3: ");
        hours[2] = sc.nextInt();

        // Display the values in the array.
        System.out.println("The hours you entered are: ");
        System.out.println(hours[0] + " hours");
        System.out.println(hours[1] + " hours");
        System.out.println(hours[2] + " hours");
    }

    /**
     * Problem 2: Using a String Array to find the days in a month
     */

    // Create an array of Strings containing the names of the months.
    String[] months = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};

    // Create an array of ints containing the numbers of days in each month.
    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // Display the months and the days in each.
    for (int index = 0; index < months.length; index++) {
        System.out.println(months[index]+ " has " + days[index] + " days.");
    }
    

    /**
     * Problem 3: Calling String Methods from an Array Element
     */

    String [] names = {"Bill", "Susan", "Steven", "Jean"}; // Creates an array of Strings

    for (int index = 0; index < names.length; index++) {
        System.err.println(names[index].toUpperCase());
    }
}
