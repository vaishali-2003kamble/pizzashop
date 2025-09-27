package com.dkte.test;

import java.util.Scanner;

import com.dkte.Point2D;

public class PointTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Point2D p1=new Point2D(3,4);
		int x,y;
		System.out.println("Enter the x and y coordinate = ");
		x=sc.nextInt();
		y=sc.nextInt();
		Point2D p2=new Point2D(x,y);
		
		System.out.println("First x and y coordinates = "+p1.getDetails());
		System.out.println("Second x and y coordinates = "+p2.getDetails());
		
		
		if(p1.isEquale(p2))
		{
			System.out.println("Both are equale");
		}
		else
		{
			System.out.println("Both are different");
		}
		
		System.out.println("Distance = "+p1.calculateDistance(p2));	
		
	}

}
