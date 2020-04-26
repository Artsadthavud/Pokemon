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
    protected int fHP = 0;
    protected int fDMG = 0;
    protected int fs1DMG = 0;
    protected int fs2DMG = 0;
    protected String fname ;

    public static void setName(String Name) {
        LIFEPOKEMON.Name = Name;
    }


    public static String getName() {
        return Name;
    }

    public static int getHP() {
        return HP;
    }

    public String getfName() {
        return fname;
    }

    public int getfHP() {
        return fHP;
    }
    
    public int getfDMG() {
        return fDMG;
    }

    public int getfs1DMG() {
        return fs1DMG;
    }

    public int getfs2DMG() {
        return fs2DMG;
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

    public static void updateHP(int HP){
        LIFEPOKEMON.HP = HP;
    }
    public abstract void updatefHP(int fHP);

    // action pokrmon
    //heal HP
    public static void healHP( int Feed){
        if(LIFEPOKEMON.HP == LIFEPOKEMON.MaxHP) {
            LIFEPOKEMON.HP = LIFEPOKEMON.MaxHP;
         
        }
        else if(LIFEPOKEMON.HP + Feed >= LIFEPOKEMON.MaxHP) {
            LIFEPOKEMON.HP = LIFEPOKEMON.MaxHP;
           
        }
        else if(LIFEPOKEMON.HP + Feed < LIFEPOKEMON.MaxHP) {
            LIFEPOKEMON.HP = LIFEPOKEMON.HP + Feed;
           
        }
    }
    //heal SP
    public static void healSP(int Commu){
        if(LIFEPOKEMON.SP == LIFEPOKEMON.MaxSP) {
            // pass to new action
            LIFEPOKEMON.SP = LIFEPOKEMON.MaxSP;
        }
        else if(LIFEPOKEMON.SP + Commu >= LIFEPOKEMON.MaxSP) {
            LIFEPOKEMON.SP = LIFEPOKEMON.MaxSP;
          
        }
        else if(LIFEPOKEMON.SP + Commu < LIFEPOKEMON.MaxSP) {
            LIFEPOKEMON.SP = LIFEPOKEMON.SP + Commu;
        }
    }
    // reduce sp
    public static void useSP(int rSP){
        if( SP - rSP > 0 || SP - rSP ==0){
            SP = SP - rSP ;
        }
        else if(SP - rSP < 0){
        }
        
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
    protected abstract void addFoesStatus(String fname, String fcLass, int fHP, int fDMG,int fs1DMG,int fs2DMG);
    protected abstract int attackFoes(int DMG);
    // add status of pokemon
	protected abstract void addStatusPokemon(String Name,String cLass, int HP, int SP, int DMG, int s1DMG, int s2DMG);
    protected static void addName(String Name) {
		LIFEPOKEMON.Name = Name;
		
	}
    protected abstract void setMaxStatus(int MaxHP, int MaxSP);

}
