import java.util.ArrayList;

// Create a class PayrollSystem. 
public class PayrollSystem {
    private ArrayList<Employee> employees;

    public static void main(String[] args) {

        // Employee Objects
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Micheal", 549, 2100);
        ContactEmployee contactEmployee = new ContactEmployee("Rusu", 937, 10, 25);
        
        // It should contain a private ArrayList of type Employee. 
        ArrayList<Employee> employees = new ArrayList<Employee>();

        // Implement a method addEmployee(Employee e) to add an employee to the list. 
        employees.add(fullTimeEmployee);
        employees.add(contactEmployee);

        // Implement a method displayAllSalaries() that iterates through the ArrayList 
        // and prints the name, ID, and calculated salary for every employee. 
        }
        public void displayAllSalaries() {
            for (Employee emp: employees) {
                System.out.println(emp.getName() + " - ID: " + emp.getId() + 
            "\n - Salary: $" + emp.calculateSalary());
            }
    }
}
