import java.util.*;

public class Zone {
    private String type;
    private List<Pokemon> wildPokemons;

    public Zone(String type, List<Pokemon> wildPokemons) {
        this.type = type;
        this.wildPokemons = wildPokemons;
    }

    public Pokemon encounterWildPokemon() {
        if (wildPokemons.isEmpty()) {
            System.out.println("No wild Pokémon available in this zone.");
            return null;
        }
        Random rand = new Random();
        return wildPokemons.get(rand.nextInt(wildPokemons.size()));
    }
}
