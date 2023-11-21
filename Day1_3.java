//3:Write a program to swap two numbers.
import java.util.Scanner;
public class Day1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first no. a: ");
		int a = sc.nextInt();
		System.out.print("Enter second no. b: ");
		int b = sc.nextInt();
		System.out.println("Before Swap: "+ "a = "+ a +"  | b = " + b);
		
		int t = a;
		a = b;
		b = t;
		System.out.println("After Swap: "+ " a = " + a + "  | b = " + b);
		

	}

}
