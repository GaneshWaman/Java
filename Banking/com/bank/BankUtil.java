package com.bank;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class BankUtil {
	
	public static List<Bank> getBankDetails() throws ParseException {
		List<Bank> list = new ArrayList<>();
		
		list.add(new Bank("Ganesh", 10000, "10/09/1999", "current"));
		list.add(new Bank("Kalpesh", 100000, "18/11/1997", "saving"));
		list.add(new Bank("Vikram", 90000, "24/6/2000", "loan"));
		list.add(new Bank("Amrut", 50000,"05/03/2001", "current"));
		return list;
		
	}
}
