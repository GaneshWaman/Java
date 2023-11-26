package com.app.org;

public class Worker extends Emp {
	private int hworked, hrate;

	public Worker(int id, String name, int deptno, double sal, int hworked, int hrate) {
		super(id, name, deptno, sal);
		this.hworked = hworked;
		this.hrate = hrate;
	}

	public String getEmpDetails() {
		return super.getEmpDetails() + ", sal=" + sal + " hworked=" + hworked + " hrate=" + hrate;
	}

	public double computeSal() {
		return hworked * hrate;
	}

	public int gethrate() {
		return hrate;
	}

}
