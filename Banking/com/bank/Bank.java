package com.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bank implements Comparable<Bank> {
	private int actno;
	private String name;
	private double bal;
	private Date opdt;
	private AccountType actype;
	public static SimpleDateFormat sdf;
	public static int cnt;

	static {
		cnt = 1001;
		sdf = new SimpleDateFormat("dd/mm/yyyy");
	}

	public Bank(String name, double bal, String opdt, String actype) throws ParseException {
		super();
		this.actno = Bank.cnt;
		this.name = name;
		this.bal = bal;
		this.opdt = sdf.parse(opdt);
		this.actype = AccountType.valueOf(actype);
		cnt++;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public int getActno() {
		return actno;
	}

	public String getName() {
		return name;
	}

	public String getOpdt() {
		return sdf.format(opdt);
	}

	public AccountType getActype() {
		return actype;
	}

	@Override
	public String toString() {
		return "Bank [actno=" + actno + ", name=" + name + ", bal=" + bal + ", opdt=" + sdf.format(opdt) + ", actype="
				+ actype + "]";
	}

	@Override
	public int compareTo(Bank o) {
		// TODO Auto-generated method stub
		return o.actno - this.actno;
	}

}
