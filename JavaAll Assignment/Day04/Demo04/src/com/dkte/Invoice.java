package com.dkte;

import java.util.Scanner;

public class Invoice {
	private String part_number;
	private String part_description;
	private int quantity_of_item;
	private double price_per_item;

	public Invoice() {

	}

	public Invoice(String part_number, String part_description, int quantity_of_item, double price_per_item) {
		this.part_number = part_number;
		this.part_description = part_description;
		this.quantity_of_item = quantity_of_item;
		this.price_per_item = price_per_item;
	}

	public String getPart_number() {
		return part_number;
	}

	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}

	public String getPart_description() {
		return part_description;
	}

	public void setPart_description(String part_description) {
		this.part_description = part_description;
	}

	public int getQuantity_of_item() {
		return quantity_of_item;
	}

	public void setQuantity_of_item(int quantity_of_item) {
		if (quantity_of_item < 0) {
			this.quantity_of_item = 0;
		} else {
			this.quantity_of_item = quantity_of_item;
		}
	}

	public double getPrice_per_item() {
		return price_per_item;
	}

	public void setPrice_per_item(double price_per_item) {
		if (price_per_item < 0) {
			this.price_per_item = 0.0;
		} else {
			this.price_per_item = price_per_item;
		}
	}

	public void accept(Scanner sc) {
		System.out.println("Enter the part number = ");
		part_number = sc.next();
		System.out.println("Enter the part Description = ");
		part_description = sc.next();
		System.out.println("Enter the quantity of item = ");
		quantity_of_item = sc.nextInt();
		System.out.println("Enter the price_per_item = ");
		price_per_item = sc.nextDouble();
	}

	public void display() {
		System.out.println("The part number = " + part_number);
		System.out.println("The part Description = " + part_description);
		System.out.println("The quantity of item = " + quantity_of_item);
		System.out.println("The price_per_item = " + price_per_item);
	}

	public double calculatesAmount() {
		double amount = 0;
		amount = price_per_item * quantity_of_item;
		return amount;
	}
}
