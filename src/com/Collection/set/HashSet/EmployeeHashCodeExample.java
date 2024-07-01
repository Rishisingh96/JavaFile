package com.Collection.set.HashSet;

import com.Java.Universal.Week5.Employee;

import java.util.HashSet;
import java.util.Set;


public class EmployeeHashCodeExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(23, "Rishi Singh", "Computer Department");
        Employee employee2 = new Employee(23, "John Doe", "Human Resources");
        Employee employee3 = new Employee(24, "Alice Smith", "Finance");

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);

        System.out.println("Employee Set contains:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}
