package com.bank;

import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) throws ParseException {
		List<Bank> details = BankUtil.getBankDetails();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println(" ");
			System.out.println("1:Display Bank Accounts");
			System.out.println("2:Add new Bank Account");
			System.out.println("3:Get whose Bank Account Balance >40000");
			System.out.println("4:Get details of Saving Accounts");
			System.out.println("5:Remove Bank Account");
			System.out.println("6:Sort Bank Accounts");
			System.out.println("7:Sort Bank Accounts By Balance ");
			System.out.println("8:Sort Bank Accounts By name ");
			System.out.println("9:Withdraw Amount ");
			System.out.println("10:Credit Amount ");
			System.out.println("11:Transfer Amount");
			System.out.println(" ");
			System.out.print("Choice : ");
			choice = sc.nextInt();
			System.out.println(" ");
			switch (choice) {
			case 1:// get all bank details
				for (Bank b : details) {
					System.out.println(b);
				}
				break;

			case 2:// add new Acc
				System.out.println("Name  bal  Dob  Acc_type");
				details.add(new Bank(sc.next(), sc.nextDouble(), sc.next(), sc.next()));
				System.out.println("Account Created Successfully.");
				break;

			case 3:// get bal > 40000
				for (Bank b : details) {
					if (b.getBal() > 40000) {
						System.out.println(b);
					}
				}
				break;

			case 4:// get Saving Acc
				for (Bank b : details) {
					if (b.getActype() == AccountType.saving) {
						System.out.println(b);
					}
				}
				break;

			case 5:// get Saving Acc
				System.out.print("Enter Acc no to delete Acc: ");
				int del = sc.nextInt();

				Iterator<Bank> bk = details.iterator();

				while (bk.hasNext()) {
					Bank acc = bk.next();
					if (acc.getActno() == del) {
						bk.remove();
						System.out.println("Account Deleted.");
					}
				}
				break;

			case 6:// Sort Acc desc
				Collections.sort(details);
				for (Bank b : details)
					System.out.println(b);
				break;

			case 7:// Sort Acc Balance
				Collections.sort(details, new SortByBalance());
				for (Bank b : details)
					System.out.println(b);
				break;

			case 8:// Sort Acc Balance
				Collections.sort(details, new SortByName());
				for (Bank b : details)
					System.out.println(b);
				break;

			case 9:// Withdraw Amount
				System.out.println("Enter your Account No: ");
				int wd = sc.nextInt();
				System.out.println("Enter Withdraw Amount");
				int wdamt = sc.nextInt();
				Iterator<Bank> bkw = details.iterator();
				while (bkw.hasNext()) {
					Bank bkw1 = bkw.next();
					if (bkw1.getActno() == wd) {
						if (bkw1.getBal() > wdamt) {
							bkw1.setBal(bkw1.getBal() - wdamt);
							System.out.printf("Amount %d Debited Successfully.", wdamt);
						} else
							System.out.println("Insufficient Balance.");
					}
				}

				break;
			case 10:// Credit Amount
				System.out.println("Enter your Account No: ");
				int cr = sc.nextInt();
				System.out.println("Enter Credit Amount");
				int cramt = sc.nextInt();
				Iterator<Bank> bkc = details.iterator();
				while (bkc.hasNext()) {
					Bank bkc1 = bkc.next();
					if (bkc1.getActno() == cr) {
						bkc1.setBal(bkc1.getBal() + cramt);
						System.out.printf("Amount %d Credited Successfully.", cramt);
					}
				}

				break;

			case 11:// Transfer Amount
				System.out.println("Enter your Account No: ");
				int dbt = sc.nextInt();
				System.out.println("Enter Account No to whom Transfer Amount: ");
				int crt = sc.nextInt();
				System.out.println("Enter Transfer Amount");
				int tr = sc.nextInt();

				Iterator<Bank> t = details.iterator();
				while (t.hasNext()) {
					Bank tr1 = t.next();
					if (tr1.getActno() == dbt) {
						if (tr1.getBal() > tr) {
							tr1.setBal(tr1.getBal() - tr);
						} else
							System.out.println("Insufficient Balance.");
					}
				}
				Iterator<Bank> t1 = details.iterator();
				while (t1.hasNext()) {
					Bank tr11 = t1.next();
					if (tr11.getActno() == crt)
						tr11.setBal(tr11.getBal() + tr);
				}
				System.out.printf("Amount %d has Transfered Successfully.", tr);

				break;

			default:
				choice = 12;
			}
		} while (choice < 12);

	}

}
