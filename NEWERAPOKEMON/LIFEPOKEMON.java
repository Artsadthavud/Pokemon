package NEWERAPOKEMON;

public abstract class LIFEPOKEMON {
    protected static int HP = 0;
    protected static int SP = 0;
    protected static int DMG = 0;
    protected static int s1DMG = 0;
    protected static int s2DMG = 0;
    protected static String Name;
    protected String cLass;
    protected static int MaxHP = 0;
    protected static int MaxSP = 0;
    protected int XP = 0;
    protected int LEVEL = 0;
    protected int Trusting = 0;

    public static void setName(String Name) {
        LIFEPOKEMON.Name = Name;
    }
    public static String getName() {
        return Name;
    }

    public static int getHP() {
        return HP;
    }

    public static int getSP() {
        return SP;
    }

    public static int getMaxHP() {
        return MaxHP;
    }

    public static int getMaxSP() {
        return MaxSP;
    }
    public static int getDMG(){
        return DMG;
    }
    public static int gets1DMG(){
        return s1DMG;
    }
    public static int gets2DMG(){
        return s2DMG;
    }
    public String getcLass() {
        return cLass;
    }

    // action pokrmon
    //heal HP
    public static void eat(LIFEPOKEMON lifepokemon, int Feed){
        if(lifepokemon.HP == lifepokemon.MaxHP){
            System.out.println("I be full now Stopppp feed me !!");
         
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

    // increse Trusting
    public static void updateTrusting(LIFEPOKEMON lifepokemon , int Trusting){
        lifepokemon.Trusting = Trusting + lifepokemon.Trusting ;
    }

    // check level of Trusting
    public static int checkTrusting(LIFEPOKEMON lifepokemon){
        int level = 0;
        if(lifepokemon.Trusting < 0){
            level = -1 ; // not trusting in partner
        }
        else if(lifepokemon.Trusting > 0 && lifepokemon.Trusting < 50){
            level = 1 ; // a little bit trusting in partner
        }
        else if(lifepokemon.Trusting > 50 && lifepokemon.Trusting < 100){
            level = 2; // trusting in partner
        }
        else if(lifepokemon.Trusting > 100 && lifepokemon.Trusting < 200){
            level = 3 ; // more trusting in partner 
        }
        else if(lifepokemon.Trusting > 200){
            level = 4 ; // super trusting in partner
        }

        return level;
    }

    protected abstract int attackFoes(int DMG);
    // add status of pokemon
	protected abstract void addStatusPokemon(String Name,String cLass, int HP, int SP, int DMG, int s1DMG, int s2DMG);
    protected static void addName(String Name) {
		LIFEPOKEMON.Name = Name;
		
	}
    protected abstract void setMaxStatus(int MaxHP, int MaxSP);

}
