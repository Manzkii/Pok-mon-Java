import java.util.Scanner;


public class BattleSystem{
    public void startBattle(AITrainer ai, Player player){
        Scanner sc = new Scanner(System.in);
        int playerMoveChoice = 0;
        

        System.out.println(player.name + "is battling" + ai.name);

while(player.hasLost == false && !ai.hasLost){

            System.out.println("What's your move?");
            System.out.println("[1] Physical Attack");
            System.out.println("[2] Elemental Attack");
            System.out.println("[3] Interact with bag");
            playerMoveChoice = sc.nextInt();

            while (playerMoveChoice < 1 && playerMoveChoice > 3) {
                System.out.println("Invalid command, please try again.");
                System.out.println("[1] Physical Attack");
                System.out.println("[2] Elemental Attack");
                System.out.println("[3] Interact with bag");
                playerMoveChoice = sc.nextInt();
            }

            if(playerMoveChoice == 1 || playerMoveChoice == 2){
                player.fightCommand(playerMoveChoice, ai.pokemonCollection.get(playerMoveChoice));
            }else{
                player.interactWithBagCommand();
                }


            System.out.println("AI's turn");
            ai.makeMove(player.returnequippedPokemon());
           
        }
    }
}