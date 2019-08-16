package com.codingdojo.phoneproject;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		String toReturn= ("Galaxy "+this.getVersionNumber()+" says Ring Ring Ring!");
		return toReturn;
	}

	@Override
	public String unlock() {
		String toReturn=("Unlocking via finger print");
		return toReturn;
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy "+this.getVersionNumber()+" from "+this.getCarrier());

	}

}
