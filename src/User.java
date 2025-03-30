import pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Pokemon> pokemons;

    public User(String username) {
        this.username = username;
        this.pokemons = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }
}
