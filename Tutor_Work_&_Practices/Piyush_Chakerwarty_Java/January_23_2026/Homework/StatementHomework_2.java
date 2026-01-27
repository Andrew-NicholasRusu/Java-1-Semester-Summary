import java.util.Scanner;

public class StatementHomework_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int Water;
        System.out.println("Display the water comsumption");
        Water = sc.nextInt();

        if (Water > 5000) {
            System.out.println("Excessive");
        } else if (Water >= 3001 && Water <= 5000) {
            System.out.println("High");
        } else if (Water >= 1001 && Water <= 3000) {
            System.out.println("Moderate");
        } else if (Water >= 501 && Water <= 1000) {
            System.out.println("Low");
        } else if (Water >= 0 && Water <= 500) {
            System.out.println("Minimal");
        } else if (Water < 0) {
            System.out.println("Invalid Usage");
        }
        

    }
}