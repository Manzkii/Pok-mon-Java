import java.util.Scanner;

//handles all text
public class TurnbasedSystem{

    public static Player intro(String playerName, char playerGender, Pokemon starterPokemon){
    
        Scanner sc = new Scanner(System.in);
        playerGender = ' ';
        playerName = " ";
        starterPokemon = null;
        int starterChoice;

        
        System.out.println("Welcome to the JAVAMON!");
        System.out.println("Please introduce yourself:");

       
        System.out.println("Enter your name: ");
        playerName = sc.nextLine();
        

   
        System.out.println("Enter your gender (Male/Female/Other): ");
        while(playerGender != 'm' && playerGender != 'f'){
            System.out.println("Select your gender: [M] or [F] ");
            playerGender = sc.next().toLowerCase().charAt(0);
        }

        while(starterPokemon == null){
            System.out.println("Select your starter pokemon: ");
            System.out.println("[1] Charizard");
            System.out.println("[2] Blastoise");
            System.out.println("[3] Venosaur");
            starterChoice = sc.nextInt();
            starterPokemon = Main.starterPokemons[starterChoice -1];
        }

        System.out.println("Hello, " + playerName + "!");
        System.out.println("You are a " + playerGender + " player.");
        System.out.println("Let's start the adventure!");

        return (new Player(playerName, playerGender, starterPokemon));
    }

    public int zoneSelector(Player player){
        Scanner sc = new Scanner(System.in);

        System.out.println("Select an area you want to go.");
        System.out.println("[1] Area 1");
        System.out.println("[2] Area 2");
        System.out.println("[3] Area 3");
        System.out.println("[4] Area 4");
        System.out.println("[5] Area 5");
        System.out.println("[6] Area 6");
        System.out.println("[7] Area 7");
        System.out.println("[8] Area 8");
        System.out.println("[9] Area 9");
        System.out.println("[10] Area 10");
        System.out.println("[11] Area 11");
        System.out.println("[12] Area 12");
        System.out.println("[13] Area 13");
        System.out.println("[14] Area 14");
        System.out.println("[15] Area 15");

        int areaChoice = sc.nextInt();
        while(areaChoice > 15 || areaChoice < 0){
            System.out.println("Invalid zone, please try again.");
            areaChoice = sc.nextInt();
        }
        player.changeZone(areaChoice);

        return areaChoice;

    }

    public void zoneTypeSelector(Player player){
        Scanner sc = new Scanner(System.in);

        System.out.println("This zone has two types. Please select one.");
        System.out.println("[1] Wilds \n[2] Gym");

        int zoneTypechoice = sc.nextInt();

        while (zoneTypechoice != 1 && zoneTypechoice != 2) { 
            System.out.println("Invalid input, please try again.");
            System.out.println("[1] Wilds \n[2] Gym");
            zoneTypechoice = sc.nextInt();
        }

        if(zoneTypechoice == 1){
            player.insideGym = false;
        }else{
            player.insideGym = true;
        }

    }

    public void displayZoneDetails(Zone zone){
        System.out.println("You have entered "+ zone.zoneId);
        System.out.println("This zone has an element of "+ zone.zoneElement);
        System.out.println("Only pokemons of said elements can be encountered here.");
    }


    public void loseScene(){

    }
}