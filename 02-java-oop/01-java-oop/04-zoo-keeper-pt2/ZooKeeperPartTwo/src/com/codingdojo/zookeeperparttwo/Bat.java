package com.codingdojo.zookeeperparttwo;

public class Bat extends Mammal {
	public Bat() {
		this.setEnergyLevel(300);
	}
	public void fly() {
		int energyLevel=this.getEnergyLevel();
		this.setEnergyLevel(energyLevel-50);
		System.out.println("Fwoosh!");
	}
	public void eatHumans() {
		int energyLevel=this.getEnergyLevel();
		this.setEnergyLevel(energyLevel+25);
	}
	public void attackTown() {
		int energyLevel=this.getEnergyLevel();
		this.setEnergyLevel(energyLevel-100);
		System.out.println("Crash! Burn!");
	}
}
