package PARTNER;
import PROFILEPLAYER.Detail;
    public class Maiden{
        public int Maiden_hp = 425;
        public int Maiden_mana = 625;
        public int Maiden_skill_mana = 50 ;
        public int Maiden_skill = 105;
        public int Maiden_dmg = 55;
        public int Maidenlv = 0;

        public static void infoMaiden() {
            Maiden infopartner = new Maiden();
            Detail PartNer = new Detail();
            System.out.println("\nYour Partner is Rylai The Crystal Maiden");
            System.out.println("Crystal Maiden Hp   : " + infopartner.Maiden_hp);
            System.out.println("Crystal Maiden  MANA : " + infopartner.Maiden_mana);
            System.out.println("Crystal Maiden DAMAGE : "+ infopartner.Maiden_dmg);
            System.out.println("Crystal Maiden SKILL : " + infopartner.Maiden_skill);
            System.out.println("Crystal Maiden SKILL MANACOST : "+ infopartner.Maiden_skill_mana);
            System.out.println("Crystal Maiden LEVEL : " + PartNer.level );
            System.out.println("Crystal Maiden XP :"+ PartNer.xp);
        }
        public static void storyMaiden() {
            System.out.println("\n Rylai : ' When Hell freezes over, I'll start calling it Heaven '\n");
        }
    }