package Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input.
        Scanner sc = new Scanner(System.in);

        // Get a file name from the user
        System.out.println("Enter the name of a file:");
        String fileName = sc.nextLine();

        try { // Attempt to open the file
            File file = new File (fileName);

            // Create a Scanner object to read the file. If it does not exit, the following
            // statement will throw a FileNotFoundException
            Scanner inputFile = new Scanner(file);
            // If the file was successfully opened, the following statement will execute
            System.out.println("The file was found.");
        } catch (FileNotFoundException e) {
            // If the file was successfully opened, the following statement will execute.
            System.out.println("File not found");
        }
        System.out.println("Program is done.");
    }
}
