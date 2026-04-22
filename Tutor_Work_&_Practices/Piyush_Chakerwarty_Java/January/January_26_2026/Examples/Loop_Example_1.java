public class Loop_Example_1 {
    public static void main(String[] args) {

        // For loop example
        System.out.println("For loop example: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println();  // Space for organizing

        // Find the even numbers
        System.out.println("Even number showcase: ");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }

        // Or you can do like this:
        System.out.println();
        System.out.println("Loop with if statement:");

        for (int i = 1; i < 11; i++) {
            // Check if any number is divisible by 2:
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Sum of all the numbers between 1 to 10 (inclusive)
        System.out.println();
        System.out.println("Addition of all numbers:");

        int total = 0;
        for (int i = 1; i < 6; i++) {
            total = total + i;
        }
        System.out.println(total);

        // Counting
        System.out.println();
        System.out.println("Counting how many times the program runs");

        int count = 0;
        for (int i = 1; i < 6; i++) {
            count = count + 1;
        }
        System.out.println(count);
        
    }
}