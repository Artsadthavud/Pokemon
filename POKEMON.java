
import java.util.*;

public class POKEMON {
  public static void main(String[] args) {

//random event
    Random rand = new Random ();
// Choose name

    Scanner NamePerson = new Scanner(System.in);
    String Nameper;
    System.out.print("Enter your name: ");
      Nameper = NamePerson.next();

// Choose partner
      Detail PartNer = new Detail();  // for info
      IMPACT lvImpact = new IMPACT(); // for lv
      FOES infofoes = new FOES();
      int partner;

         System.out.println("\nChoose your Partner: ");
          System.out.println(" 1 : Carl The Injoker");
          System.out.println(" 2 : Mortred The Phantom Assassin");
          System.out.println(" 3 : Yanero The Juggernaut");
          System.out.println(" 4 : Lanaya The Templar Assassin");
          System.out.println(" 5 : Rylai The Crystal Maiden");
          System.out.println("Your Name : "+ Nameper);
          System.out.print("Your Partner : ");
          partner = NamePerson.nextInt();
        
              if (partner == 1){
                System.out.println("\nYour Partner is Carl The Injoker");
                System.out.println("Injoker Hp   : " + PartNer.Injoker_hp);
                System.out.println("Injoker MANA : " + PartNer.Injoker_mana );
                System.out.println("Injoker DAMAGE : "+ PartNer.Injoker_dmg);
                System.out.println("Injoker SKILL : " + PartNer.Injoker_skill);
                System.out.println("Injoker SKILL MANACOST : "+ PartNer.Injoker_skill_mana);
                System.out.println("Injoker LEVEL : " + PartNer.level);
                System.out.println("Injoker XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.Injoker_hp;
                PartNer.CurrentMANA = PartNer.Injoker_mana;
                PartNer.CurrentDMG = PartNer.Injoker_dmg;
                PartNer.CurrentSkill = PartNer.Injoker_skill;
                PartNer.CurrentManacost = PartNer.Injoker_skill_mana;
                PartNer.CurrentLV = lvImpact.Injokelv;

              }

              else if (partner == 2){
                System.out.println("Your Partner is Mortred The Phantom Assassin");
                System.out.println("Phantom Assassin Hp   : " + PartNer.PA_hp);
                System.out.println("Phantom Assassin MANA : " + PartNer.PA_mana);
                System.out.println("Phantom Assassin DAMAGE : "+ PartNer.PA_dmg);
                System.out.println("Phantom Assassin SKILL : " + PartNer.PA_skill);
                System.out.println("Phantom Assassin SKILL MANACOST : "+ PartNer.PA_skill_mana);
                System.out.println("Phantom Assassin LEVEL : " + PartNer.level);
                System.out.println("Phantom Assassin XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.PA_hp;
                PartNer.CurrentMANA = PartNer.PA_mana;
                PartNer.CurrentDMG = PartNer.PA_dmg;
                PartNer.CurrentSkill = PartNer.PA_skill;
                PartNer.CurrentManacost = PartNer.PA_skill_mana;
                PartNer.CurrentLV = lvImpact.PAlv;

              }

              else if (partner == 3){
                System.out.println("Your Partner is Yanero The Juggernaut");
                System.out.println("Juggernaut Hp   : " + PartNer.Juggernaut_hp);
                System.out.println("Juggernaut MANA : " + PartNer.Juggernaut_mana);
                System.out.println("Juggernaut DAMAGE : "+ PartNer.Juggernaut_dmg);
                System.out.println("Juggernaut SKILL : " + PartNer.Juggernaut_skill);
                System.out.println("Juggernaut SKILL MANACOST : "+ PartNer.Juggernaut_skill_mana);
                System.out.println("Juggernaut LEVEL : " + PartNer.level );
                System.out.println("Juggernaut XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.Juggernaut_hp;
                PartNer.CurrentMANA = PartNer.Juggernaut_mana;
                PartNer.CurrentDMG = PartNer.Juggernaut_dmg;
                PartNer.CurrentSkill = PartNer.Juggernaut_skill;
                PartNer.CurrentManacost = PartNer.Juggernaut_skill_mana;
                PartNer.CurrentLV = lvImpact.Juggernautlv;

              }

              else if (partner == 4){
                System.out.println("Your Partner is Lanaya The Templar Assassin");
                System.out.println("Templar Assassin Hp   : " + PartNer.TA_hp);
                System.out.println("Templar Assassin MANA : " + PartNer.TA_mana);
                System.out.println("Templar Assassin DAMAGE : "+ PartNer.TA_dmg);
                System.out.println("Templar Assassin SKILL : " + PartNer.TA_skill);
                System.out.println("Templar Assassin SKILL MANACOST : "+ PartNer.TA_skill_mana);
                System.out.println("Templar Assassin LEVEL : " + PartNer.level);
                System.out.println("Templar Assassin XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.TA_hp;
                PartNer.CurrentMANA = PartNer.TA_mana;
                PartNer.CurrentDMG = PartNer.TA_dmg;
                PartNer.CurrentSkill = PartNer.TA_skill;
                PartNer.CurrentManacost = PartNer.TA_skill_mana;
                PartNer.CurrentLV = lvImpact.TAlv;

              }

              else if (partner == 5){
                System.out.println("Your Partner is Rylai The Crystal Maiden");
                System.out.println("Crystal Maiden Hp   : " + PartNer.Maiden_hp);
                System.out.println("Crystal Maiden  MANA : " + PartNer.Maiden_mana);
                System.out.println("Crystal Maiden DAMAGE : "+ PartNer.Maiden_dmg);
                System.out.println("Crystal Maiden SKILL : " + PartNer.Maiden_skill);
                System.out.println("Crystal Maiden SKILL MANACOST : "+ PartNer.Maiden_skill_mana);
                System.out.println("Crystal Maiden LEVEL : " + PartNer.level );
                System.out.println("Crystal Maiden XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.Maiden_hp;
                PartNer.CurrentMANA = PartNer.Maiden_mana;
                PartNer.CurrentDMG = PartNer.Maiden_dmg;
                PartNer.CurrentSkill = PartNer.Maiden_skill;
                PartNer.CurrentManacost = PartNer.Maiden_skill_mana;
                PartNer.CurrentLV = lvImpact.Maidenlv;

              }

// activity
Scanner eventPerson = new Scanner(System.in);

  int event ;
  int eventfarm ;
  
         do {
          System.out.println("\n 1 : BATTLE Creep");
          System.out.println(" 2 : Attack The Roshan (Recommend LV 35+)");
          System.out.println(" 3 : Rest at Fountain (Coming Soon)");
          System.out.println(" 4 : Figth with Other (Coming Soon)");
          System.out.println(" 5 : Quit the game");
          System.out.println("What do you want to do ?");
          event = eventPerson.nextInt();
//  System.out.println(rand.nextInt(20)+1); // checkrandom
          // reset value
             // LV system
            float curParthp = (float)PartNer.CurrentHP + ((float)PartNer.CurrentLV * (float)PartNer.CurrentHP)/12;
            float curPartmana = (float)PartNer.CurrentMANA + ((float)PartNer.CurrentLV * (float)PartNer.CurrentHP)/12;     
            float curPartDMG = (float)PartNer.CurrentDMG + ((float)PartNer.CurrentLV * (float)PartNer.CurrentDMG)/12; 
            float curPartSkill = (float)PartNer.CurrentSkill + ((float)PartNer.CurrentLV * (float)PartNer.CurrentSkill)/12; 
            float curPartManacost = (float)PartNer.CurrentManacost + ((float)PartNer.CurrentLV * (float)PartNer.CurrentManacost)/12;
            float curCreephp = PartNer.Creep_hp;
            float curRosharn = infofoes.Roshan_hp;
            // start farm 
          if (event == 1){
    //main status       
                 int eventfarm_out = 0 ; 
            
              while(curParthp - PartNer.Creep_dmg > 0 && curCreephp > 0 && eventfarm_out != 5){
                
                System.out.println("\nFarm Creep\n");      
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
                  curCreephp = curCreephp - curPartDMG;
                  curParthp = curParthp - PartNer.Creep_dmg; 
                }
    //use skill
                else if(eventfarm == 2){
                 float checkmana = curPartmana -  curPartManacost ; // checkmana for use skill
                  if( checkmana > 0){
                  System.out.println(" Use Skill ");
                  curCreephp = curCreephp - curPartSkill;
                  curParthp = curParthp - PartNer.Creep_dmg;
                  curPartmana = curPartmana -  curPartManacost;
                }
                 else{
                  System.out.println("Not enough mana to Use Skill ");
                  curParthp = curParthp - PartNer.Creep_dmg;
                }
                }
                else if(eventfarm == 3){
                  if(curPartmana + 100 < PartNer.CurrentMANA){
                  System.out.println("Regen your mana for Use Skill ");
                  curParthp = curParthp - PartNer.Creep_dmg;
                  curPartmana = curPartmana + 100 ;
                  }
                  else if(curPartmana + 100 > PartNer.CurrentMANA);{
                    System.out.println("Your mana is Full !!");
                    curPartmana = PartNer.CurrentMANA;
                    curParthp = curParthp - PartNer.Creep_dmg;
                  }
                }
                else if(eventfarm == 4){
                  System.out.println("Regen your HP for Alive ");
                  curParthp = curParthp + 150;
                  curParthp = curParthp - PartNer.Creep_dmg;
                  curPartmana = curPartmana - 100 ;
                } 
              }
        // result of battle
              if(curParthp - PartNer.Creep_dmg > 0 && curCreephp < 0){
                      System.out.println("\n Creep is Death ");
                      System.out.println("You Get XP : 50 ");
                      PartNer.CurrentXP = PartNer.CurrentXP + PartNer.creepxp;
                      System.out.println("Current Partner XP : " + PartNer.CurrentXP);
                      if(PartNer.CurrentXP % 100 == 0){
                      System.out.println("\n LEVEL UP !!! \n");
                      System.out.println(" YOU ARE LEVEL "+ (PartNer.CurrentLV = PartNer.CurrentLV+1));
                      }
              }
              else if (curParthp - PartNer.Creep_dmg <= 0){
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
}


