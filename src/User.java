public class User {
    private String username;
    private String[] pokemons;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(String[] pokemons) {
        this.pokemons = pokemons;
    }
}
