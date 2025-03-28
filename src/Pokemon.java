public abstract class Pokemon {
    private String name;
    private String type;
    private int healthPoints;
    private int level;
    private double weight;
    private double height;
    private String sound;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Pokemon(String name, String type, int healthPoints, int level, double weight, double height, String sound) {
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
        return type;
    }

    abstract void defend();
    abstract void attack();
}
