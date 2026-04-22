package February.February_17_2026.PersonGroup;

public class Student extends Person {
    public String FRESHMAN = "Freshman";
    public String SOPHOMORE = "Sophomore";
    public String JUNIOR = "Junior";
    public String SENIOR = "Senior";
    private String status;

    public Student (){
    }

    public Student(String name){
    super(name);
    }

    public Student(String name, String address, String mail, String phone, String status){
        super(name, phone, mail, address);
        this.status = status;
    }

    // Getter and Setter for Status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString 
    public String toString() {
        return "Name: " + getName() + "\nAddress; " + getAddress() + "\nPhone; " 
        + getPhone() + "\nMail: " + getMail() + "\nStatus; " + status;
    }


}
