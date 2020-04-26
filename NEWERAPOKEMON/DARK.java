package NEWERAPOKEMON;

public class DARK extends LIFEPOKEMON {

    @Override
    protected int attackFoes(int DMG) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected void addStatusPokemon(String Name, String cLass, int HP, int SP, int DMG, int s1dmg, int s2dmg) {
        this.Name = Name;
        this.HP = HP;
        this.SP = SP;
        this.DMG = DMG;
        this.s1DMG = s1DMG;
        this.s2DMG = s2DMG;
        this.cLass = cLass;

    }

    @Override
    protected void setMaxStatus(int MaxHP, int MaxSP) {
        // TODO Auto-generated method stub

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
        // TODO Auto-generated method stub
        this.fHP = fHP;

    }
}