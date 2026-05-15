package Recursion;

import static Recursion.Factorial_Example.Fibonacci.Fib;

// Factorial using recursion
class Factorial_Example {
    // recursive method
    int fact (int n) {
        int result;

        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }

// Fibonacci Example
static class Fibonacci {
    static int Fib(int N) { // Function to return Fibonacci value
        if (N == 0 || N == 1) {
            return N;
        }
        return Fib(N - 1) + Fib(N - 2);
    }
}

// Working of recursion
static class RecursionWorking {
        static void printFun(int test) {
            if (test < 1) {
                return;
            } else {
                System.out.printf("%d ", test);
                // Statement 2
                printFun(test - 1);
                System.out.printf("%d ", test);
                return;
            }
        }
    }

    public static void main(String[] args) {
        // Recursive
        Factorial_Example f = new Factorial_Example();
        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 4 is " + f.fact(4));
        System.out.println("Factorial of 5 is " + f.fact(5));

        System.out.println(); // Space

        System.out.println("Fibonacci of " + 3 + " is " + Fib(3));
        System.out.println("Fibonacci of " + 4 + " is " + Fib(4));
        System.out.println("Fibonacci of " + 5 + " is " + Fib(5));

        System.out.println(); // Space
        int test = 3;
        RecursionWorking.printFun(test);
    }
}
