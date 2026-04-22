package February.February_2_2026;

import java.util.Scanner;
public class Inheritance_Practice extends Inheritance_Support {
    public static void main (String[] args) {
    /**
     * Problem 1: Test Scoring
     */
    double testScore; // To hold a test score
    Scanner sc = new Scanner (System.in);

    Inheritance_Support grade = new Inheritance_Support();
    // Get a test score from the user.
    System.out.print("Enter a numeric test score: ");
    testScore = sc.nextDouble();
    // Set the Inheritance_Support object's score.
    grade.setScore(testScore);
    // Display the letter grade for tht score.
    System.out.println("The grade for that test is " + grade.getGrade()); 

    /**
     * Problem 2: Creating a Car object
     */
    Inheritance_Support instance = new Inheritance_Support();
    Inheritance_Support.Car myCar = instance.new Car("Toyota", 2022, 4);
    myCar.displayInfo();
    myCar.start();
    myCar.honk();

    System.out.println("\n---\n");


    /**
     * Problem 3: Designing a Cube
     */
    double length, width, height;
    System.out.println("Enter the dimensions of the cube: ");
    System.out.println("Length =");
    length = sc.nextDouble();
    System.out.println("Width =");
    width = sc.nextDouble();
    System.out.println("Height =");
    height = sc.nextDouble();

    // Create a cube object and pass the dimensions to the constructor.
    Inheritance_Support supportInstance = new Inheritance_Support();
    Inheritance_Support.Cube myCube = supportInstance.new Cube (length, width, height);
    System.out.println();
    System.out.println("Here are the properties of " + " the cube.");
    System.out.println("Length: " + myCube.getLength());
    System.out.println("Width: " + myCube.getWidth());
    System.out.println("Height: " + myCube.getHeight());
    System.out.println("Base Area: " + myCube.getArea());
    System.out.println("Surface Area: " + myCube.getSurfaceArea());
    System.out.println("Volumne: " + myCube.getVolume());

    /**
     * Problem 4: Overriding vs Overloading Superclass Methods
     */
    ShowValueDemo demo = new ShowValueDemo();
    }
}

class ShowValueDemo {
    public ShowValueDemo() {
        SubClass3 myObject = new SubClass3();

        myObject.showValue(10); // Pass an integer
        myObject.showValue(1.2); // Pass a double
        myObject.showValue("Hello"); // Pass a String
    }
}

class SubClass3 {
    public void showValue(int value) {
        System.out.println("Integer value: " + value);
    }
    
    public void showValue(double value) {
        System.out.println("Double value: " + value);
    }
    
    public void showValue(String value) {
        System.out.println("String value: " + value);
    }
}