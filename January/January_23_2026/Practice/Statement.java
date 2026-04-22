import java.util.Scanner;

public class Statement {

    // Write a program to take an integer as user input.  If the value is divisible by 3, print "Fizz" to the console. 
    // If the value is divisible by 5 print "Buzz" to the console. If the value is divisible by both 3 and 5 print "FizzBuzz" to the console. 
    // If the number is not divisible by either 3 or 5, print "Hello world!" to the console.
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number;
        System.out.println("Give me a number to see if it can be divided by 3 and 5.");
        number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) { // Placed here because it is the first place the output selects (print statements)
            System.out.println("FizzBuzz"); 
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz"); 
        } else {
            System.out.println("Hello World!");
        }


    }
}