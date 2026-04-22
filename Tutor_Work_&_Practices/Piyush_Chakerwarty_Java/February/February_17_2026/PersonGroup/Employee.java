package February.February_17_2026.PersonGroup;
import java.time.chrono.MinguoDate;

public class Employee extends Person {
    private String office;
    private double salary;
    private MinguoDate dateHired;

    public Employee() {
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String phone, String mail, String address, 
        String office, double salary, MinguoDate dateHired) {
        super(name, phone, mail, address);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Getters and Setters
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MinguoDate getDateHired() {
        return dateHired;
    }

    //toString

    public String toString() {
        return "";
    }
}
