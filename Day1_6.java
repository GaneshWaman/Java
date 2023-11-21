//6. Write a program, which accepts annual basic salary of an employee and calculates and displays the 
//Income tax as per the following rules. 
//Basic: < 1, 50,000 Tax = 0
// 1, 50,000 to 3,00,000 Tax = 20% 
// > 3,00,000 Tax = 30% 

import java.util.Scanner;
public class Day1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary : ");
		
		int sal = sc.nextInt(); 
		if (sal < 150000)
			System.out.println("Applicable Tax is 0");
		else if (sal > 150000 && sal <300000)
			System.out.println("Applicable Tax is : "+ (0.2*sal));
		else 
			System.out.println("Applicable Tax is : "+ (0.3*sal));
	}

}
