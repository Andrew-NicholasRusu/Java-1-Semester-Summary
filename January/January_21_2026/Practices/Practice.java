import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width = sc.nextInt();
        double area = length * width;
        System.out.println("Are of the rectangle:" + area);
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle:" + perimeter);
        
    }
}