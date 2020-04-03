package NEWERAPOKEMON;

class FIRE extends LIFEPOKEMON{
  
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
    public String getName() {
        return Name;
    }
    public int getHP(){
        return HP;
    }
    public int getSP(){
        return SP;
    }
    public int getDMG(){
        return DMG;
    }

  
}