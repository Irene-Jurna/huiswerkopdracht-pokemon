public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander");
        System.out.println(charmander.getName() + charmander.getType());
        charmander.attack();
    }
}