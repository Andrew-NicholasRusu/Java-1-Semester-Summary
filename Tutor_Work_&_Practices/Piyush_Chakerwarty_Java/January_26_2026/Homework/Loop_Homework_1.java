// Write a program to display all the numbers between 1 to 20 which are divisible by 3.

public class Loop_Homework_1 {
    public static void main(String[] args) {
        System.out.println("All the numbers between 1 to 20 that are divisible by 3: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}