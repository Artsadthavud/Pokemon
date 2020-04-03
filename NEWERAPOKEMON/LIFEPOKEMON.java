package NEWERAPOKEMON;

abstract class LIFEPOKEMON {
    protected int HP = 0;
    protected int SP = 0;
    protected int DMG = 0;
    protected String Name;
   
    protected abstract void namePokemon(String Name);
    protected abstract int attackFoes();
    protected abstract void hpPokemon(int HP);
    protected abstract void spPokemon(int SP);
    protected abstract void dmgPokemon(int DMG);
}
