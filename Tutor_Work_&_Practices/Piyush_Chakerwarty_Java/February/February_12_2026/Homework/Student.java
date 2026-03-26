package February.February_12_2026.Homework;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Add a simple if statement to validate the grade input
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
        this.grade = grade;
        }
    // If it's outside that range, print an error message
        else {
        System.out.println("ERROR: Grade must be between 0 and 100.");
        }   
    }

    // toString
    @Override
    public String toString() {
        return "Student Name: " + name + ", Grade: " + grade;
    }
    // Method to check if the student has passed or failed based on the grade
}
