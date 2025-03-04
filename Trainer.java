import java.util.*;

public class Trainer {
    public String name;
    
    private char gender;
    public List<Pokemon> pokemonCollection = new ArrayList<>();
    public int equippedPokemon = 0;

    public Trainer(String name, char gender) {
        this.name = name;
        this.gender = gender;
        
    }

    public Pokemon returnequippedPokemon(){
        return pokemonCollection.get(equippedPokemon);
    }
}