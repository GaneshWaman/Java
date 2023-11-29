package com.fruit_basket;

public class Apple extends Fruits{
	private String name, color;
	private double weight;
	private boolean fresh;
	
	public Apple(String name , String color, double weight, boolean fresh) {
		super(name, color, weight, fresh);	
	}

	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	@Override
	public String toString() {
		return "Apple [name=" + name + ", color=" + color + ", weight=" + weight + ", fresh=" + fresh + "]";
	}
	public String test() {
		 return "Sweet & Sour";
	 }
	public static void function() {
		System.out.println("a mesg  creating  Jam!");
		}
}
