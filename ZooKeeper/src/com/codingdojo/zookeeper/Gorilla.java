package com.codingdojo.zookeeper;
public class Gorilla extends Mammal{
	
	
	public void throwSomething() {
		System.out.println("The Gorilla is throwing his banana peel at you!");
		this.energyLevel = energyLevel -5;
	}
	public void eatBanana() {
		System.out.println("Eating a banana!");
		this.energyLevel = energyLevel +10;
	}
	public void climb() {
		System.out.println("Climbing the willow tree!");
		this.energyLevel = energyLevel -10;
	}
}


