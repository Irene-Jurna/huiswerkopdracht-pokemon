import pokemon.FirePokemon;
import util.Generic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander");
        System.out.println(charmander.getName() + " " + charmander.getType().toString().toLowerCase());
        charmander.attack();

        Scanner sc = new Scanner(System.in);
        System.out.println("Welkom bij Pokemon!\nSpeler 1, wat is je gebruikersnaam?");
        String username1 = sc.nextLine();
        User player1 = new User(username1);

        System.out.println("Speler 2, wat is je gebruikersnaam?");
        String username2 = sc.nextLine();
        User player2 = new User(username2);

        System.out.println("Het spel gaat beginnen! " + player1.getUsername());
        Generic.createRandomPokemon();
    }
}