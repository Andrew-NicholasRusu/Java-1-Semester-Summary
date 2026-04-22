// Write a program to input the three sides of a triangle and calculate its perimeter.
import java.util.Scanner;

public class Structure_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int side1;
        int side2;
        int side3;
        System.out.println("Input the the length of the 3 sides of the triangle:");
        side1 = sc.nextInt();
        side2 = sc.nextInt();
        side3 = sc.nextInt();

        int perimeter = side1 + side2 + side3;

        System.out.println("Perimeter of the triangle: " + perimeter);


    }

}