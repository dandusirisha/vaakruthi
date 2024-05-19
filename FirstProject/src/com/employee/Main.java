package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	String address;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		    ArrayList<Employee> a = new ArrayList<Employee>();
		    a.add(new Employee(101, "Naga", "Machilipatnam"));
		    a.add(new Employee(102, "Kumar", "Rayavaram"));
		    a.add(new Employee(103, "Sai", "Mangalagiri"));
		    System.out.print("enter the id number of the employee to search :");
            int searchId = sc.nextInt();
    		Employee foundEmployee = display(a, searchId);
    		
    		if(foundEmployee != null) {
    			System.out.println("Employee found :");
    			System.out.println("ID:"+foundEmployee.getId());
    			System.out.println("Name:"+foundEmployee.getName());
    			System.out.println("Address:"+foundEmployee.getAddress());
    		}
    		else {
    			System.out.println("Employee with ID "+searchId+" not found.");
    		}
	}
		
	public static Employee display(ArrayList<Employee> e1 ,int id) {
		for(Employee e : e1) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
		}
	}
