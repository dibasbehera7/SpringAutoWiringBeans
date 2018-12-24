package com.dibas.food;

public class Meal {

	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable veg;
	 
	
	
	public Meal(Fruit f, Dairy d, Grain g, Meat m, Vegetable v) {
		this.fruit = f;
		this.dairy = d;
		this.grain = g;
		this.meat = m;
		this.veg = v;
	}
	
	
	public Dairy getDairy() {
		return dairy;
	}
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Vegetable getveg() {
		return veg;
	}
	public void setveg(Vegetable veg) {
		this.veg = veg;
	}
	
	public String whatsInTodaysMeal() {
		
		String menu = "Today's Meal contains:\n";
		
		if(fruit!=null) menu += "some fruits:\n";
		if(dairy!=null) menu += "some dairy:\n";
		if(grain!=null) menu += "some grain:\n";
		if(meat!=null) menu += "some meat:\n";
		if(veg!=null) menu +="some vegs:\n";
 		
		return menu;
	}
	
	
}
