package February.February_17_2026.PersonGroup;

public class Person {
    private String name;
    private String address;
    private String phone;
    private String mail;

    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, String phone, String mail, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
    }

    // Getters and Setters 

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    } 

    // toString
    public String toString() {
        return "Name: " + name + "\nAddress; " + address + "\nPhone; " + phone + "\nMail: " + mail;
    }

    

}
