package Ans2;

import java.util.Scanner;

public class BnkAcc {
	private int accno = 10001;
	private String name;
	private double bal;
	private boolean locker = false;
	public static int count=100;
//	Scanner sc= new Scanner(System.in);
//	
//	public void openAcc() {
//		System.out.println("Enter Your Name initial_bal");
//		accno = 10001;
//		this.name = sc.next();
//		this.bal = sc.nextDouble();
//		locker = false;
//		accno++;
//	}

	@Override
	public String toString() {
		return "BnkAcc [accno=" + accno + ", name=" + name + ", bal=" + bal + ", locker=" + locker + "]";
	}




	public int getAccno() {
		return accno;
	}




	public void setAccno(int accno) {
		this.accno = accno;
	}




	public BnkAcc(String name, double bal, boolean locker) {
		// TODO Auto-generated constructor stub
		super();
		this.accno = count;
		this.name = name;
		this.bal = bal;
		this.locker = locker;
		count++;
	}

	public void debit(int amt) {
		this.bal = bal - amt;
		System.out.println("Rupee " + amt + " are debited successfully.");
		System.out.println("--------------------------------------------");

	}

	public void credit(int amt) {
		this.bal = bal + amt;
		System.out.println("Rupee " + amt + " are credited successfully.");
		System.out.println("--------------------------------------------");

	}
	public void applylocker() {
		if (locker == true)	{
			System.out.println("Already have locker.");
			System.out.println("--------------------------------------------");

		}
		else {
			locker = true;
			System.out.println("Succefully applied to locker ");
			System.out.println("--------------------------------------------");

		}
		
	}

}
