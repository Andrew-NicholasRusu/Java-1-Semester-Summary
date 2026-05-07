import java.util.ArrayList;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        // Write a program that uses an ArrayList<Student> to manage a list of students.
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(2432744, "Andrew"));

        for (Student student : students) {
            System.out.println("ID: " + student.id + ", Name: " + student.name);
        }
    }
}
