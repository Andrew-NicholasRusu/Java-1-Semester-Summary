public class ContactEmployee extends Employee {
    // ContractEmployee: Has private int hoursWorked and double hourlyRate. 
    // calculateSalary() returns the product of both. 
    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    public ContactEmployee (String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    // Override Method
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
