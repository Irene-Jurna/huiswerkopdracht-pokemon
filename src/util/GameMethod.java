package util;

import java.util.Random;

import pokemon.*;

public class GameMethod {
    public static Pokemon createRandomPokemon() {
        PokemonType randomType = getRandomPokemonType();
        Pokemon randomPokemon = getRandomPokemon(randomType);
        System.out.println("Jouw pokemon type is: " + randomType + "!");
        System.out.println("Je krijgt...\n" + randomPokemon.getName() + "!");

        return randomPokemon;
    }

    private static PokemonType getRandomPokemonType() {
        PokemonType[] types = PokemonType.values();
        return types[new Random().nextInt(types.length)];
    }

    private static Pokemon getRandomPokemon(PokemonType type) {
        switch (type) {
            case FIRE:
                return new FirePokemon("Charmander");
            case GRASS:
                return new GrassPokemon("Bulbasaur");
            case WATER:
                return new WaterPokemon("Squirtle");
            case ELECTRIC:
                return new ElectricPokemon("Pikachu");
            default:
                throw new IllegalStateException("Onbekend type: " + type);
        }
    }
}
