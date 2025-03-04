import java.util.Scanner;

public class BattleInterface {
    public static void battle(Player player, Trainer opponent) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You encountered " + opponent.name + "!");

        while (player.returnequippedPokemon().getHp() > 0 && opponent.returnequippedPokemon().getHp() > 0) {
            System.out.println("Choose an action: 1. Attack  2. Run");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println(player.returnequippedPokemon().getName() + " attacks " + opponent.returnequippedPokemon().getHp() + "!");
                opponent.returnequippedPokemon().takeDamage(player.returnequippedPokemon().patk);
                if (opponent.returnequippedPokemon().hp <= 0) {
                    System.out.println("You defeated " + opponent.name + "!");
                    break;
                }
                System.out.println(opponent.name + " attacks back!");
                player.returnequippedPokemon().takeDamage(opponent.returnequippedPokemon().patk);
                if (player.returnequippedPokemon().getHp() <= 0) {
                    System.out.println("You lost the battle!");
                }
            } else {
                System.out.println("You ran away!");
                break;
            }
        }
    }
}
