package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fruit basket size: ");
		int n  = sc.nextInt();
		Fruits []basket = new Fruits[n];
		
		System.out.println("1. Add Mango. ");
		System.out.println("2. Add Orange. ");
		System.out.println("3. Add Apple. ");
		System.out.println("4. Display names of all fruits in the basket.");
		System.out.println("5. Display name,color,weight, taste of all fresh fruits in the basket.");
		System.out.println("6. Mark a fruit in a basket as stale(not fresh)");
		System.out.println("7. Mark all sour fruits stale ");
		System.out.println("8. Invoke fruit specific functionality (pulp / juice / jam)");
		System.out.println("Enter any key to exit.");
		
		int choice=0, index =0;
		do {
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: //1. Add Mango.
				if (index <= n) {
					System.out.println("color, Weight");
					basket[index] = new Mango("Mango", sc.next(), sc.nextDouble(), true);
					index++;
					break;	
				}
				else System.out.println("Sorry!! can't add any more, Your Basket is Full"); break;

			case 2: //2. Add Orange.
				if (index <= n) {
					System.out.println("color, Weight");
					basket[index] = new Mango("Orange", sc.next(), sc.nextDouble(), true);
					index++;
					break;	
				}
				else System.out.println("Sorry!! can't add any more, Your Basket is Full"); break;

			case 3: //3. Add Apple.
				if (index <= n) {
					System.out.println("color, Weight");
					basket[index] = new Mango("Apple", sc.next(), sc.nextDouble(), true);
					index++;
					break;	
				}
				else System.out.println("Sorry!! can't add any more, Your Basket is Full"); break;
					
			case 4://4. Display names of all fruits in the basket.
				for (int i=0;i<index;i++) {
					System.out.println(basket[i].name);
				}
				break;
			case 5: //5. Display name,color,weight, taste of all fresh fruits in the basket.
				for (int i=0;i<index;i++) {
					System.out.println(basket[i]);
				}
				break;
			case 6: //6. Mark a fruit in a basket as stale(not fresh)
//				System.out.print("Enter index no of fruit: ");
//				public void markStale(sc.nextInt())) {
//					this.index = index;
					
//				}
				break;
			case 7: //7. Mark all sour fruits stale 
				break;
			case 8: //8. Invoke fruit specific functionality (pulp / juice / jam)
				break;
			default:
				choice = 9;
				break;
			}
		} while (choice <10 );

		
		
	}

}
