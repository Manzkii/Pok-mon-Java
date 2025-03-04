import java.util.Scanner;

public class BattleInterface {
    public static void battle(Player player, Trainer opponent) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You encountered " + opponent.name + "!");

        while (player.returnequippedPokemon().getHp() > 0 && opponent.returnequippedPokemon().getHp() > 0) {
            System.out.println("Choose an action: 1. Physical Attack  2. Elemental Attack 3. Run");
            int choice = scanner.nextInt();

            if (choice == 1) {
                player.returnequippedPokemon().physicalAttack(opponent.returnequippedPokemon());
            } else if (choice == 2) {
                player.returnequippedPokemon().elementalAttack(opponent.returnequippedPokemon());
            } else if (choice == 3) {
                System.out.println("You ran away!");
                break;
            }

            if (opponent.returnequippedPokemon().getHp() <= 0) {
                System.out.println("You defeated " + opponent.name + "!");
                break;
            }

            System.out.println(opponent.name + " attacks back!");
            opponent.returnequippedPokemon().physicalAttack(player.returnequippedPokemon());

            if (player.returnequippedPokemon().getHp() <= 0) {
                System.out.println("You lost the battle!");
            }
            
        }
    }
}
