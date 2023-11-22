import java.util.Scanner;

//8. Write a program to print all prime numbers between 1 to n
public class Day2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();

		Day2_8 d = new Day2_8();
		d.prime(n);
	}

	public void prime(int n) {
		if (n == 2)
			System.out.println("It is prime Number");
		else if (n > 2) {
			int cnt = 0;
			for (int i = 2; i <= (Math.sqrt(n) + 1); i++) {
				if (n % i == 0) {
					System.out.println("Not a Prime Number");
					break;
				} else
					cnt += 1;
			}
			if (cnt >= 1)
				System.out.println("It is prime Number");
		} else
			System.out.println("Enter valid number");
	}

}
