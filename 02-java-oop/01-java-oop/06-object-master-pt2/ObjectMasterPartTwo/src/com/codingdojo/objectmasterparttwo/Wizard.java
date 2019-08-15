package com.codingdojo.objectmasterparttwo;

public class Wizard extends Human {
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	public void heal(Human target) {
		int newHealth=target.getHealth()+this.getIntelligence();
		target.setHealth(newHealth);
	}
	public void fireball(Human target) {
		int newHealth=target.getHealth()-this.getIntelligence()*3;
		target.setHealth(newHealth);
	}
	
}
