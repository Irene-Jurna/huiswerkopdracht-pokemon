package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generic {
    public static void createRandomPokemon() {
        List<String> pokemonTypes = new ArrayList<>();
        pokemonTypes.add("electric");
        pokemonTypes.add("fire");
        pokemonTypes.add("grass");
        pokemonTypes.add("water");

        String randomType = getRandomPokemonType(pokemonTypes);
        System.out.println("Jouw pokemon type is: " + randomType);
    }

    private static String getRandomPokemonType(List<String> pokemonTypes) {
        Random random = new Random();
        return pokemonTypes.get(random.nextInt(pokemonTypes.size()));
    }
}
