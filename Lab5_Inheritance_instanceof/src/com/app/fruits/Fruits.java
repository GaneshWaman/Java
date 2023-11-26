package com.app.fruits;

public class Fruits {
	protected String name;
	protected String color;
	protected double weight;
	protected boolean fresh;
	public Fruits(String name, String color, double weight, boolean fresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = fresh;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	public String test() {
		return "Test of Fruit";
	}
	public void jam() {
		
	}
	public void juice() {
		
	}
	public void pulp() {
		
	}
	
	
	
}
