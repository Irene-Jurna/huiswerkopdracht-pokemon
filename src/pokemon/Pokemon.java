package pokemon;

public abstract class Pokemon {
    private String name;
    private final PokemonType type;
    private int healthPoints;
    private int level;
    private double weight;
    private double height;
    private String sound;

    public Pokemon(String name, PokemonType type) {
        this.name = name;
        this.type = type;
    }

    public Pokemon(String name, PokemonType type, int healthPoints, int level, double weight, double height, String sound) {
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
        this.level = level;
        this.weight = weight;
        this.height = height;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type.toString().toLowerCase();
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    abstract void defend();
    abstract void attack();
}
