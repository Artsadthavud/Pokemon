package PARTNER ;
import PROFILEPLAYER.Detail;
    public class Juggernaut {
        public int Juggernaut_hp = 550;
        public int Juggernaut_mana = 350;
        public int Juggernaut_skill_mana = 85 ;
        public int Juggernaut_skill = 65;
        public int Juggernaut_dmg = 95;
        public int Juggernautlv = 0;

        public static void infoJuggernaut() {
            Juggernaut infopartner = new Juggernaut();
            Detail PartNer = new Detail();
            System.out.println("\nYour Partner is Yanero The Juggernaut");
            System.out.println("Juggernaut Hp   : " + infopartner.Juggernaut_hp);
            System.out.println("Juggernaut MANA : " + infopartner.Juggernaut_mana);
            System.out.println("Juggernaut DAMAGE : "+ infopartner.Juggernaut_dmg);
            System.out.println("Juggernaut SKILL : " + infopartner.Juggernaut_skill);
            System.out.println("Juggernaut SKILL MANACOST : "+ infopartner.Juggernaut_skill_mana);
            System.out.println("Juggernaut LEVEL : " + PartNer.level );
            System.out.println("Juggernaut XP :"+ PartNer.xp);
        }
    }