package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import pokemon.ElectricPokemon;
import pokemon.FirePokemon;
import pokemon.GrassPokemon;
import pokemon.WaterPokemon;

public class Generic {
    public static void createRandomPokemon() {
        List<String> pokemonTypes = new ArrayList<>();
        pokemonTypes.add("electric");
        pokemonTypes.add("fire");
        pokemonTypes.add("grass");
        pokemonTypes.add("water");

        String randomType = getRandomPokemonType(pokemonTypes);
        System.out.println("Jouw pokemon type is: " + randomType);
        Object randomPokemon = getRandomPokemon(randomType);
        System.out.println("Jouw pokemon is: " + randomPokemon + "!");
    }

    private static String getRandomPokemonType(List<String> pokemonTypes) {
        Random random = new Random();
        return pokemonTypes.get(random.nextInt(pokemonTypes.size()));
    }

    private static Object getRandomPokemon(String type) {
        switch (type) {
            case "fire":
                return new FirePokemon("Charizard");
            case "water":
                return new WaterPokemon("Naam waterig diertje");
            case "grass":
                return new GrassPokemon("Grasshopper");
            case "electric":
                return new ElectricPokemon("Bliksem");
            default:
                throw new IllegalStateException("Onbekend type: " + type);
        }
    }
}
