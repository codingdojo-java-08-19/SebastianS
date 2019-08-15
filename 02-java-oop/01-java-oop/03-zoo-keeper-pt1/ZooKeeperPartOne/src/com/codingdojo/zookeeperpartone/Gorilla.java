package com.codingdojo.zookeeperpartone;

public class Gorilla extends Mammal{
	public void throwSomething() {
		int energyLevel=this.getEnergyLevel();
		this.setEnergyLevel(energyLevel-5);
		System.out.println("The Gorilla has thrown something.");
	}
	public void eatBananas() {
		int energyLevel=this.getEnergyLevel();
		this.setEnergyLevel(energyLevel+10);
		System.out.println("The Gorilla is satisfied with bananas.");
	}
	public void climb() {
		int energyLevel=this.getEnergyLevel();
		this.setEnergyLevel(energyLevel-10);
		System.out.println("The Gorilla has climbed a tree.");
	}
}
