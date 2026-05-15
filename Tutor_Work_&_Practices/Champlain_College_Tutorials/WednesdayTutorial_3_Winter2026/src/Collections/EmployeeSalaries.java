package Collections;

/**
 * You are given the following employee salaries:
 * David -> 4500
 * Sara -> 6200
 * Mike -> 3900
 * Emma -> 7100
 */

import java.util.HashMap;
import java.util.LinkedList;

public class EmployeeSalaries {
    public static void main(String[] args) {
        HashMap<String, Integer> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 4500);
        employeeSalary.put("Sara", 6200);
        employeeSalary.put("Mike", 3900);
        employeeSalary.put("Emma", 7100);

        // Check if Sara exists in the map.
        System.out.println("Is Sara here today? " + employeeSalary.containsKey("Sara"));

        // Store all salaries greater than or equal to 5000 into a LinkedList<Integer>
        // LinkedList<Integer>
    }
}
