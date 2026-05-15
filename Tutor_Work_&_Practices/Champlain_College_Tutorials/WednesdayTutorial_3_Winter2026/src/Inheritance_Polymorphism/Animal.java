package Inheritance_Polymorphism;

/**
 *
 */

public class Animal {
    // Field
    private String name;

    // No-Arg Constructor
    public Animal() {
        this.name = "";
    }

    // Argument Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}
