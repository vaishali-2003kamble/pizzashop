package com.dkte;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	String isbn;
	String category;
	double price;
	String authorname;
	int quantity;

	public Book() {

	}

	public Book(String isbn, String category, double price, String authorname, int quantity) {
		super();
		this.isbn = isbn;
		this.category = category;
		this.price = price;
		this.authorname = authorname;
		this.quantity = quantity;
	}
	public void accept(Scanner sc)
	{	
		System.out.println("Enter Isbn Number");
		String isbn=sc.next();
		System.out.println("Enter category");
		String category=sc.next();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		System.out.println("Enter authorname");
		String authorname=sc.next();
		System.out.println("Enter quantity");
		int quantity=sc.nextInt();
			
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", category=" + category + ", price=" + price + ", authorname=" + authorname
				+ ", quantity=" + quantity + "]";
	}
	

}
