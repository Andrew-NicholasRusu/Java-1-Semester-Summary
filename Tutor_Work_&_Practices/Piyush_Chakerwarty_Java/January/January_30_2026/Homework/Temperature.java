package January_30_2026.Homework;

import java.util.Scanner;
public class Temperature {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice of either 1 or 2: ");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        
        int choice = sc.nextInt();
        
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice! Please run the program again and enter 1 or 2.");
            sc.close();
            return;
        }
        
        System.out.print("Enter the temperature to convert: ");
        double temperature = sc.nextDouble();
        double convertedTemperature;
        
        if (choice == 1) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.printf("Temperature in Celsius: %.2f°C\n", convertedTemperature);
        } else {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.printf("Temperature in Fahrenheit: %.2f°F\n", convertedTemperature);
        }
        
    }

}
