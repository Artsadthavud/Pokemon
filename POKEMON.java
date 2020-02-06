import java.util.*;
import FOES.*;
import PARTNER.*;
import PROFILEPLAYER.*;

public class POKEMON {
  public static void main(String[] args) {

// Choose name
    Scanner NamePerson = new Scanner(System.in);
    String Nameper;
    System.out.print("Enter your name: ");
    Nameper = NamePerson.next();

// Choose partner
    Detail PartNer = new Detail();  // for info
    int partner; 
          // choose partner
          choosepartner();
          System.out.println("Your Name : "+ Nameper);
          System.out.print("Your Partner : ");
          partner = NamePerson.nextInt();
        
              if (partner == 1){
                infoInjoker();
                InJoker infopartner = new InJoker();
                PartNer.CurrentHP = infopartner.Injoker_hp;
                PartNer.CurrentMANA = infopartner.Injoker_mana;
                PartNer.CurrentDMG = infopartner.Injoker_dmg;
                PartNer.CurrentSkill = infopartner.Injoker_skill;
                PartNer.CurrentManacost = infopartner.Injoker_skill_mana;
                PartNer.CurrentLV = infopartner.Injokelv;
              }
              else if (partner == 2){
                infoPA();
                PA infopartner = new PA();
                PartNer.CurrentHP = infopartner.PA_hp;
                PartNer.CurrentMANA = infopartner.PA_mana;
                PartNer.CurrentDMG = infopartner.PA_dmg;
                PartNer.CurrentSkill = infopartner.PA_skill;
                PartNer.CurrentManacost = infopartner.PA_skill_mana;
                PartNer.CurrentLV = infopartner.PAlv;
              }
              else if (partner == 3){
                infoJuggernaut();
                Juggernaut infopartner = new Juggernaut();
                PartNer.CurrentHP = infopartner.Juggernaut_hp;
                PartNer.CurrentMANA = infopartner.Juggernaut_mana;
                PartNer.CurrentDMG = infopartner.Juggernaut_dmg;
                PartNer.CurrentSkill = infopartner.Juggernaut_skill;
                PartNer.CurrentManacost = infopartner.Juggernaut_skill_mana;
                PartNer.CurrentLV = infopartner.Juggernautlv;
              }
              else if (partner == 4){
                infoTA();
                TA infopartner = new TA();
                PartNer.CurrentHP = infopartner.TA_hp;
                PartNer.CurrentMANA = infopartner.TA_mana;
                PartNer.CurrentDMG = infopartner.TA_dmg;
                PartNer.CurrentSkill = infopartner.TA_skill;
                PartNer.CurrentManacost = infopartner.TA_skill_mana;
                PartNer.CurrentLV = infopartner.TAlv;

              }
              else if (partner == 5){
                infoMaiden();
                Maiden infopartner = new Maiden();
                PartNer.CurrentHP = infopartner.Maiden_hp;
                PartNer.CurrentMANA = infopartner.Maiden_mana;
                PartNer.CurrentDMG = infopartner.Maiden_dmg;
                PartNer.CurrentSkill = infopartner.Maiden_skill;
                PartNer.CurrentManacost = infopartner.Maiden_skill_mana;
                PartNer.CurrentLV = infopartner.Maidenlv;
              }

Scanner eventPerson = new Scanner(System.in);

  int event ;
  int eventfarm ;
  // main activity
         do {
          mainAct();
          event = eventPerson.nextInt();
            Creep creep = new Creep();
            Roshan infofoes = new Roshan();
          // LV system
          // calculate system
            float curParthp = CalculatStatus.calculatStatushp(PartNer.CurrentHP, PartNer.CurrentLV);
            float curPartmana = CalculatStatus.calculatStatusmana(PartNer.CurrentMANA, PartNer.CurrentLV);
            float curPartDMG = CalculatStatus.calculatStatusdmg(PartNer.CurrentDMG,PartNer.CurrentLV);
            float curPartSkill = CalculatStatus.calculatStatusskill(PartNer.CurrentSkill,PartNer.CurrentLV);
            float curPartManacost =CalculatStatus.calculatStatusmanacost(PartNer.CurrentManacost,PartNer.CurrentLV);
            float curCreephp = creep.Creep_hp;
            float curRosharn = infofoes.Roshan_hp;
            // start farm 
          if (event == 1){
    //main status       
                 int eventfarm_out = 0 ; 
            
              while(curParthp - creep.Creep_dmg > 0 && curCreephp > 0 && eventfarm_out != 5){
                
                System.out.println("\nBATTLE Creep\n");      
            //current activity
            // current status
              System.out.println("\n CURRENT STATUS \n");
              System.out.print("Creep HP : ");
              System.out.println(curCreephp); 
              System.out.print("\nPartner HP : ");
              System.out.println(curParthp);
              System.out.print("Partner MANA : ");
              System.out.println(curPartmana);
              System.out.print("Partner DAMAGE : ");
              System.out.println(curPartDMG);
              System.out.print("Partner SKILL : ");
              System.out.println(curPartSkill);
              System.out.print("Partner SKILL MANACOST : ");
              System.out.println(curPartManacost);
              System.out.print("Partner LEVEL : ");
              System.out.println(PartNer.CurrentLV);

            // current act
                currentact();
             
              eventfarm = eventPerson.nextInt();

              eventfarm_out = eventfarm ;
    // normal hit
                 if(eventfarm == 1){
                  System.out.println(" Normal Hit ");
                  curCreephp = curCreephp - curPartDMG;
                  curParthp = curParthp - creep.Creep_dmg; 
                }
    //use skill
                else if(eventfarm == 2){
                 float checkmana = curPartmana -  curPartManacost ; // checkmana for use skill
                  if( checkmana > 0){
                  System.out.println(" Use Skill ");
                  curCreephp = curCreephp - curPartSkill;
                  curParthp = curParthp - creep.Creep_dmg;
                  curPartmana = curPartmana -  curPartManacost;
                }
                 else{
                  System.out.println("Not enough mana to Use Skill ");
                  curParthp = curParthp - creep.Creep_dmg;
                }
                }
                else if(eventfarm == 3){
                  if(curPartmana + 100 < PartNer.CurrentMANA){
                  System.out.println("Regen your mana for Use Skill ");
                  curParthp = curParthp - creep.Creep_dmg;
                  curPartmana = curPartmana + 100 ;
                  }
                  else if(curPartmana + 100 > PartNer.CurrentMANA);{
                    System.out.println("Your mana is Full !!");
                    curPartmana = PartNer.CurrentMANA;
                    curParthp = curParthp - creep.Creep_dmg;
                  }
                }
                else if(eventfarm == 4){
                  System.out.println("Regen your HP for Alive ");
                  curParthp = curParthp + 150;
                  curParthp = curParthp - creep.Creep_dmg;
                  curPartmana = curPartmana - 100 ;
                } 
              }
        // result of battle
              if(curParthp - creep.Creep_dmg > 0 && curCreephp < 0){
                      System.out.println("\n Creep is Death ");
                      System.out.println("You Get XP : 50 ");
                      PartNer.CurrentXP = PartNer.CurrentXP + creep.creepxp;
                      System.out.println("Current Partner XP : " + PartNer.CurrentXP);
                      if(PartNer.CurrentXP % 100 == 0){
                      System.out.println("\n LEVEL UP !!! \n");
                      System.out.println(" YOU ARE LEVEL "+ (PartNer.CurrentLV = PartNer.CurrentLV+1));
                      }
              }
              else if (curParthp - creep.Creep_dmg <= 0){
                      System.out.println("\n Your Partner is Death ");
              }
              else{
                System.out.println("\n OUT Form Battle Creep \n");
              }
            } // end of farm

            
            // start roshan
            else if (event == 2){
              int eventfarm_out = 0;
              
              while(curParthp - infofoes.Roshan_dmg > 0 && curRosharn > 0 && eventfarm_out != 5){
                System.out.println("\n Attack The Roshan (Recommend LV 35+)\n");
                 
            //current activity
            // current status
              System.out.println("\n CURRENT STATUS \n");
              System.out.print("Roshan HP : ");
              System.out.println(curRosharn); 
              System.out.print("\nPartner HP : ");
              System.out.println(curParthp);
              System.out.print("Partner MANA : ");
              System.out.println(curPartmana);
              System.out.print("Partner DAMAGE : ");
              System.out.println(curPartDMG);
              System.out.print("Partner SKILL : ");
              System.out.println(curPartSkill);
              System.out.print("Partner SKILL MANACOST : ");
              System.out.println(curPartManacost);
              System.out.print("Partner LEVEL : ");
              System.out.println(PartNer.CurrentLV);

            // current act
              System.out.println("\nWhat do you want to do ?");
              System.out.println(" 1 : Normal Hit ");
              System.out.println(" 2 : Use Skill ");
              System.out.println(" 3 : Regen MANA ");
              System.out.println(" 4 : Regen HP ");
              System.out.println(" 5 : Quit the battle ");
             
              eventfarm = eventPerson.nextInt();

              eventfarm_out = eventfarm ;
    // normal hit
                 if(eventfarm == 1){
                  System.out.println(" Normal Hit ");
                  curRosharn = curRosharn - curPartDMG;
                  curParthp = curParthp - infofoes.Roshan_dmg; 
                }
    //use skill
                else if(eventfarm == 2){
                 float checkmana = curPartmana -  curPartManacost ; // checkmana for use skill
                  if( checkmana > 0){
                  System.out.println(" Use Skill ");
                  curRosharn = curRosharn - curPartSkill;
                  curParthp = curParthp - infofoes.Roshan_dmg;
                  curPartmana = curPartmana -  curPartManacost;
                }
                 else{
                  System.out.println("Not enough mana to Use Skill ");
                  curParthp = curParthp - infofoes.Roshan_dmg;
                }
                }
                else if(eventfarm == 3){
                  if(curPartmana + 100 < PartNer.CurrentMANA){
                  System.out.println("Regen your mana for Use Skill ");
                  curParthp = curParthp - infofoes.Roshan_dmg;
                  curPartmana = curPartmana + 100 ;
                  }
                  else if(curPartmana + 100 > PartNer.CurrentMANA);{
                    System.out.println("Your mana is Full !!");
                    curPartmana = PartNer.CurrentMANA;
                    curParthp = curParthp - infofoes.Roshan_dmg;
                  }
                }
                else if(eventfarm == 4){
                  System.out.println("Regen your HP for Alive ");
                  curParthp = curParthp + 150;
                  curParthp = curParthp - infofoes.Roshan_dmg;
                  curPartmana = curPartmana - 100 ;
                } 
              }
        // result of battle
              if(curParthp - infofoes.Roshan_dmg > 0 && curRosharn < 0){
                      System.out.println("\n ROSHAN is Death ");
                      System.out.println("You Get XP : 500 ");
                      PartNer.CurrentXP = PartNer.CurrentXP + infofoes.Otherxp;
                      System.out.println("Current Partner XP : " + PartNer.CurrentXP);
                      if(PartNer.CurrentXP % 100 == 0){
                      System.out.println("\n LEVEL UP !!! \n");
                      System.out.println(" YOU ARE LEVEL "+ (PartNer.CurrentLV = PartNer.CurrentLV+1));
                      }
              }
              else if (curParthp - infofoes.Roshan_dmg <= 0){
                      System.out.println("\n Your Partner is Death ");
              }
              else{
                System.out.println("\n OUT Form ATTACK THE ROSHAN \n");
            } 
          }// end roshan



        } while (event != 5);
  }
  // current act
  private static void currentact() {
    System.out.println("\nWhat do you want to do ?");
    System.out.println(" 1 : Normal Hit ");
    System.out.println(" 2 : Use Skill ");
    System.out.println(" 3 : Regen MANA ");
    System.out.println(" 4 : Regen HP ");
    System.out.println(" 5 : Quit the battle ");
  }

  // choose partner
  private static void choosepartner() {
    System.out.println("\nChoose your Partner: ");
    System.out.println(" 1 : Carl The Injoker");
    System.out.println(" 2 : Mortred The Phantom Assassin");
    System.out.println(" 3 : Yanero The Juggernaut");
    System.out.println(" 4 : Lanaya The Templar Assassin");
    System.out.println(" 5 : Rylai The Crystal Maiden");
  }

  // main activities
  private static void mainAct() {
    System.out.println("\n 1 : BATTLE Creep");
    System.out.println(" 2 : Attack The Roshan (Recommend LV 35+)");
    System.out.println(" 3 : Rest at Fountain (Coming Soon)");
    System.out.println(" 4 : Figth with Other (Coming Soon)");
    System.out.println(" 5 : Quit the game");
    System.out.println("What do you want to do ?");
  }

  // INFO OF PARTNER
  private static void infoMaiden() {
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
  private static void infoTA() {
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
  private static void infoJuggernaut() {
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
  private static void infoInjoker() {
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
  private static void infoPA() {
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
  
  
}


