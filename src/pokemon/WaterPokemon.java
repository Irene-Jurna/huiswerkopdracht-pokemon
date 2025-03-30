package pokemon;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int healthPoints, int level, double weight, double height, String sound) {
        super(name, PokemonType.WATER, healthPoints, level, weight, height, sound);
    }

    @Override
    void defend() {
    }

    @Override
    void attack() {
    }
}
