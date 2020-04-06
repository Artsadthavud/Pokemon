package NEWERAPOKEMON;

class DIRT extends LIFEPOKEMON{
  

    protected int attackFoes(int DMG) {
        return 0;
    }

    @Override
    protected void addStatusPokemon(String Name,String cLass, int HP, int SP, int DMG) {
        this.Name = Name;
        this.HP = HP;
        this.SP = SP;
        this.DMG = DMG;
        this.cLass = cLass;
    }
    @Override
    protected void addName(String Name) {
       this.Name = Name;
    }

    @Override
    protected void setMaxStatus(int MaxHP, int MaxSP) {
        this.MaxHP = MaxHP;
        this.MaxSP = MaxSP;
    }
  
}