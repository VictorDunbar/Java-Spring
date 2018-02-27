package com.codingdojo.pokemon;

public interface PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type);
	public void attackPokemon(Pokemon pokemon);
	public void pokemonInfo(Pokemon pokemon);
}
