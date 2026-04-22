package January_29_2026.Practices;

public class Method_Practice_1 {
    public static int addition() { // Declaration
        int a = 10;
        int b = 20;
        int c = a + b;
        return c; // Method body
    }
    public static void main(String[] args) {
        int total = addition(); // Function call
        System.out.println("Total = " + total);
    }
}
