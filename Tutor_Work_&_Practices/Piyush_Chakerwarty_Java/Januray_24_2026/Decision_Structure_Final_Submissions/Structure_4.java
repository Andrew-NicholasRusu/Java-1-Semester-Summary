// Write a program to find the speed of a moving object given the distance covered and the time taken.
import java.util.Scanner;

public class Structure_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance;
        int time;
        System.out.println("Enter distance travelled (in km): ");
        distance = sc.nextInt();

        System.out.println("Enter time taken (in hours): ");
        time = sc.nextInt();

        double speed = (distance / time);
        System.out.println("Speed of the object: " + speed + " km/hr");


    }
}