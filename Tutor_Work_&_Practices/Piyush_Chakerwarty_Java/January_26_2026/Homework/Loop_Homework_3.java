// Find the count of all the numbers between 1 to 20 which are divisble by 3.

public class Loop_Homework_3 {
    public static void main(String[] args) {
        System.out.println("Count of all numbers that are divisible by 3: ");
        int count = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}