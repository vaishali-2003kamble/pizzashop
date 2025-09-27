package com.dkte;

import java.util.ArrayList;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		// add element
		employee.add(new Employee(1, "Vishal", 1200.0));
		employee.add(new Employee(2, "Namu", 1300.0));
		employee.add(new Employee(3, "Samu", 1400.0));
		employee.add(new Employee(4, "Sanu", 1500.0));
		employee.add(new Employee(5, "Vaishu", 1600.0));
		employee.add(new Employee(6, "Ravi", 1700.0));

		// add at specific index
		System.out.println("add at specific index :- ");
		employee.add(6, new Employee(7, "Teja", 1800.0));

		// The element is present in the list or not -->contains
		Employee key = new Employee(5);
		System.out.println("Name is present or not :- " + employee.contains(key));

		// all elements present in the list or not
		Employee key1 = (new Employee(4, "Sanu", 1500.0));
		System.out.println("All Deatils is present or not :- " + employee.contains(key1));

		// remove with index
		System.out.println("remove with index :- "+employee.remove(1));
		
		// remove at specific index
		System.out.println("Remove with spcific index :- "+employee.remove(new Employee(1, "Vishal", 1200.0)));
		// display
		for (Employee e : employee) {
			System.out.println(e);
		}
		// clear-->It clear all the element in the list
		employee.clear();
		// display
		for (Employee e : employee) {
			System.out.println(e);
		}

	}

}
