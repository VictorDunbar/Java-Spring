package com.codingdojo.zookeeper;

public class Mammal {
	protected int energyLevel = 100;
	public int displayEnergy() {
		System.out.print("Energy Level: " + energyLevel);
		return energyLevel;
	}
}
