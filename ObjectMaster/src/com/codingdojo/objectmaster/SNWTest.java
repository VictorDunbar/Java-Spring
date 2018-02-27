package com.codingdojo.objectmaster;

public class SNWTest {
	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		Samurai sam1 = new Samurai();
		Samurai sam2 = new Samurai();
		Wizard wizard1 = new Wizard();
		Wizard wizard2 = new Wizard();
		
		sam1.deathBlow(wizard2);
		System.out.println("Samurai 1 killed Wizard 2!!");
		wizard2.displayHealth();
		wizard1.fireball(sam2).fireball(sam2);
		System.out.println("Wizard 1 rained down fire and fury on Samurai 2!");
		ninja.steal(wizard1).runAway();
		System.out.println("Ninja stole Wizard 1's crystal ball and ran away!;");
		sam2.meditate();
		System.out.println("Samurai 2 is steadily recovering from the shitstorm he received!");
		ninja.steal(sam2);
		System.out.println("Ninja stole Samurai 2's helmet while he was meditating...sneaky bastard.");
		wizard1.fireball(ninja);
		System.out.println("Wizard 1 blasted Ninja with a fireball.");
		wizard1.heal(wizard2).fireball(sam1);
		System.out.println("Wizard 1 cast a healing  spell on Wizard 2, while blasting Samurai 1 with more fire!");
		sam1.meditate();
		System.out.println("Samurai 1 needs a break from battle!");
		
		sam2.howMany();
		
		ninja.displayHealth();
		wizard1.displayHealth();
		
		sam1.displayHealth();
		sam2.displayHealth();
	}

}