package com.app.org;

public class Emp {
	private int id, deptid;
	private String name;
	protected double sal;

	public Emp(int id, String name, int deptno, double sal) {
		this.id = id;
		this.name = name;
		this.deptid = deptno;
		this.sal = sal;
	}

	public String getEmpDetails() {
		return ("Emp id=" + id + ", deptid=" + deptid + ", name=" + name + ", sal=" + sal);
	}

	public double computeSal() {
		return sal;
	}
}
