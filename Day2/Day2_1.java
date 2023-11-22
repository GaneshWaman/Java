//1:Write a program that accepts numbers continuously as long as the 
//number is positive and prints the sum of the given numbers.
public class Day2_1 {
	public static int add(int... num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];

		}
		return sum;
	}

	public static void main(String[] args) {
//		Day2_1 d=new Day2_1();
		int sum = Day2_1.add(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("sum of all Numbers is: " + sum);
	}

}
