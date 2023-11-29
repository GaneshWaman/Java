package com.fruit_basket;

class Mango extends Fruits {
//	color : String , weight : double , name:String, fresh : boolean
	private String name, color;
	private double weight;
	private boolean fresh;
	
	public Mango(String name , String color, double weight, boolean fresh) {
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
		return "Mango [name=" + name + ", color=" + color + ", weight=" + weight + ", fresh=" + fresh + "]";
	}
	
	public String test() {
		 return "Sweet";
	 }
	public static void function() {
		System.out.println("a mesg  creating  pulp!");
		}

	
	

}
