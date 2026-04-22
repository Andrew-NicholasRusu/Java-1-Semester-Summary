import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal;
        int rate;
        int time;
        System.out.println("Enter the principal amount");
        principal = sc.nextInt();
        System.out.println("Enter the rate of interest");
        rate = sc.nextInt();
        System.out.println("Enter the amount of time taken");
        time = sc.nextInt();
        int interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + interest);
    }

}