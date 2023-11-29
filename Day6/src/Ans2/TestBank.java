package Ans2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		BnkAcc arr = null;
		List<BnkAcc> acc = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int index = 0;
		
		do {
			System.out.println("1:Create Account\r\n"
					+ "2:Show Details\r\n"
					+ "3:Withdraw Amount\r\n"
					+ "4:Deposite Amount\r\n"
					+ "5:Apply for Locker\r\n"
					+ "6:Transfer Amount");
			
			System.out.print("Enter a Choice: ");
			choice = sc.nextInt();
			
			switch (choice) {//1:Create Account		
			case 1: {
				System.out.println("Name Initial_bal locker");
				arr=new BnkAcc(sc.next(), sc.nextDouble(), sc.nextBoolean());
				acc.add(arr);
				
				index++;
				break;
			}
			case 2: {//2:Show Details
				for (BnkAcc a: acc) {
					System.out.println(a);
				}
				break;
						}
			case 3: {//3:Withdraw Amount
				System.out.println("Enter accno: ");
				int acno = sc.nextInt();
				for (BnkAcc a: acc) {
					if(a.getAccno() == acno)
					{
						System.out.println("Enter Amount To Withdraw: ");
						int amt=sc.nextInt();
						a.debit(amt);
						break;
					}
				}
				break;
			}
			case 4: {//4:Deposit Amount
				System.out.println("Enter Accno to Credit: ");
				int acno = sc.nextInt();
				for (BnkAcc a: acc) {
					if(a.getAccno() == acno) {
						System.out.println("Enter Amount To Withdraw: ");
						int amt=sc.nextInt();
						a.credit(amt);
						break;
					}
				}
				//ba.credit(amt1);
				break;
			}
			case 5: {//5:Apply for Locker
				System.out.println("Enter amt to Credit: ");
				int amt1 = sc.nextInt();
				//ba.credit(amt1);
				break;
			}
			case 6: {//6:Transfer Amount
				System.out.println("Enter Accno to Credit: ");
				int cre = sc.nextInt();
				System.out.println("Enter Accno to Debit: ");
				int deb = sc.nextInt();
				System.out.println("Enter transfer Amount: ");
				int amt=sc.nextInt();
			
				for (BnkAcc a: acc) {
					if(a.getAccno() == deb) {
						a.debit(amt);
						System.out.println("Debit Successful");
						break;
					}
				}
				for (BnkAcc a: acc) {
					if(a.getAccno() == cre) {
						a.credit(amt);
						System.out.println("Transfer Successful");
						break;
					}
				}
				break;
				
			}
			default:
				choice = 7;
			}
			
		} while (choice < 7);
		
	}

}
