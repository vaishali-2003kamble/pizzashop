package com.dkte.tester;

import java.util.Scanner;

import com.dkte.enties.Apple;
import com.dkte.enties.Fruit;
import com.dkte.enties.Mango;
import com.dkte.enties.Orange;

public class FruitBasket {
	public static int menu(Scanner sc) {
		System.out.println("**************************************");
		System.out.println("0.Exit");
		System.out.println("1.Add Apple");
		System.out.println("2.Add Mango");
		System.out.println("3.Add Orange");
		System.out.println("4.All Fruit In Basket");
		System.out.println("5.All fresh fruit in basket");
		System.out.println("6.Display all Stale fruit in basket");
		System.out.println("7.Mark fruit as Satle");
		System.out.println("8.Marks All stale fruit as stale");
		System.out.println("**************************************");

		System.out.println("Enter your choice ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fruit[] basket = new Fruit[10];
		int index = 0;
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				if (index < 10) {
					basket[index] = new Apple();
					basket[index].accept(sc);
					index++;
				}
				break;
			case 2:
				if (index < 10) {
					basket[index] = new Mango();
					basket[index].accept(sc);
					index++;
				}
				break;
			case 3:
				if (index < 10) {
					basket[index] = new Orange();
					basket[index].accept(sc);
					index++;
				}
				break;
			case 4:
				for (Fruit f : basket)
					if (f != null)
						System.out.println(f.getName());
				break;
			case 5:
				for (Fruit f : basket)
					if (f != null && f.isFresh()) {
						System.out.println(f);
						System.out.println("taste = " + f.taste());
						System.out.println("Fruit is Fresh - " + f.isFresh());

					}
				break;
			case 6:
				for (Fruit f : basket)
					if (f != null && !f.isFresh())
						System.out.println(f);
				break;
			case 7:
				int i = 3;
				basket[i].setFresh(false);

				break;
			case 8:
				for (Fruit f : basket)
					if (f != null && f.taste().equals("sour"))
						f.setFresh(false);
				break;
			default:
				System.out.println("Wrong choice !");

			}
		}

	}

}
