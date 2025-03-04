import java.util.*;
public class Trainer {
    public String name;
    
    private char gender;
    public List<Pokemon> pokemonCollection = new ArrayList<>();
    public int equippedPokemon = 0;
    public int zone;
    public boolean hasLost = false;

    public Trainer(String name, char gender) {
        this.name = name;
        this.gender = gender;
        
    }

    public Pokemon returnequippedPokemon(){
        return pokemonCollection.get(equippedPokemon);
    }

    public void interactWithBagCommand(){
        //opens bag if closed, closes bag if opened
    }

    public void fightCommand(int atkType, Pokemon opponent){

        //commands pokemon to attack
        //atkType 1 = physical
        if(atkType == 1){
            pokemonCollection.get(equippedPokemon).physicalAttack(opponent);
        }else{
            pokemonCollection.get(equippedPokemon).elementalAttack(opponent);
        }
        //atkType 2 = elemental
        
    }
    

    public void lose(){
        //makes trainer lose
    }

    public void win(){
        //makes trainer win
    }
    
}