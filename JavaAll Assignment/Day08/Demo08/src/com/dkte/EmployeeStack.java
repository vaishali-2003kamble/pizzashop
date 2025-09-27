package com.dkte;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class EmployeeStack {

	public static void main(String[] args) {
		//Stack with Stack
		Stack<Employee> employee = new Stack<Employee>();
		// add element
		employee.push(new Employee(1, "Vishal", 1200.0));
		employee.push(new Employee(2, "Namu", 1300.0));
		employee.push(new Employee(3, "Samu", 1400.0));
		employee.push(new Employee(4, "Sanu", 1500.0));
		employee.push(new Employee(5, "Vaishu", 1600.0));
		employee.push(new Employee(6, "Ravi", 1700.0));
		
		for(Employee ele:employee)
		{
			System.out.println(ele);
		}
		
		System.out.println("remove element :- "+employee.pop());
		System.out.println("peek element :- "+employee.peek());
		System.out.println("*********************************************");
		//Stack with LinkedList
		LinkedList<Employee> employee1 = new LinkedList<Employee>();
		// add element
		employee1.push(new Employee(1, "Vishal", 1200.0));
		employee1.push(new Employee(2, "Namu", 1300.0));
		employee1.push(new Employee(3, "Samu", 1400.0));
		employee1.push(new Employee(4, "Sanu", 1500.0));
		employee1.push(new Employee(5, "Vaishu", 1600.0));
		employee1.push(new Employee(6, "Ravi", 1700.0));
		
		for(Employee ele:employee1)
		{
			System.out.println(ele);
		}
		
		System.out.println("remove element :- "+employee1.pop());
		System.out.println("peek element :- "+employee1.peek());
		
		System.out.println("*********************************************");
		//Stack behaves ----Deque method
		Deque<Employee>employee2=new LinkedList<Employee>();
		employee2.addFirst(new Employee(1, "Vishal", 1200.0));
		employee2.addFirst(new Employee(2, "Namu", 1300.0));
		employee2.addFirst(new Employee(3, "Samu", 1400.0));
		employee2.addFirst(new Employee(4, "Sanu", 1500.0));
		employee2.addFirst(new Employee(5, "Vaishu", 1600.0));
		employee2.addFirst(new Employee(6, "Ravi", 1700.0));
		for(Employee ele:employee2)
		{
			System.out.println(ele);
		}
		System.out.println("remove element :- "+employee2.removeFirst());
		System.out.println("top of the element :- "+employee2.peekFirst());
		
		System.out.println("*********************************************");
		//Stack behaves ----Deque method
		Deque<Employee>employee3=new LinkedList<Employee>();
		employee3.addLast(new Employee(1, "Vishal", 1200.0));
		employee3.addLast(new Employee(2, "Namu", 1300.0));
		employee3.addLast(new Employee(3, "Samu", 1400.0));
		employee3.addLast(new Employee(4, "Sanu", 1500.0));
		employee3.addLast(new Employee(5, "Vaishu", 1600.0));
		employee3.addLast(new Employee(6, "Ravi", 1700.0));
		for(Employee ele:employee3)
		{
			System.out.println(ele);
		}
		System.out.println("remove element :- "+employee3.removeLast());
		System.out.println("top of the element :- "+employee3.peekFirst());
		

	}

}
