enum PokemonTypes{
    Bug, Dragon, Electric, Fighting, Fire, Poison, Rock, Flying, Ghost, Grass, Ground, Ice, Psychic, Water, Normal
}

public class Pokemon{
    String name;
    PokemonTypes type;
    int hp, def, sp = 100, patk, eatk;

    public Pokemon(String name, PokemonTypes type, int hp, int patk, int eatk, int def) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.def = def;
        this.patk = patk;
        this.eatk = eatk;
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return name + " (" + type + " Type)";
    }
}