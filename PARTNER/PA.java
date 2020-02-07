package PARTNER ;
import PROFILEPLAYER.Detail;
    public class PA{
        public  int PA_hp = 500;
        public  int PA_mana = 320;
        public  int PA_skill_mana = 50 ;
        public  int PA_skill = 25;
        public  int PA_dmg = 99;
        public  int PAlv = 0;

        public static void infoPA() {
            PA infopartner = new PA();
            Detail PartNer = new Detail(); 
            System.out.println("\nYour Partner is Mortred The Phantom Assassin");
            System.out.println("Phantom Assassin Hp   : " + infopartner.PA_hp);
            System.out.println("Phantom Assassin MANA : " + infopartner.PA_mana);
            System.out.println("Phantom Assassin DAMAGE : "+ infopartner.PA_dmg);
            System.out.println("Phantom Assassin SKILL : " + infopartner.PA_skill);
            System.out.println("Phantom Assassin SKILL MANACOST : "+ infopartner.PA_skill_mana);
            System.out.println("Phantom Assassin LEVEL : " + PartNer.level);
            System.out.println("Phantom Assassin XP :"+ PartNer.xp);
        }
        public static void storyPA() {
            System.out.println("\n Mortred : ' I'm here to blur the line between life and death '\n");
        }
    }