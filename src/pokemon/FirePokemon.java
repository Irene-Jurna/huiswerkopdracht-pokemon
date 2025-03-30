package pokemon;

public class FirePokemon extends Pokemon {
    public FirePokemon(String name, int healthPoints, int level, double weight, double height, String sound) {
        super(name, PokemonType.FIRE, healthPoints, level, weight, height, sound);
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
