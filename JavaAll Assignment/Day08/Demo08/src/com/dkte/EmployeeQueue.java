package com.dkte;

import java.util.LinkedList;
import java.util.Queue;

public class EmployeeQueue {

	public static void main(String[] args) {
		Queue<Employee> employee = new LinkedList<Employee>();
		// add element
		employee.add(new Employee(1, "Vishal", 1200.0));
		employee.add(new Employee(2, "Namu", 1300.0));
		employee.add(new Employee(3, "Samu", 1400.0));
		employee.add(new Employee(4, "Sanu", 1500.0));
		employee.add(new Employee(5, "Vaishu", 1600.0));
		employee.add(new Employee(6, "Ravi", 1700.0));
		// remove element
		System.out.println("removeed element is :- " + employee.remove(new Employee(2, "Namu", 1300.0)));

		// element -->first value present in the list that value is show
		System.out.println("First element :- " + employee.element());
		// Display
		for (Employee ele : employee) {
			System.out.println(ele);
		}
		System.out.println("*********************************************************");
		// add element-->offer()
		employee.offer(new Employee(11, "Vishal", 11200.0));
		employee.offer(new Employee(21, "Namu", 11300.0));
		employee.offer(new Employee(31, "Samu", 11400.0));
		employee.offer(new Employee(41, "Sanu", 11500.0));
		employee.offer(new Employee(51, "Vaishu", 11600.0));
		employee.offer(new Employee(61, "Ravi", 11700.0));
		// remove element-->poll()
		System.out.println("removeed element is :- " + employee.poll());

		// peek() -->first value present in the list that value is show
		System.out.println("Peek element :- " + employee.peek());
		// Display
		for (Employee ele : employee) {
			System.out.println(ele);
		}

	}

}
