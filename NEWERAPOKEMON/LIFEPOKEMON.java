package NEWERAPOKEMON;

public abstract class LIFEPOKEMON {
    protected int HP = 0;
    protected int SP = 0;
    protected int DMG = 0;
    protected String Name;
    protected String cLass;
    protected int MaxHP = 0;
    protected int MaxSP = 0;
   
   
 
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

    // action pokrmon
    //heal HP
    public static void eat(LIFEPOKEMON lifepokemon, int Feed){
        if(lifepokemon.HP == lifepokemon.MaxHP){
            System.out.println("I be full now Stopppp feed me my partner !!");
        }
        else if(lifepokemon.HP + Feed > lifepokemon.MaxHP){
            lifepokemon.HP = lifepokemon.MaxHP;
            System.out.println("I be full now thank my partner !!");
        }
        else if(lifepokemon.HP + Feed < lifepokemon.MaxHP){
            lifepokemon.HP = lifepokemon.HP + Feed;
            System.out.println("I need more can you give me my partner !!");
        }
    }
    //heal SP
    public static void commuPartner(LIFEPOKEMON lifepokemon, int Commu){
        if(lifepokemon.SP == lifepokemon.MaxSP){
            // pass to new action
            System.out.println("TEST COMMU");
        }
        else if(lifepokemon.SP + Commu > lifepokemon.MaxSP){
            lifepokemon.SP = lifepokemon.MaxSP;
            System.out.println("I feeling fresh now thank my partner!!");
        }
        else if(lifepokemon.SP + Commu < lifepokemon.MaxSP){
            lifepokemon.SP = lifepokemon.SP + Commu;
        }
    }
    // reduce sp
    public static void discommmuSP(LIFEPOKEMON lifepokemon, int rSP){
        lifepokemon.SP = lifepokemon.SP - rSP ;
    }

    protected abstract int attackFoes(int DMG);
    // add status of pokemon
	protected abstract void addStatusPokemon(String Name,String cLass, int HP, int SP, int DMG);
    protected abstract void addName(String Name);
    protected abstract void setMaxStatus(int MaxHP, int MaxSP);

}
