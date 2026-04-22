package February.February_2_2026;

public class Inheritance_Support {
    /** 
     *  Problem 1: Test Scoring
    */ 
    private double score; // Numeric score

    public void setScore(double s) {
        score = s;
    }
    public double getScore() {
        return score;
    }
    public char getGrade() {
        char letterGrade; // To hold the grade
        // if statements: you know them already!
        if (score >= 90) {
            letterGrade = 'A';
        } else if (score >= 80) {
            letterGrade = 'B';
        } else if (score >= 70) {
            letterGrade = 'C';
        } else if (score >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }

    /**
     * Problem 2: Creating a Car
     */
    class Vehicle {
        String brand;
        int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand + "| Year: " + year);
    }
}

    class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String brand, int year, int numberOfDoors) {
            // Using super() to call the parent constructor
            super (brand, year);
            this.numberOfDoors = numberOfDoors;
        }

        @Override
        public void displayInfo() {
            // Using super to call the parent class method.
            super.displayInfo();
            System.out.println("Number of doors: " + numberOfDoors);
        }

        public void honk() {
            System.out.println("The car is honking!");
        }
    }

    /**
     * Problem 3: Designing a Cube.
     */
    class Rectangle {
        private double length, width;
        private double area;

        public Rectangle (double len, double w) {
            length = len;
            width = w;
        }

        public void setWidth(double w) {
            width = w;
        }

        public void setLength(double len) {
            length = len;
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }
        
        public double getArea() {
            return area = length * width;
        }
    }

    class Cube extends Rectangle {
    private final double height; // The height of the cube
    
    public Cube(double len, double w, double h) {
        super(len, w);
        height = h;
        }

        public double getHeight() {
            return height;
        }

        public double getSurfaceArea() {
            return getArea() * 6;
        }

        public double getVolume() {
            return getArea() * height;
        }
    }

    /**
     * Problem 4: Overriding vs Overloading Superclass Methods
     * This problem is more theoretical and doesn't require code, 
     * but you can experiment with method overriding
     */
    class SuperClass3 {
        public void showValue(int arg) {
            System.out.println("SUPERCLASS: The int arguement was: " + arg);
        }

        // The following method displays a String
        public void showValue(String arg) { // This method overloads the showValue method above
            System.out.println("SUPERCLASS: The String arguement was: " + arg);
        }
    }

    class SubClass3 extends SuperClass3 {
        public void showValue(int arg) { // This method overrides the showValue method in the superclass
            System.out.println("SUBCLASS: The int arguement was: " + arg);
        }

        // This method overloads the showValue method in the superclass
        public void showValue(double arg) {
            System.out.println("SUBCLASS: The double arguement was: " + arg);
        }
    } // End of SubClass3
} // End of Inheritance_Support
