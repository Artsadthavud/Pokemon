
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
      Detail PartNer = new Detail(); 

         int partner;

         System.out.println("Choose your Partner: ");
          System.out.println(" 1 : Carl The Injoker");
          System.out.println(" 2 : Mortred The Phantom Assassin");
          System.out.println(" 3 : Yanero The Juggernaut");
          System.out.println(" 4 : Lanaya The Templar Assassin");
          System.out.println(" 5 : Rylai The Crystal Maiden");
          System.out.println("Your Name : "+ Nameper);
          System.out.print("Your Partner : ");
          partner = NamePerson.nextInt();
              
              if (partner == 1){
                System.out.println("Your Partner is Carl The Injoker");
                System.out.println("Injoker Hp   : " + PartNer.Injoker_hp);
                System.out.println("Injoker MANA : " + PartNer.Injoker_mana );
                System.out.println("Injoker LEVEL : " + PartNer.level);
                System.out.println("Injoker XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.Injoker_hp;
                PartNer.CurrentMANA = PartNer.Injoker_mana;
                PartNer.CurrentDMG = PartNer.Injoker_dmg;
                PartNer.CurrentSkill = PartNer.Injoker_skill;
                PartNer.CurrentManacost = PartNer.Injoker_skill_mana;


              }

              else if (partner == 2){
                System.out.println("Your Partner is Mortred The Phantom Assassin");
                System.out.println("Phantom Assassin Hp   : " + PartNer.PA_hp);
                System.out.println("Phantom Assassin MANA : " + PartNer.PA_mana);
                System.out.println("Phantom Assassin LEVEL : " + PartNer.level);
                System.out.println("Phantom Assassin XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.PA_hp;
                PartNer.CurrentMANA = PartNer.PA_mana;
                PartNer.CurrentDMG = PartNer.PA_dmg;
                PartNer.CurrentSkill = PartNer.PA_skill;
                PartNer.CurrentManacost = PartNer.PA_skill_mana;
              }

              else if (partner == 3){
                System.out.println("Your Partner is Yanero The Juggernaut");
                System.out.println("Juggernaut Hp   : " + PartNer.Juggernaut_hp);
                System.out.println("Juggernaut MANA : " + PartNer.Juggernaut_mana);
                System.out.println("Juggernaut LEVEL : " + PartNer.level );
                System.out.println("Juggernaut XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.Juggernaut_hp;
                PartNer.CurrentMANA = PartNer.Juggernaut_mana;
                PartNer.CurrentDMG = PartNer.Juggernaut_dmg;
                PartNer.CurrentSkill = PartNer.Juggernaut_skill;
                PartNer.CurrentManacost = PartNer.Juggernaut_skill_mana;

              }

              else if (partner == 4){
                System.out.println("Your Partner is Lanaya The Templar Assassin");
                System.out.println("Templar Assassin Hp   : " + PartNer.TA_hp);
                System.out.println("Templar Assassin MANA : " + PartNer.TA_mana);
                System.out.println("Templar Assassin LEVEL : " + PartNer.level);
                System.out.println("Templar Assassin XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.TA_hp;
                PartNer.CurrentMANA = PartNer.TA_mana;
                PartNer.CurrentDMG = PartNer.TA_dmg;
                PartNer.CurrentSkill = PartNer.TA_skill;
                PartNer.CurrentManacost = PartNer.TA_skill_mana;

              }

              else if (partner == 5){
                System.out.println("Your Partner is Rylai The Crystal Maiden");
                System.out.println(" Crystal Maiden Hp   : " + PartNer.Maiden_hp);
                System.out.println("Crystal Maiden  MANA : " + PartNer.Maiden_mana);
                System.out.println("Crystal Maiden LEVEL : " + PartNer.level );
                System.out.println("Crystal Maiden XP :"+ PartNer.xp);
                PartNer.CurrentHP = PartNer.Maiden_hp;
                PartNer.CurrentMANA = PartNer.Maiden_mana;
                PartNer.CurrentDMG = PartNer.Maiden_dmg;
                PartNer.CurrentSkill = PartNer.Maiden_skill;
                PartNer.CurrentManacost = PartNer.Maiden_skill_mana;

              }


// activity
Scanner eventPerson = new Scanner(System.in);
  int i = 0;
  int check_part = 0 ;
  int check_creep = 0;
  int event ;
  int eventfarm ;
         do {
        

          System.out.println(" 1 : Farm Creep");
          System.out.println(" 2 : Attack Roshan");
          System.out.println(" 3 : Rest at Fountain");
          System.out.println(" 4 : Figth with Other");
          System.out.println(" 5 : Quit the game");
          System.out.println("What do you want to do ?");
          event = eventPerson.nextInt();
//  System.out.println(rand.nextInt(20)+1); // checkrandom
            int curCreephp = PartNer.Creep_hp;
            int curParthp = PartNer.CurrentHP;
            int curPartmana = PartNer.CurrentMANA;
            int checkhpPart = curParthp - PartNer.Creep_dmg;

          if(event == 5){
            check_part = curParthp ;
            check_creep = curCreephp ;
            break;
          }
          else if (event == 1){
    //main status       
            System.out.println("\nFarm Creep\n");
            System.out.print("Creep HP : ");
            System.out.println(PartNer.Creep_hp); 
            System.out.print("Partner HP : ");
            System.out.println(PartNer.CurrentHP);
            System.out.print("Partner MANA : ");
            System.out.println(PartNer.CurrentMANA);

            
            
              while(checkhpPart > 0 && curCreephp > 0){
    
    //current activity
              System.out.println("\nWhat do you want to do ?");
              System.out.println(" 1 : Normal Hit ");
              System.out.println(" 2 : Use Skill ");
              System.out.println(" 3 : Regen MANA ");
              System.out.println(" 4 : Regen HP ");
              System.out.println(" 5 : Quit the battle ");
             
              eventfarm = eventPerson.nextInt();

              System.out.print("Creep HP : ");
              System.out.println(curCreephp); 
              System.out.print("Partner HP : ");
              System.out.println(curParthp);
              System.out.print("Partner MANA : ");
              System.out.println(curPartmana);
    // quit           
              if (eventfarm == 5){
                System.out.println("\n OUT Form Battle Creep \n");
                  break;
                }
    // normal hit
                else if(eventfarm == 1){
                  System.out.println(" Normal Hit ");
                  curCreephp = curCreephp - PartNer.CurrentDMG;
                  curParthp = curParthp - PartNer.Creep_dmg; 
        
                }
    //use skill
                else if(eventfarm == 2){
                 int checkmana = curPartmana - PartNer.CurrentManacost ; // checkmana for use skill

                  if( checkmana > 0){
                  System.out.println(" Use Skill ");
                  curCreephp = curCreephp - PartNer.CurrentSkill;
                  curParthp = curParthp - PartNer.Creep_dmg;
                  curPartmana = curPartmana - PartNer.CurrentManacost;
              
                }
                 else{
                  System.out.println("Not enough mana to Use Skill ");
                  curParthp = curParthp - PartNer.Creep_dmg;
                }
                }
                else if(eventfarm == 3){
                  System.out.println("Regen your mana for Use Skill ");
                  curParthp = curParthp - PartNer.Creep_dmg;
                  curPartmana = curPartmana + 100 ;
                }
                else if(eventfarm == 4){
                  System.out.println("Regen your HP for Alive ");
                  curParthp = curParthp + 100;
                  curPartmana = curPartmana - 100 ;
                } 
              }
              }
              if(check_creep < 0 ){
               System.out.println("\n Creep is Death ");
               System.out.println("You Get XP : 50 ");
              
               PartNer.CurrentXP = PartNer.CurrentXP + PartNer.creepxp;
               System.out.println("Current Partner XP : " + PartNer.CurrentXP);
                  if(PartNer.CurrentXP % 100 == 0){
                System.out.println("\n LEVEL UP !!! \n");
                System.out.println(" YOU ARE LEVEL "+ (PartNer.CurrentLV = PartNer.CurrentLV+1));
                  }
                  else if (check_part < 0){
                    System.out.println("\n It's Over Your Partner Death !!");
                  }
                  
            // show result & xp               
            }
         }
         while (i != 5);
  }
}


