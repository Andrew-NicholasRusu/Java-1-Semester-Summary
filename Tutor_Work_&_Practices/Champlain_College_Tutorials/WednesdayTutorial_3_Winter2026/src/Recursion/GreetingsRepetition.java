package Recursion;

public class GreetingsRepetition {
    public static void sayHi (int count) {
        if (count <= 1) {
            return;
        }
        System.out.println("Hi!");
        sayHi(count - 1);
    }

// Countdown with Recursion
    public static void countdown(int n) {
        if (n > 0) {
            System.out.print(n + "");
            countdown(n - 1);
        }
    }

// Calculating Factorial with Recursion
    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

// Adding all numbers using Recursion:
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum (start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        sayHi(3);
        countdown(5);
        System.out.println("Factorial of 8 is " + factorial(8));

        int result =  sum (5, 10);
        System.out.println(result);
    }
}
