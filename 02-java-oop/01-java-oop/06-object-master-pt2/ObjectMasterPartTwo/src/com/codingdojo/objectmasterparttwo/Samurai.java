package com.codingdojo.objectmasterparttwo;

public class Samurai extends Human {
	private static int count=0;
	public Samurai() {
		this.setHealth(200);
		this.setCount(this.getCount()+1);
	}
	public void deathBlow(Human target) {
		target.setHealth(0);
		int newHealth=this.getHealth()/2;
		this.setHealth(newHealth);
	}
	public void meditate() {
		int newHealth= this.getHealth()+this.getHealth()/2;
		this.setHealth(newHealth);
	}
	public int howMany() {
		return this.getCount();
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Samurai.count = count;
	}
}
