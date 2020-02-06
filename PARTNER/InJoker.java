package PARTNER ;
import PROFILEPLAYER.Detail;
public class InJoker{
        public int Injoker_hp = 500 ;
        public int Injoker_mana = 450 ;
        public int Injoker_skill_mana = 250 ;
        public int Injoker_skill = 100 ; 
        public int Injoker_dmg = 65 ;
        public int Injokelv = 0;

        public static void infoInjoker() {
            Detail PartNer = new Detail(); 
            InJoker infopartner = new InJoker();
            System.out.println("Injoker Hp   : " + infopartner.Injoker_hp);
            System.out.println("Injoker MANA : " + infopartner.Injoker_mana );
            System.out.println("Injoker DAMAGE : "+ infopartner.Injoker_dmg);
            System.out.println("Injoker SKILL : " + infopartner.Injoker_skill);
            System.out.println("Injoker SKILL MANACOST : "+ infopartner.Injoker_skill_mana);
            System.out.println("Injoker LEVEL : " + PartNer.level);
            System.out.println("Injoker XP :"+ PartNer.xp);
        }
    }
