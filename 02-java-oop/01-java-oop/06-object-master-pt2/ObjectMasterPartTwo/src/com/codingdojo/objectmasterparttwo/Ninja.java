package com.codingdojo.objectmasterparttwo;

public class Ninja extends Human {
	public Ninja() {
		this.setStealth(10);
	}
	public void steal(Human target) {
		int targetHealth = target.getHealth()-this.getStealth();
		int ninjaHealth= this.getHealth()+this.getStealth();
		this.setHealth(ninjaHealth);
		target.setHealth(targetHealth);
	}
	public void runAway() {
		int ninjaHealth=this.getHealth()-10;
		this.setHealth(ninjaHealth);
	}
}
