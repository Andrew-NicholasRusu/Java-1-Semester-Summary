import java.util.Scanner;

public class Decision_Structure_Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int c = 10;
        double weight;
        double height;

    // Logical Operators
        System.out.println(a > b && a > c); // false
        System.out.println(a >= c && b > c); // true
        System.out.println(b >= c || a == c); // true
        System.out.println(a == c || b != c);  // true
        System.out.println(a < b && !(b != c)); //false

    // Decision structures
        System.out.println("Please enter the weight in kilograms:");
        weight = sc.nextDouble();
        System.out.println("Please enter the height in meters:");
        height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("BMI:" + BMI);
        if (BMI < 18.5) {
            System.out.println("Category: Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Category: Normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Category: Overweight");
        } else if (BMI >= 30) {
            System.out.println("Category: Obesity");
        }
    }
}