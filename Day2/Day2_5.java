//5. Write a program to calculate factors of a given number.
public class Day2_5 {
	public void factors(int n1) {
		int n = n1;
		for (int i = 2; i <= n1; i++) {
			for (int j = 2; j <= n1; j++) {
				if ((n % j) == 0) {
					n = n / j;
					System.out.print(j + " ");
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		Day2_5 f = new Day2_5();
		f.factors(18);
//		System.out.println((5/2));
	}

}
