package NEWERAPOKEMON;
import java.util.Random;

public class DARK extends LIFEPOKEMON {

    @Override
    protected int attackFoes() {
        Random rand = new Random ();
        int event = rand.nextInt(12);
        int eventCri = rand.nextInt(5);
        int DMGf = 0;
        int cri = 0 ;

        if(eventCri < 2){
            cri = 50 ;
        }


            if(event <= 6){
                if(eventCri < 2){
                    DMGf = getfDMG() + cri ;
                    this.nameSkill = " by NORMAL ATTACK + Critical" ;
                }
                else{
                DMGf = getfDMG();
                this.nameSkill = " by NORMAL ATTACK" ;
                }
            }
            else if(event > 6){
                if(eventCri < 2 ){
                    DMGf = getfs1DMG() + cri ;
                    this.nameSkill = " by SKILL 1 + Critical" ;
                }
                else{
                    DMGf = getfs1DMG();
                    this.nameSkill = " by SKILL 1";
                }
                
            }
            else if(event > 10){
                if(eventCri < 2){
                    DMGf = getfs2DMG() + cri ;
                    this.nameSkill = " by SKILL 2 + Critical" ;
                }
                else{
                DMGf = getfs2DMG();
                this.nameSkill = " by SKILL 2";
            }
        }

        return DMGf;
    }
    

    @Override
    protected void addStatusPokemon(String Name, String cLass, int HP, int SP, int DMG, int s1dmg, int s2dmg) {
        this.Name = Name;
        this.HP = HP;
        this.SP = SP;
        this.DMG = DMG;
        this.s1DMG = s1dmg;
        this.s2DMG = s2dmg;
        this.cLass = cLass;

    }

    @Override
    protected void setMaxStatus(int MaxHP, int MaxSP) {
        this.MaxHP = MaxHP;
        this.MaxSP = MaxSP;

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