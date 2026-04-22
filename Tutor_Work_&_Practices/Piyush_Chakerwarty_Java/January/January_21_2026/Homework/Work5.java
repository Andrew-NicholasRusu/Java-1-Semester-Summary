import java.util.Scanner;

public class Work5{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();

        double Celcius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celcius: " + Celcius);

    }
}