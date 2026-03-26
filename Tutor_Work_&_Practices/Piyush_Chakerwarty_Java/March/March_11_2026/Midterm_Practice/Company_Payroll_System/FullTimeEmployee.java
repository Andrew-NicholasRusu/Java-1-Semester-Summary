/*
2. Specialization 
 */

// Create two subclasses

public class FullTimeEmployee extends Employee {
    // FullTimeEmployee: Has a private double monthlySalary. 
    // calculateSalary() simply returns this value. 
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee (String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Getters and Setters
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    // Method
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
