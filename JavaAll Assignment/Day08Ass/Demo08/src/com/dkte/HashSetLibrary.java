package com.dkte;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetLibrary {
	public static int menu(Scanner sc) {
		System.out.println("*************************************");
		System.out.println("0.Exit");
		System.out.println("1.Add book");
		System.out.println("2.Display book");
		System.out.println("3.Sort by category");
		System.out.println("4.Sort by author");
		System.out.println("5.Find id");
		System.out.println("*************************************");
		System.out.println("Enter your choice ");
		return sc.nextInt();

	}

	public static void main(String[] args) {
		HashSet<Book> book = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1 :
			
				Book b=new Book();
				b.accept(sc);
				book.add(b);
			
				break;
			case 2 : 
				for (Book bookItem : book) {
                System.out.println(bookItem);
            }			
				break;
			case 3 :
				book.stream()
                .sorted((p1, p2) -> p1.category.compareTo(p2.category))
                .forEach(bookItem -> System.out.println(bookItem));
				break;
			case 4 :
			book.stream()
            .sorted((p1, p2) -> p1.authorname.compareTo(p2.authorname))
            .forEach(bookItem -> System.out.println(bookItem));
				break;
			case 5 :
				System.out.println("Enter book isbn  number ");
				String isbn=sc.next();
				 boolean found = false;
                 for (Book bookItem : book) {
                     if (bookItem.isbn.equals(isbn)) {
                         System.out.println(bookItem);
                         found = true;
                         break;
                     }
                 }
                 if (!found) {
                     System.out.println("Book not found.");
                 }
				break;
			default :
				System.out.println("Wrong choice !");
			}
		}

	}

}
