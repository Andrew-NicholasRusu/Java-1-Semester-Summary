import java.util.*;

class Student {

    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

// Comparator Class
class SortByRoll implements Comparator<Student> {
    public int compare (Student a, Student b) {
        // Compare based on roll number
        return a.rollno - b.rollno;
    }
}

public class TreeMapWithComparator {
    public static void main(String[] args) {
        // Create a TreeMap using a Comparator
        TreeMap<Student, Integer> treeMap = new TreeMap<>(new SortByRoll());

        treeMap.put(new Student(111, "Jeremy", "New York"), 1);
        treeMap.put(new Student(131, "Alice", "London"), 2);
        treeMap.put(new Student(121, "Raymond", "Paris"), 3);

        System.out.println("TreeMap sorted by roll number: " + treeMap);
    }
}
