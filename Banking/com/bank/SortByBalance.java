package com.bank;

import java.util.Comparator;

public class SortByBalance implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getBal() - o2.getBal());
	}

}
