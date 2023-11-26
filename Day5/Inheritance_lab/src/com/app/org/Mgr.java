package com.app.org;

public class Mgr extends Emp {
	double perfBonus;

	public Mgr(int id, String name, int deptno, double sal, double perfBonus) {
		super(id, name, deptno, sal);
		this.perfBonus = perfBonus;
	}

	public String getEmpDetails() {
		return super.getEmpDetails() + "Mgr perfBonus= " + perfBonus;
	}

	public double computeSal() {
		return super.sal + this.perfBonus;
	}

	public double getPerfBonus() {
		return perfBonus;
	}

}
