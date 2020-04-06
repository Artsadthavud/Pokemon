package NEWERAPOKEMON;

public abstract class LIFEPOKEMON {
    protected int HP = 0;
    protected int SP = 0;
    protected int DMG = 0;
    protected String Name;
    protected String cLass;
    protected int MaxHP = 0;
    protected int MaxSP = 0;
   
    protected abstract int attackFoes(int DMG);
 
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
    public String getcLass() {
        return cLass;
    }
    
    // add status of pokemon
	protected abstract void addStatusPokemon(String Name,String cLass, int HP, int SP, int DMG);
    protected abstract void addName(String Name);
    protected abstract void setMaxStatus(int MaxHP, int MaxSP);

}
