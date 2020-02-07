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
          Information.choosepartner();
          System.out.println("Your Name : "+ Nameper);
          System.out.print("Your Partner : ");
          partner = NamePerson.nextInt();
         
            MainChoosePartner.maindetailpart(partner);
            PartNer.CurrentHP = MainChoosePartner.choosemainhp(partner);
            PartNer.CurrentMANA = MainChoosePartner.choosemainmana(partner);
            PartNer.CurrentDMG = MainChoosePartner.choosemaindmg(partner);
            PartNer.CurrentSkill = MainChoosePartner.choosemainskill(partner);
            PartNer.CurrentManacost = MainChoosePartner.choosemainmanacost(partner);
            PartNer.CurrentLV = MainChoosePartner.mainlv(partner);
           
  Scanner eventPerson = new Scanner(System.in);
  int event ;
  int eventfarm ;
  // main activity
         do {
          Information.mainAct();
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
            float curCreepdmg = creep.Creep_dmg;
            // start farm 
          if (event == 1){
    //main status       
                 int eventfarm_out = 0 ; 
            
              while(curParthp - creep.Creep_dmg > 0 && curCreephp > 0 && eventfarm_out != 5){
                
                System.out.println("\nBATTLE Creep\n");      
            //current activity
            // current status
              Information.statucurhp(curCreephp,curParthp);
              Information.statuscurmana(curPartmana);
              Information.statuscurdmg(curPartDMG);
              Information.statuscurskillmanacost(curPartSkill, curPartManacost);
              Information.statuslv(PartNer.CurrentLV);
            
            // current act
            Information.currentact();
              eventfarm = eventPerson.nextInt();
              eventfarm_out = eventfarm ;
    // normal hit
                 if(eventfarm == 1){
                  System.out.println(" Normal Hit ");
                  curCreephp = curCreephp - curPartDMG;
                  curParthp = CalculatStatus.curhp(curParthp,curCreepdmg); 
                }
    //use skill
                else if(eventfarm == 2){
                 float checkmana = curPartmana -  curPartManacost ; // checkmana for use skill
                  if( checkmana > 0){
                  System.out.println(" Use Skill ");
                  curCreephp = curCreephp - curPartSkill;
                  curParthp = CalculatStatus.curhp(curParthp,curCreepdmg);
                  curPartmana = curPartmana -  curPartManacost;
                }
                 else{
                  System.out.println("Not enough mana to Use Skill ");
                  curParthp = CalculatStatus.curhp(curParthp,curCreepdmg);
                }
                }
                else if(eventfarm == 3){
                  if(curPartmana + 100 < PartNer.CurrentMANA){
                  System.out.println("Regen your mana for Use Skill ");
                  curParthp = CalculatStatus.curhp(curParthp,curCreepdmg);
                  curPartmana = curPartmana + 100 ;
                  }
                  else if(curPartmana + 100 > PartNer.CurrentMANA);{
                    System.out.println("Your mana is Full !!");
                    curPartmana = PartNer.CurrentMANA;
                    curParthp = CalculatStatus.curhp(curParthp,curCreepdmg);
                  }
                }
                else if(eventfarm == 4){
                  System.out.println("Regen your HP for Alive ");
                  curParthp = curParthp + 150;
                  curParthp = CalculatStatus.curhp(curParthp,curCreepdmg);
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
            Information.statucurhpRS(curRosharn,curParthp);
            Information.statuscurmanaRS(curPartmana);
            Information.statuscurdmgRS(curPartDMG);
            Information.statuscurskillmanacostRS(curPartSkill, curPartManacost);
            Information.statuslvRS(PartNer.CurrentLV);
          
            // current act
            Information.currentact();
             
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
          // start mode 3
          else if (event == 3){

          }          
        } while (event != 5);
  }
  
}


