import java.util.*;

public class Encounter{
    public Encounter(Player player){
        if(player.insideGym == false){
             // randomly decide pokemons
            //Zone zone = new Zone(Arrays.asList(ZoneTypes.Wilds),1);
            ZoneElements randomElements = zone.getRandomZoneElement();
            Pokemon wildPokemons = zone.encounterWildPokemonByElement(randomElements);
            if(wildPokemons != null){
                System.out.println("You encountered a wild " + wildPokemons.getName() + "!");        
        }else{
            // choose who to encounter
        }
    }
    }
}