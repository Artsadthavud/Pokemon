package NEWERAPOKEMON;

public abstract class LIFEPOKEMON {
    protected int HP = 0;
    protected int SP = 0;
    protected int DMG = 0;
    protected int s1DMG = 0;
    protected int s2DMG = 0;
    protected String Name;
    protected String cLass;
    protected int MaxHP = 0;
    protected int MaxSP = 0;
    protected int fHP = 0;
    protected int fDMG = 0;
    protected int fs1DMG = 0;
    protected int fs2DMG = 0;
    protected String fname ;
    protected String nameSkill; 

    public void setName(String Name) {
        this.Name = Name;
    }


    public String getName() {
        return Name;
    }

    public int getHP() {
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


    public int getSP() {
        return SP;
    }

    public int getMaxHP() {
        return MaxHP;
    }

    public int getMaxSP() {
        return MaxSP;
    }
    public int getDMG(){
        return DMG;
    }
    public int gets1DMG(){
        return s1DMG;
    }
    public int gets2DMG(){
        return s2DMG;
    }
    public String getcLass() {
        return cLass;
    }

    public void updateHP(int HP){
        this.HP = HP;
    }
    public abstract void updatefHP(int fHP);

    // action pokrmon
    //heal HP
    public void healHP( int Feed){
        if(HP == MaxHP) {
            this.HP = MaxHP;
         
        }
        else if(HP + Feed >= MaxHP) {
            this.HP = MaxHP;
           
        }
        else if(HP + Feed < MaxHP) {
            HP = HP + Feed;
           
        }
    }
    //heal SP
    public void healSP(int Commu){
        if(SP == MaxSP) {
            // pass to new action
            SP = MaxSP;
        }
        else if(SP + Commu >= MaxSP) {
            SP = MaxSP;
          
        }
        else if(SP + Commu < MaxSP) {
            SP = SP + Commu;
        }
    }
    // reduce sp
    public void useSP(int rSP){
        if( SP - rSP > 0 || SP - rSP ==0){
            SP = SP - rSP ;
        }
        else if(SP - rSP < 0){
        }
        
    }


    protected abstract void addFoesStatus(String fname, String fcLass, int fHP, int fDMG,int fs1DMG,int fs2DMG);
    protected abstract int attackFoes();
    // add status of pokemon
	protected abstract void addStatusPokemon(String Name,String cLass, int HP, int SP, int DMG, int s1DMG, int s2DMG);
    protected void addName(String Name) {
		this.Name = Name;
		
	}
    protected abstract void setMaxStatus(int MaxHP, int MaxSP);

}
