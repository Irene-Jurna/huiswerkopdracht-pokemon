package pokemon;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(String name, int healthPoints, int level, double weight, double height, String sound) {
        super(name, PokemonType.ELECTRIC, healthPoints, level, weight, height, sound);
    }

    @Override
    void defend() {

    }

    @Override
    void attack() {

    }
}
