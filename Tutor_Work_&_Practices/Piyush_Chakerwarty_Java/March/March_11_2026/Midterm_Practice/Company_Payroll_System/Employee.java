// Create an abstract class Employee. 
public abstract class Employee {

    // Attributes: String name (private) and int id (private). 
    private String name;
    private int id;

    // Include a constructor and an abstract double calculateSalary() method. 
    public Employee (String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and Setters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double calculateSalary();

}
