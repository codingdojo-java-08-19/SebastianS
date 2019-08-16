package com.codingdojo.phoneproject;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		String toReturn= ("iPhone "+this.getVersionNumber()+" says Zing");
		return toReturn;
	}

	@Override
	public String unlock() {
		String toReturn=("Unlocking via facial recognition");
		return toReturn;
	}

	@Override
	public void displayInfo() {
		System.out.println("iPhone "+this.getVersionNumber()+" from "+this.getCarrier());

	}

}
