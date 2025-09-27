package com.dkte;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class EmployeeArraayDeque {

	public static void main(String[] args) {
		
		Deque<Employee>employee2=new ArrayDeque<Employee>();
		//add element
		employee2.add(new Employee(1, "Vishal", 1200.0));
		employee2.add(new Employee(2, "Namu", 1300.0));
		employee2.add(new Employee(3, "Samu", 1400.0));
		employee2.add(new Employee(4, "Sanu", 1500.0));
		employee2.add(new Employee(5, "Vaishu", 1600.0));
		employee2.add(new Employee(6, "Ravi", 1700.0));
	//display
		for(Employee ele:employee2)
		{
			System.out.println(ele);
		}
		//remove
		System.out.println("remove element :- "+employee2.remove());
		//top elements
		System.out.println("top of the element :- "+employee2.peek());

	}

}
