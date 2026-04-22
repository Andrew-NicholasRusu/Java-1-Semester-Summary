package January_29_2026.Practices;

public class Method_Practice_3 {
    public static int addition(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main (String[] args) {
        int total; 
        total = addition(10, 20);
        System.out.println("Total = " + total);

        total = addition(100, 300);
        System.out.println("Total = " + total);

        total = addition(101, 222);
        System.out.println("Total = " + total);
    }
}
