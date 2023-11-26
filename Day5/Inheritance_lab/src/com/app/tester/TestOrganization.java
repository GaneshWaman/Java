package com.app.tester;

import com.app.org.*;
import com.iacsd.code.Manager;

import java.util.Scanner;

public class TestOrganization {

	public static void main(String[] args) {
//		1. Hire Manager
//		I/P : all manager details
//		2. Hire Worker  
//		I/P : all worker details
//		3. Display information of all employees(toString) & display net salary (by invoking computeNetSal), 
		System.out.println("1. Hire Manager");
		System.out.println("2. Hire Worker");
		System.out.println("3. Display information of all employees");
		Scanner sc = new Scanner(System.in);

		Emp[] Ngo = new Emp[5];

		int index = 0, choice = 0;

		do {
			System.out.print("Enter a choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: { // Hire Manager
				if (index < Ngo.length) {
					System.out.println("Enter Manager's id name deptno sal Performance_Bonus");
					Ngo[index] = new Mgr(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
					index++;
					System.out.println("Manager Hired!");
				} else
					System.out.println("No vacancy in Company");
				break;
			}
			case 2: { // Hire Worker
				if (index < Ngo.length) {
					System.out.println("Enter Worker's id name deptno sal hworked hrate");
					Ngo[index] = new Worker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt(),
							sc.nextInt());
					index++;
					System.out.println("Worker Hired!");
				} else
					System.out.println("No vacancy in Company");
				break;
			}
			case 3: {// all worker details
				for (int i = 0; i < index; i++) {
					System.out.print(Ngo[i].getEmpDetails());
					if (Ngo[i] instanceof Mgr) {
//						System.out.print(" Performance_Bonus: "+((Mgr) Ngo[i]).getPerfBonus());
						System.out.println(" Net_Salary: "+((Mgr) Ngo[i]).computeSal());
						((Mgr) Ngo[i]).getPerfBonus();
						}
					else {
//						System.out.print(" Performance_Bonus: "+((Mgr) Ngo[i]).getPerfBonus());
						System.out.println(" Net_Salary: "+((Worker) Ngo[i]).computeSal());
					}

				}
			}
			}

		} while (choice <= 3);

	}

}