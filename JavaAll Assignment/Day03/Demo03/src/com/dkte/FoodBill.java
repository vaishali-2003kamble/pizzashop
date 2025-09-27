package com.dkte;

import java.util.Scanner;

public class FoodBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int dosaPrice = 60, idliPrice = 40, dalTadkaPrice = 50, aapePrice = 30;
        int totalBill = 0;

        while (true) {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. Dosa - Rs.60");
            System.out.println("2. Idli - Rs.40");
            System.out.println("3. Dal Tadka - Rs.50");
            System.out.println("4. Aape - Rs.30");
            System.out.println("5. Generate Bill");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 0: // Exit
                    System.out.println("Thank you");
                    return;

                case 1: // Dosa
                    System.out.print("Enter quantity: ");
                    int dosaQty = sc.nextInt();
                    totalBill += dosaQty * dosaPrice;
                    break;

                case 2: // Idli
                    System.out.print("Enter quantity: ");
                    int idliQty = sc.nextInt();
                    totalBill += idliQty * idliPrice;
                    break;

                case 3: // Dal Tadka
                    System.out.print("Enter quantity: ");
                    int dalTadkaQty = sc.nextInt();
                    totalBill += dalTadkaQty * dalTadkaPrice;
                    break;

                case 4: // Aape
                    System.out.print("Enter quantity: ");
                    int aapeQty = sc.nextInt();
                    totalBill += aapeQty * aapePrice;
                    break;

                case 5: 
                    System.out.println("Total Bill: Rs." + totalBill);
                    System.out.println("Thank you");
                    return;

                default: 
                    System.out.println("Invalid choice! Please try again.");
            }
        }
	}

}
