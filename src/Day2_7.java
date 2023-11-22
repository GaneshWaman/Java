import java.util.Scanner;

//7. Write a menu driven program to do following operations :
//a) Compute area of circle
//b) Compute area of rectangle
//c) Compute area of triangle
//d) Exit
public class Day2_7 {

	public static void main(String[] args) {
		do {
			System.out.println("Enter following choice for area calculation: ");
			System.out.println(" 1. Circle\n 2. Rectangle\n 3. Triangle\n 4. Exit");
			Scanner sc = new Scanner(System.in);
			System.out.print("Choice: ");
			int choice = sc.nextInt();
			
			Day2_7 shape = new Day2_7();
			
			switch (choice) {
			case 1: shape.area("Circle");break;
			case 2: shape.area("Rectangle");break;
			case 3: shape.area("Triangle");break;
			case 4: break;
			default:
				System.out.println("Enter Valid input");
			
		} 
		while (choice != 4);
		}
	}

	public void area(String shape) {
		Scanner sc = new Scanner(System.in);
		if (shape == "Rectangle") {
			System.out.print("Enter length of Rectangle: ");
			int l = sc.nextInt();
			System.out.print("Enter width of Rectangle: ");
			int w = sc.nextInt();
			System.out.println("Area is: " + (l * w));
		} else if (shape == "Circle") {
			System.out.print("Enter Radius of circle: ");
			int r = sc.nextInt();
			System.out.println("Area is: " + (Math.PI * r * r));
		} else {
			System.out.print("Enter base of Triangle: ");
			int b = sc.nextInt();
			System.out.print("Enter base of Triangle: ");
			int h = sc.nextInt();
			System.out.println("Area is: " + (0.5 * b * h));
		}
	}
}
