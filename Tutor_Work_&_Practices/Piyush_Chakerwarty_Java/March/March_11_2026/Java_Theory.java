
public class Java_Theory {
    public static void main(String[] args) {
        
/*
1. What is Inheritance?
*/ 
// Inheritance allows a new class (subclass/child) to inherit properties and methods from an existing class (superclass/parent). 
// It promotes code reusability and establishes "IS-A" relationships.

/* 
Key Concepts:
*/

// Superclass Constructor Calling: When creating a subclass object, the superclass constructor is automatically called first
// Constructor Chain: Person → Employee → Faculty (constructors execute in this order)
// Protected Members: Accessible within the same package and by subclasses

    class Person {
        protected String name;
        public Person() {
            System.out.println("Person constructor called");
        }
    }
    
    class Employee extends Person {
        protected double salary;
        public Employee() {
            super(); // Calls Person constructor
            System.out.println("Employee constructor called");
            }
        }
    
/*
2. What is Polymorphism?
*/
// Polymorphism means "many forms" - the ability of objects to take multiple forms. 
// One interface can be used for different data types.

// Types:
// Compile-time: Method overloading
// Runtime: Method overriding

// Example:

        // ArrayList<Shape> canvasElements = new ArrayList<>();
            // // Add different shapes
            // canvasElements.add(new Rectangle());
            // canvasElements.add(new Circle());
            // canvasElements.add(new Triangle());
            
            // // Polymorphic behavior - each shape draws differently
            // for(Shape shape : canvasElements) {
            //     shape.draw(); // Calls specific implementation
            //     System.out.println("Area: " + shape.getArea());
        // }

/*
3. Abstract Classes 
*/
// Purpose:
    // Define common interface for related classes
    // Cannot be instantiated directly
    // Can contain both abstract and concrete methods
    // Subclasses must implement all abstract methods

        // Example:
            abstract class Shape {
            abstract double getArea(); // Must be implemented
            abstract void draw();      // Must be implemented
            
            // Concrete method (optional to override)
            public void displayInfo() {
                System.out.println("This is a shape");
            }
        }  

/*
4. Interfaces
*/
// Key Features:
    // Contract that classes must follow
    // All methods are implicitly public abstract
    // Classes implement interfaces using implements keyword
    // A class can implement multiple interfaces
// UML Representation:
    // Dashed line with arrow indicates interface implementation

/*
5. Method Overriding
*/
// Rules:
    // Same method signature as parent class
    // Provides specific implementation in subclass
    // Uses @Override annotation (recommended)
    // Must have same or wider access modifier

/*
6. Arrays and Collections
*/

// Multidimensional Arrays:
        int[][] matrix = new int[3][4]; // 3 rows, 4 columns
        int[][] values = {
            {1,2,3}, 
            {4,5,6}
        }; // Initialization

        // Nested Traditional For Loop
        int[][] magicMatric = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
// ArrayList Benefits:
    // Dynamic sizing (auto-expand/shrink)
    // Type-safe with generics <T>
    // Rich set of methods (add(), remove(), get(), size())
    }
}
