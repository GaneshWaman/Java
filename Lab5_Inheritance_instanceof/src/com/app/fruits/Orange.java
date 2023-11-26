package com.app.fruits;

public class Orange extends Fruits{
	public Orange(String color, double weight, String name, boolean fresh) {
		super(name, color, weight, fresh);
	}

	@Override
	public String toString() {
		return "Orange [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	public String test() {
		return "sour";
	}
	public void juice() {
		System.out.println("Display name n weight of the fruit + a mesg extracting juice!");
	}
	
}
