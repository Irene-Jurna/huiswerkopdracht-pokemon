import pokemon.Pokemon;
import util.GameMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welkom bij Pokemon!\nSpeler 1, wat is je gebruikersnaam?");
        String username1 = sc.nextLine();
        User player1 = new User(username1);

        System.out.println("Speler 2, wat is je gebruikersnaam?");
        String username2 = sc.nextLine();
        User player2 = new User(username2);

        System.out.println("Het spel gaat beginnen! " + player1.getUsername());
        Pokemon newPokemonPlayer1 = GameMethod.createRandomPokemon();
        player1.addPokemon(newPokemonPlayer1);

        System.out.println(player2.getUsername() + " we gaan jouw pokemon bepalen: ");
        Pokemon newPokemonPlayer2 = GameMethod.createRandomPokemon();
        player2.addPokemon(newPokemonPlayer2);

        System.out.println("Gefeliciteerd met jullie pokemons! Laat de wedstrijd beginnen!");
        System.out.println(player1.getUsername() + ", kies een actie: aanvallen[A] / verdedigen[V]");
        String choicePlayer1 = sc.nextLine();
    }
}