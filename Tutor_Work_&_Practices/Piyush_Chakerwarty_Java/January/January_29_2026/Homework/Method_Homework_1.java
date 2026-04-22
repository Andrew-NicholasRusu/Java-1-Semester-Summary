package January_29_2026.Homework;

public class Method_Homework_1 {
    // Question 1
    public static void greet() {
        System.out.println("Hello, ");
    }

    // Question 2
    public static void increment() {
        int x = 10;
        x = x + 1;
    }

    // Question 3
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero or Less");
        }
    }

    // Question 4
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Question 5
    public static int calculate() {
        int c = 5;
        int d = 5;
        int sum = c + d;
        return sum;
        // System.out.println("Calculation Done!");
    }

    // Question 6
    public static double half(double num) {
        return num / 2;
    }

    // Question 7
    public static void display(int e, int f) {
        int total = e + f;
        if (total > 20) {
            System.out.println("High");
        } else {
            System.out.println("Low");
        }
    }

    // Question 8 
    public static void combine(String text, int count) {
        System.out.println(text + " " + count);
    }

    public static void main(String[] args) {
        // Question 1
        greet(); // Function call
        System.out.print("World! ");
        greet(); // Function call

        // Question 2
        System.out.println();
        int x = 5;
        increment(); // Function call
        System.out.println(x); // Output will still be 5

        // Question 3
        System.out.println();
        int val = -5;
        checkNumber(val + 10); // Function call

        // Question 4
        System.out.println();
        int result = multiply(2, 5); // Function call
        System.out.println(result = multiply(1, 2)); // Output will be 2

        // Question 5
        System.out.println();
        calculate(); // Inputs not provided
        // System.out.println("Calculation Done!"); // This line is commented out in the method
        int calcResult = calculate();
        System.out.println(calcResult); // Output will be 10

        // Question 6
         System.out.println();
        double division = half(10.0) + half(5.0);
        System.out.println(division); // Output will be 7.5 because 5.0 + 2.5 = 7.5

        // Question 7
         System.out.println();
        display(15,10); // Function call

        // Question 8
        System.out.println();
        combine("Apples: ", 5);

        // combine(5, "Apples: "); // This will cause a compile-time error due to argument type mismatch
    }
}
