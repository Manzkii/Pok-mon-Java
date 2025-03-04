public class Player extends Trainer{
    int pokeballs = 0;
    boolean insideGym;
    

    public Player(String name, char gender, Pokemon starter){
        super(name, gender);
        this.pokemonCollection.add(starter);
    }

    public void catchPokemon(Pokemon wildPokemon) {
        if (pokeballs > 0) {
            System.out.println("You caught " + wildPokemon.getName() + "!");
            pokemonCollection.add(wildPokemon);
            pokeballs--;
        } else {
            System.out.println(wildPokemon.getName() + " ran away!");
        }
    }

    public void changeZone(int zone){
        this.zone = zone;
    }


}