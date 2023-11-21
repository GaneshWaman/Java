//7. Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
//(Hint: a, e, i, o, u are vowels)
import java.util.Scanner;
public class Day1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Lower case character : ");
		char ch = sc.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
			System.out.println("Character is vowel.");
		else
			System.out.println("Character is consonant.");
				

	}

}
