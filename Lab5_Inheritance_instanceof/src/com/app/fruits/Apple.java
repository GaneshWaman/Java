package com.app.fruits;

public class Apple extends Fruits {
	public Apple(String color, double weight, String name, boolean fresh) {
		super(name, color, weight, fresh);
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	public String test() {
		return "sweet n sour";
	}
	public void jam() {
		System.out.println("Display name of the fruit + a mesg  making jam!");
	}
	
}
