package Ans1;

import java.util.Scanner;

public abstract class Shape {
	int x;
	int y;
	abstract double area();
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
}

class Circle extends Shape {
	Scanner sc = new Scanner(System.in);
	Circle() {
		System.out.println("Enter X, Y Coordintes:");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	@Override
	double area() {
		System.out.println("Enter Radius of Circle: ");
		double r = sc.nextDouble();
		return (Math.PI*r*r);
	}
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", Area =" + area() + "]";
	}
	
	

}
class Rectangle extends Shape{
	Scanner sc = new Scanner(System.in);
	Rectangle() {
		System.out.println("Enter X, Y Coordintes:");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	int w;
	int l;
	
	@Override
	double area() {
		System.out.println("Enter length and width of Rectangle: ");
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		l = sc.nextInt();
		return (w*l);
	}

	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", l=" + l + ", x=" + x + ", y=" + y + ", Area of Rectangle=" + area() + "]";
	}
	
}
class square extends Shape{
	int s;
	Scanner sc = new Scanner(System.in);
	square() {
		System.out.println("Enter X, Y Coordintes:");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	
	@Override
	double area() {
		System.out.println("Enter length of side of Square: ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		return (s*s);
	}

	@Override
	public String toString() {
		return "square [s=" + s + ", x=" + x + ", y=" + y + ", Area =" + area() + "]";
	}	
}
