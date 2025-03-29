package pokemon;

public class FirePokemon extends Pokemon {
    public FirePokemon(String name) {
        super(name, PokemonType.FIRE);
    }

    @Override
    public void defend() {
        System.out.println("Fire defence");
    }

    @Override
    public void attack() {
        System.out.println("Fire attack!");
    }
}
