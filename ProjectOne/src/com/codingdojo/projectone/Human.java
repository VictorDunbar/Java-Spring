package com.codingdojo.projectone;
class Human extends Mammal {
	
	
	public void goToWork() {
		System.out.println("I'm going to work, something only humans can do.");
	}
	
	public void startSleeping() {
		System.out.println("Toss and Turn");
		super.startSleeping();
	}
	
}
