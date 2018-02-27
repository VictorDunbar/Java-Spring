package com.codingdojo.zookeeper;

public class Dragon extends Mammal {
	
	public Dragon() {
		this.energyLevel = 300;
	}
	public Dragon fly() {
		System.out.println("SwwwwwwoooooooooooppppSwiiiiiiiiissshhhhh");
		this.energyLevel -= 50;
		return this;
	}
	public Dragon eatHumans() {
		System.out.println("OMG! It just ate 3 poeple and left the dog! WOW... Impressive!");
		this.energyLevel += 25;
		return this;
	}
	public Dragon attackTown() {
		System.out.println("CRASH! FIRE! DESPAIR! *sound of a man on fire, screaming*");
		this.energyLevel -= 100;
		return this;
	}

}

