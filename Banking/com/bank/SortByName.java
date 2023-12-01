package com.bank;

import java.util.Comparator;

public class SortByName implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
