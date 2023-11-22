//4. Write a program to calculate factorial of a number. 
//For e.g. factorial of 5 = 5! = 5 *4*3*2*1 = 120
public class Day2_4 {
	public void fact(int n) {
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		System.out.println("Factorial of "+n+" is : "+ fac );
	}

	public static void main(String[] args) {
		Day2_4 f = new Day2_4();
		f.fact(5);
	}

}
