package com.dkte;

import java.util.Scanner;

public class AverageDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1,n2,avg;
		System.out.println("Enter the First numbers = ");
		if(sc.hasNextDouble() && !sc.hasNextInt())
		{
			n1=sc.nextDouble();
			
			System.out.println("Enter the second numbers = ");
			if(sc.hasNextDouble() && !sc.hasNextInt())
			{
				n2=sc.nextDouble();
				avg=(n1+n2)/2;
				System.out.println("Average = "+avg);
			}
			else
			{
				System.out.println("Invalid second number");
			}
		}
		else
		{
			System.out.println("Invalid First number");
		}		
	}

}
