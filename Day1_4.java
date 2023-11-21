//4. Write a program to accept an integer and check if it is even or odd.
import java.util.Scanner;
public class Day1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int a = sc.nextInt();
		
		if (a==0)
			System.out.println("Number is neither odd nor even!");
		else if(a%2==0)
			System.out.println("Number is Even.");
		else
			System.out.println("Number is Odd.");
	}

}
