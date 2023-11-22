//3. Write a program to accept a character, an integer n and 
//display the next n characters.

public class Day2_3 {

	public void next_n(int a, int n) {
		System.out.print("Next " + n + " nnumbers are :");
		for (int i = a; i <= n; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Day2_3 series= new Day2_3();
		series.next_n(5, 10);
		
	}

}
