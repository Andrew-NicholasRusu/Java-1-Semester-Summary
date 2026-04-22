package January_29_2026.Practices;

public class Method_Practice_2 {
    // Parameters: varaibles that are passed to a method that stores values locally for each function.
    public static void addition(int a, int b) {
        int c = a + b;
        System.out.println("Total = " + c);
    }
    public static void main(String[] args) {
        // Arguments: values that are passed for each corresponding parameter.
        addition(10, 20); // Function call
        addition(30, 40); // Function call'
        addition(100, 300); // Function call
        addition(101, 222); // Function call
    }
}
