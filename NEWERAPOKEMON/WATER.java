package NEWERAPOKEMON;

class WATER extends LIFEPOKEMON{
  
    protected void namePokemon(String Name) {
        this.Name = Name;
    }
    protected void hpPokemon(int HP) {
        this.HP = HP;
    }
    protected void spPokemon(int SP){
        this.SP = SP;
    }
    protected void dmgPokemon(int DMG) {
       this.DMG = DMG;
    }

    protected int attackFoes() {
        return 0;
    }
}
  