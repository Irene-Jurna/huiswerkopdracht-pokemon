package pokemon;

public class FirePokemon extends Pokemon {
    private static final String FIRE_TYPE = "fire";
    public FirePokemon(String name) {
        super(name, FIRE_TYPE);
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
