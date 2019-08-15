package com.codingdojo.objectmasterpartone;

public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	private String unitClass;
	
	public Human() {
		this.strength=3;
		this.stealth=3;
		this.intelligence=3;
		this.health=100;
		this.unitClass="default";
	}
	
	public int attack(Human target) {
		int newHealth= target.health-this.strength;
		target.setHealth(newHealth);
		return newHealth;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getUnitClass() {
		return unitClass;
	}

	public void setUnitClass(String unitClass) {
		this.unitClass = unitClass;
	}
}