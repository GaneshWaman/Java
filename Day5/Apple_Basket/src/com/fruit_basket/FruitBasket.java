package com.fruit_basket;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Fruits f = new Fruits();

		System.out.print("Enter Size of basket: ");
		int size = sc.nextInt();

		Fruits[] bskt = new Fruits[size];
		int choice = 0;
		int index = 0;

		do {
			System.out.println("1. Add Mango\r\n" + "2. Add Orange\r\n" + "3. Add Apple\r\n"
					+ "4. Display names of all fruits in the basket.\r\n"
					+ "5. Display name,color,weight , taste of all fresh fruits , in the basket.\r\n"
					+ "6. Mark a fruit in a basket , as stale(=not fresh)\r\n" + "7. Mark all sour fruits stale \r\n"
					+ "8. Invoke fruit specific functionality (pulp / juice / jam)\r\n" + "10. Exit ");

			System.out.println("------------------------------------");

			System.out.print("Enter Choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:// Add Mango
				if (index < size) {
					System.out.println("Mango add");
					System.out.println("Color  Weight");
					bskt[index] = new Mango("Mango", sc.next(), sc.nextDouble(), true);
					index++;
				} else
					System.out.println("Sorry! Basket is full.");
				System.out.println("------------------------------------");
				break;
				
			case 2:// Add Orange
				if (index < size) {
					System.out.println("Color  Weight");
					bskt[index] = new Orange("Orange", sc.next(), sc.nextDouble(), true);
					index++;
				} else
					System.out.println("Sorry! Basket is full.");
				System.out.println("------------------------------------");
				break;
				
			case 3:// Add Apple
				if (index < size) {
					System.out.println("Color  Weight");
					bskt[index] = new Apple("Apple", sc.next(), sc.nextDouble(), true);
					index++;
				} else
					System.out.println("Sorry! Basket is full.");
				System.out.println("------------------------------------");
				break;
				
			case 4:// Display names of all fruits in the basket.
				for (int i = 0; i < index; i++) {
					System.out.println(bskt[i].getName());
				}
				System.out.println("------------------------------------");
				break;
				
			case 5:// Display names of all fruits in the basket.
				for (int i = 0; i < index; i++) {
					if (bskt[i] instanceof Mango) {
						System.out.println(bskt[i]);
					} else if (bskt[i] instanceof Orange) {
						System.out.println(bskt[i]);
					} else if (bskt[i] instanceof Apple) {
						System.out.println(bskt[i]);
					}
				}
				System.out.println("------------------------------------");
				break;

			case 6:// 6. Mark a fruit in a basket , as stale(=not fresh)
				System.out.println("Enter index to mark as Stale");
				int st = sc.nextInt();
				bskt[st].setFresh(true);
				System.out.println("Marked as Stale.");
				System.out.println("------------------------------------");
				break;
				
			case 7:// 7. Mark all sour fruits stale
				for (int i = 0; i < index; i++)
					bskt[i].setFresh(true);
				System.out.println("All Fruits are Stale Now.");
				System.out.println("------------------------------------");
				break;

			case 8:// 8. Invoke fruit specific functionality (pulp / juice / jam)
				System.out.println("Enter index to Invoke fruit specific functionality");
				int fn = sc.nextInt();
				if (bskt[fn] instanceof Mango)
					Mango.function();
				else if (bskt[fn] instanceof Orange)
					Orange.function();
				else if (bskt[fn] instanceof Apple)
					Apple.function();
				System.out.println("------------------------------------");
				break;
			default:
				choice = 10;
			}

		} while (choice < 10);

	}

}
