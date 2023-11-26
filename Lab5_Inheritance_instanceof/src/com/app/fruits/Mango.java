package com.app.fruits;

public class Mango extends Fruits{
	public Mango(String name, String color, double weight, boolean fresh) {
		super(name, color, weight, fresh);
	}

	@Override
	public String toString() {
		return "Mango [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	public String test() {
		return "sweet";
	}
	public void pulp() {
		System.out.println("Display name n color of the fruit + a mesg  creating  pulp!"); 
		}
}
