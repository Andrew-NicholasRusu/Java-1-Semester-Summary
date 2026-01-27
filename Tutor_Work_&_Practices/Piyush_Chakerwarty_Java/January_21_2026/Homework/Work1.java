import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score for Maths:");
        int math = sc.nextInt();
        System.out.println("Enter the score for English:");
        int english = sc.nextInt();
        System.out.println("Enter the score for Science:");
        int science = sc.nextInt();
        System.out.println("Enter the score for History:");
        int history = sc.nextInt();
        System.out.println("Enter the score for Computer Science:");
        int compscience = sc.nextInt();
        double average = (math + english + science + history + compscience) / 5;
        System.out.println("The average score of the 5 subjects is: " + average);
        

    }
}