package util;

import java.util.Random;

import pokemon.*;

import static pokemon.PokemonType.FIRE;

public class GameMethod {
    public static Pokemon createRandomPokemon() {
        PokemonType randomType = getRandomPokemonType();
        Pokemon randomPokemon = getRandomPokemon(randomType);
        System.out.println("Jouw pokemon type is: " + randomType + "!\n");
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
                return new FirePokemon("Charmander", 10, 1, 25, 50, "Char-char");
            case GRASS:
                return new GrassPokemon("Bulbasaur", 10, 1, 55, 20, "Bulba-bulba");
            case WATER:
                return new WaterPokemon("Squirtle", 10, 1, 50, 18, "Squir-squir");
            case ELECTRIC:
                return new ElectricPokemon("Pikachu", 10, 1, 7, 33, "pika-pika");
            default:
                throw new IllegalStateException("Onbekend type: " + type);
        }
    }
}
