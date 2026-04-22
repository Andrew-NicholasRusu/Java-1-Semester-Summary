package January_30_2026.Homework;

public class CelsiusToFahrenheit {
    
    // Method to convert Celsius to Fahrenheit
    public static double toFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
    
    public static void main(String[] args) {
        double tempF = toFahrenheit(0);
        System.out.println(tempF); // Expected: 32.0
        
        tempF = toFahrenheit(25);
        System.out.println(tempF); // Expected: 77.0
        
        tempF = toFahrenheit(100);
        System.out.println(tempF); // Expected: 212.0
    }
}