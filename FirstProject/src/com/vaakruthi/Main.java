


package com.vaakruthi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
    public int hashCode() {
        return id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
    	return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Employee> employees = new HashSet<Employee>();
        Set<Employee> duplicates = new HashSet<Employee>();

        System.out.println("Enter employee details (ID and Name and Salary), enter -1 to finish:");

        while (true) {
            System.out.print("Enter employee ID: ");
            int id = sc.nextInt();
            if (id == -1) {
                break;
            }

            System.out.print("Enter employee name: ");
            String name = sc.next();
            
            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();
            
            Employee employee = new Employee(id, name,salary);

            if (!employees.add(employee)) {
                duplicates.add(employee);
            }
        }

        System.out.println("Duplicate employees:");
        for (Employee employee : duplicates) {
        	System.out.println("ID :"+employee.getId()+", Name :"+employee.getName()+", Salary :"+employee.getSalary());
        }
    }
}
