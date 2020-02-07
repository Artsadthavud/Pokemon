package PARTNER;
import PROFILEPLAYER.Detail;
    public class TA{
        public  int TA_hp = 450;
        public  int TA_mana = 300;
        public  int TA_skill_mana = 50 ;
        public  int TA_skill = 20;
        public  int TA_dmg = 98;
        public  int TAlv = 0;

        public static void infoTA() {
            TA infopartner = new TA();
            Detail PartNer = new Detail();
            System.out.println("\nYour Partner is Lanaya The Templar Assassin");
            System.out.println("Templar Assassin Hp   : " + infopartner.TA_hp);
            System.out.println("Templar Assassin MANA : " + infopartner.TA_mana);
            System.out.println("Templar Assassin DAMAGE : "+ infopartner.TA_dmg);
            System.out.println("Templar Assassin SKILL : " + infopartner.TA_skill);
            System.out.println("Templar Assassin SKILL MANACOST : "+ infopartner.TA_skill_mana);
            System.out.println("Templar Assassin LEVEL : " + PartNer.level);
            System.out.println("Templar Assassin XP :"+ PartNer.xp);
            
        }
        public static void storyTA() {
            System.out.println("\n Lanaya : 'Where the Hidden Ones send me, I go without question. I do not even question why I question not '\n");
        }
    }