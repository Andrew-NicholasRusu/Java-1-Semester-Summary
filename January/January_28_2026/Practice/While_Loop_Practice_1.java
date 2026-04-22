import java.util.Scanner;

public class While_Loop_Practice_1 {
    public static void main(String[] args) {
        // Write a program that prompts the user to enter a password. Keep asking for the password
        // until the user enters the correct password, whihc is "password123". Once the correct password is entered, 
        // print "Access granted!".

        String SECRET = "password123";

        System.out.print("Enter password: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        while (!password.equals(SECRET)) {
            System.out.println("Incorrect password.");
            System.out.println("Enter password: ");
            password = sc.next();
        }
        System.out.println("Access Granted!!!");

        // break, continue, and true statements

        while (true) { // running infinite loop
            System.out.print("Enter password: ");
            password = sc.next();
            // if the password is the same as the SECRET, password then stops
            if (password.equals(SECRET)) {
                System.out.println("Access Granted!!!");
                break;
            }
            System.out.println("Incorrect password");
        }
    }
}