package February.February_12_2026.Homework;

public class StudentMain {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student ("Alice", 85.5);
        Student student2 = new Student ("Bob", 72.0);
        // Student 3 and 4 will be use in toString method demonstration
        Student student3 = new Student ("Charlie", 79.0); 
        Student student4 = new Student ("Diana", 92.0);
        // Student 5 will be used to demonstrate the error handling in setGrade method
        Student student5 = new Student ("Eve", 105.0); 
        // This will trigger the error message for invalid grade

        // Print the student's details using the getters.
        System.out.println(student1.getName() + ", " + student1.getGrade());
        System.out.println(student2.getName() + ", " + student2.getGrade());
        System.out.println(student5.getName() + ", " + student5.getGrade()); // This will show the invalid grade but still print the details of student5

        // Display the student details using toString()
        System.out.println(student3); // uses the toString method to print student3's details
        System.out.println(student4); 
        
    }
}