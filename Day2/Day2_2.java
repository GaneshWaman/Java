//2. Write a program to accept two integers x and n and compute x raised to n.

public class Day2_2 {
	
	public static int pwr(int x, int n) {
		int pw = (int) Math.pow(x, n);
		return pw;
	}
	

	public static void main(String[] args) {
//		Day2_2 pw1 = new Day2_2();
		int result = Day2_2.pwr(2,3);
		System.out.println("result :"+ result);
	}

}
