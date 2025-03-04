import java.util.List;

public class AITrainer extends Trainer {
    public AITrainer(String name, char gender, List<Pokemon> pokemonCollection) {
        super(name, gender); 
        this.pokemonCollection = pokemonCollection;
    }

    public void makeMove(Pokemon opponent) {
        int random = (int)(Math.random() * 2);
        if(random == 0) {
            int random2 = (int)(Math.random() * 2);
            if(random2 == 0){
                this.fightCommand(1, opponent); 
            }else{
                this.fightCommand(2, opponent);}  
            } else{
                this.interactWithBagCommand();}
    }
}

    