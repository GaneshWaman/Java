package com.fruit_basket;

enum name{
	MANGO, ORANGE, APPLE
}

 class Fruits {
	//color : String , weight : double , name:String, fresh : boolean
	private String name, color;
	private double weight;
	private boolean fresh;
	
	public Fruits() {
		
	}

	public Fruits(String name, String color, double weight, boolean fresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = fresh;
	}
	
	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	
	

}
