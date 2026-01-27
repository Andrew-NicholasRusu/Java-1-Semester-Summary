// Find the sum of all the numbers between 1 to 20 which are divisible by 3.

public class Loop_Homework_2 {
    public static void main(String[] args) {
        System.out.println("Total sum of all numbers that are divisible by 3: ");
        int total = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                total = total + i;
            }
        }
        System.out.println(total);
    }
}