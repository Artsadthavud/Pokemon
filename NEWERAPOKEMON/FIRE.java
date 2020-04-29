package NEWERAPOKEMON;

import java.util.Random;

class FIRE extends LIFEPOKEMON {
  

    protected int attackFoes() {
        Random rand = new Random ();
        int event = rand.nextInt(12);
        int DMGf = 0;

            if(event <= 6){
                DMGf = getfDMG();
                this.nameSkill = "NORMAL ATTACK" ;
            }
            else if(event > 6){
                DMGf = getfs1DMG();
                this.nameSkill = "SKILL 1";
            }
            else if(event > 10){
                DMGf = getfs2DMG();
                this.nameSkill = "SKILL 2";
            }

        return DMGf;
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
        this.fHP = fHP;
        this.fDMG = fDMG;
        this.fname = fname;
        this.fs1DMG = fs1dmg;
        this.fs2DMG = fs2dmg;

    }


    @Override
    public void updatefHP(int fHP) {
        this.fHP = fHP;

    }

    
  
}