public class FirePokemon extends Pokemon {
    private static final String FIRE_TYPE = "fire";
    public FirePokemon(String name) {
        super(name, FIRE_TYPE);
    }

    @Override
    void defend() {
        System.out.println("Fire defence");
    }

    @Override
    void attack() {
        System.out.println("Fire attack!");
    }
}
