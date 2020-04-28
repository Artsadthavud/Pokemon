package NEWERAPOKEMON;

class FIRE extends LIFEPOKEMON{
  

    protected int attackFoes() {
        return 0;
    }

    @Override
    protected void addStatusPokemon(String Name,String cLass, int HP, int SP, int DMG,int s1DMG,int s2DMG) {
      this.Name = Name;
      this.HP = HP;
      this.SP = SP;
      this.DMG = DMG;
      this.s1DMG = s1DMG;
      this.s2DMG = s2DMG;
      this.cLass = cLass;
    }
    @Override
    protected void addName(String Name) {
       this.Name = Name;
    }
    @Override
    protected void setMaxStatus(int MaxHP, int MaxSP) {
        this.MaxHP = MaxHP + 200;
        this.MaxSP = MaxSP + 200;
    }

    @Override
    protected void addFoesStatus(String fname, String fcLass, int fHP, int fDMG, int fs1dmg, int fs2dmg) {
        // TODO Auto-generated method stub

    }


    @Override
    public void updatefHP(int fHP) {
        // TODO Auto-generated method stub
        this.fHP = fHP;

    }

    
  
}