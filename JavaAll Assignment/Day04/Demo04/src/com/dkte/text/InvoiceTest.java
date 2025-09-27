package com.dkte.text;

import com.dkte.Invoice;

public class InvoiceTest 
{

	public static void main(String[] args)
	{
		Invoice i = new Invoice("12345", "Drill", 5, 19.99);

		System.out.println("Part Number: " + i.getPart_number());
		System.out.println("Part Description: " + i.getPart_description());
		System.out.println("Quantity: " + i.getQuantity_of_item());
		System.out.println("Price Per Item: $" + i.getPrice_per_item());
		System.out.println("Invoice Amount: $" + i.calculatesAmount());

		i.setQuantity_of_item(-10);
		i.setPrice_per_item(-25.5);
		System.out.println("\nAfter setting invalid values:");
		System.out.println("Quantity: " + i.getQuantity_of_item());
		System.out.println("Price Per Item: $" + i.getPrice_per_item());
		System.out.println("Invoice Amount: $" + i.calculatesAmount());

		i.setQuantity_of_item(10);
		i.setPrice_per_item(15.50);
		System.out.println("\nAfter setting valid values:");
		System.out.println("Quantity: " + i.getQuantity_of_item());
		System.out.println("Price Per Item: $" + i.getPrice_per_item());
		System.out.println("Invoice Amount: $" + i.calculatesAmount());

	}

}
