package com.dkte;

import java.util.Scanner;

public class ConvertInteger {

	public static void main(String[] args) {
		System.out.println("Enter integer number :- ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String bniaum=Integer.toBinaryString(n);
		System.out.print("Binary number is :- ");
		System.out.println(bniaum);
		String hexadeci=Integer.toHexString(n);
		System.out.print("hexadecimal number is :- ");
		System.out.println(hexadeci);
		String ocalnum=Integer.toOctalString(n);
		System.out.print("ocatal number is :- ");
		System.out.print(ocalnum);

	}

}
