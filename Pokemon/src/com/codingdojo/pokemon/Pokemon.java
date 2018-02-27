package com.codingdojo.pokemon;

public class Pokemon implements PokemonInterface {
	private String name;
	private int health;
	private String type;
	private static int count = 0;
	
	public Pokemon(String name, int health, String type) {
		this.setName(name);
		this.setHealth(health);
		this.setType(type);
		count++;
	}
	// getters and setters
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return this.health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
	}
	public void pokemonInfo(Pokemon pokemon) {
		System.out.println("Name: " + this.name);
		System.out.println("Health " + this.health);
		System.out.println("Type: "+ this.type);
	}
	
	
}
