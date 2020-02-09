package GAMEPOKEMON2;

import java.util.*;


public class POKEMONWORLD extends GAMEPOKEMON2{

    private static String namePlayer;
    private static String namePartner;
    private static int checkcode = 99;
    private static String curname ;
    private static int curcode = 99 ;
    private static int curHP = 0 ;
    private static int curSP = 0 ;
    private static int curDMG = 0 ;
    private static int curSkill1 = 0 ;
    private static int curSkill2 = 0 ;
    private static String curType  ;
    private static String curWeak ;
    private static String curStrong ;

    public static void setnamePlayer(String namePlay) {
        namePlayer = namePlay;
    }
    
    public static String getnamePlayer() {
        return namePlayer;
    }

    public static void MainMenu() {
        System.out.println("._____________________________________.");
        System.out.println("|\t        MAIN MENU             |");
        System.out.println("|\t1 : Choose Your Partner       |");
        System.out.println("|\t2 : Choose You Activity       |");
        System.out.println("|\t3 :   THE DARK TOWER          |");
        System.out.println("|\t4 :       Quit                |");
        System.out.println("|_____________________________________|");
    }

    public static void ChoosePartner() {
        int part = 0;
        int event = 0;

        Scanner eventtype = new Scanner(System.in);

        do {
            System.out.println("._______________________________________.");
            System.out.println("|\t   Choose Your Partner          |");
            System.out.println("|\t Choose Your Partner Type       |");
            System.out.println("|\t       1 : FIRE                 |");
            System.out.println("|\t       2 : DIRT                 |");
            System.out.println("|\t       3 : WATER                |");
            System.out.println("|\t       4 : Back to main menu    |");
            System.out.println("|_______________________________________|");
            System.out.println("\t  What do you want : ");
            event = eventtype.nextInt();
            if (event == 4){
                break;
            }
            do {
                if (event == 1 && part != 3) {
                    System.out.println("._____________________________________.");
                    System.out.println("\t   Choose Your Partner FIRE");
                    System.out.println("\t       1 : MURASAME ");
                    System.out.println("\t       2 : ASTREY ");
                    System.out.println("\t       3 : ฺ Back ");
                    System.out.println("._____________________________________.");
                    System.out.println("\t  What do you want : ");
                    part = eventtype.nextInt();
                    if (part == 1) {
                        System.out.println("\n\tYour Partner : MURASAME");
                        checkcode = 0;
                        break;
                    } else if (part == 2) {
                        System.out.println("\n\tYour Partner : ASTREY");
                        checkcode = 1;
                        break;
                    } else if(part == 3){
                        System.out.println("\tBack");
                        break;

                    }
                }
                else if (event == 2 && part != 3) {
                    System.out.println("._____________________________________.");
                    System.out.println("\t   Choose Your Partner DIRT");
                    System.out.println("\t       1 : WINDOM ");
                    System.out.println("\t       2 : DAGGER ");
                    System.out.println("\t       3 : ฺ Back ");
                    System.out.println("._____________________________________.");
                    System.out.println("\t  What do you want : ");
                    part = eventtype.nextInt();
                    if (part == 1) {
                        System.out.println("\n\tYour Partner : WINDOM");
                        checkcode = 3;
                        break;
                    } else if (part == 2) {
                        System.out.println("\n\tYour Partner : DAGGER");
                        checkcode = 4;
                        break;
                    } else if(part == 3){
                        System.out.println("\tBack");
                        break;
                    }
                }
                else if (event == 3 && part != 3) {
                    System.out.println("._____________________________________.");
                    System.out.println("\t   Choose Your Partner WATER");
                    System.out.println("\t       1 : GINN ");
                    System.out.println("\t       2 : GOUF ");
                    System.out.println("\t       3 : ฺ Back ");
                    System.out.println("._____________________________________.");
                    System.out.println("\t  What do you want : ");
                    part = eventtype.nextInt();
                    if (part == 1) {
                        System.out.println("\n\tYour Partner : GINN");
                        checkcode = 5;
                        break;
                    } else if (part == 2) {
                        System.out.println("\n\tYour Partner : GOUF");
                        checkcode = 6;
                        break;
                    } else if(part == 3){
                        System.out.println("\tBack");
                        break;
                    }
                }
           
            } while (part != 3);
            
    } while (event != 4 );
       // eventtype.close();
    }

    public static int returnCode() {
        int code = checkcode;
        return code;
    }

    public static void setStatusPartner() {
        if(checkcode == 0){
            curHP = MURASAME.getHPmurasame();
            curSP = MURASAME.getSPmurasame();
            curDMG = MURASAME.getDMGmurasame();
            curSkill1 = MURASAME.getSKILL1murasame();
            curSkill2 = MURASAME.getSKILL2murasame();
            curType = MURASAME.getTYPEmurasame();
            curname = MURASAME.getNAMEmurasame();
            curWeak = MURASAME.getWeakmurasame();
            curStrong = MURASAME.getStrongmurasame();
            curcode = checkcode ;
        }
        else if (checkcode == 1){
            curHP = ASTREY.getHPastrey();
            curSP = ASTREY.getSPastrey();
            curDMG = ASTREY.getDMGastrey();
            curSkill1 = ASTREY.getSKILL1astrey();
            curSkill2 = ASTREY.getSKILL2astrey();
            curType = ASTREY.getTYPEastrey();
            curname = ASTREY.getNAMEastrey();
            curWeak = ASTREY.getWeakastrey();
            curStrong = ASTREY.getStrongastrey();
            curcode = checkcode;
        }
        else if (checkcode == 2){
            curHP = WINDOM.getHPwindom();
            curSP = WINDOM.getSPwindom();
            curDMG = WINDOM.getDMGwindom();
            curSkill1 = WINDOM.getSKILL1windom();
            curSkill2 = WINDOM.getSKILL2windom();
            curType = WINDOM.getTYPEwindom();
            curname = WINDOM.getNAMEwindom();
            curWeak = WINDOM.getWeakwindom();
            curStrong = WINDOM.getStrongwindom();
            curcode = checkcode;
        }
        else if (checkcode == 3){
            curHP = DAGGER.getHPdagger();
            curSP = DAGGER.getSPdagger();
            curDMG = DAGGER.getDMGdagger();
            curSkill1 = DAGGER.getSKILL1dagger();
            curSkill2 = DAGGER.getSKILL2dagger();
            curType = DAGGER.getTYPEdagger();
            curname = DAGGER.getNAMEdagger();
            curWeak = DAGGER.getWeakdagger();
            curStrong = DAGGER.getStrongdagger();
            curcode = checkcode;
        }
        else if (checkcode == 4){
            curHP = GINN.getHPginn();
            curSP = GINN.getSPginn();
            curDMG = GINN.getDMGginn();
            curSkill1 = GINN.getSKILL1ginn();
            curSkill2 = GINN.getSKILL2ginn();
            curType = GINN.getTYPEginn();
            curname = GINN.getNAMEginn();
            curWeak = GINN.getWeakginn();
            curStrong = GINN.getStrongginn();
            curcode = checkcode;
        }
        else if (checkcode == 5){
            curHP = GOUF.getHPgouf();
            curSP = GOUF.getSPgouf();
            curDMG = GOUF.getDMGgouf();
            curSkill1 = GOUF.getSKILL1gouf();
            curSkill2 = GOUF.getSKILL2gouf();
            curType = GOUF.getTYPEgouf();
            curname = GOUF.getNAMEgouf();
            curWeak = GOUF.getWeakgouf();
            curStrong = GOUF.getStronggouf();
            curcode = checkcode;
        }
    }
    public static int getStatusHpPartner(){
        return curHP ;
    }
    public static int getStatusSpPartner(){
        return curSP ;
    }
    public static int getStatusDmgPartner(){
        return curDMG ;
    }
    public static int getStatusSkill1Partner(){
        return curSkill1 ;
    }
    public static int getStatusSkill2Partner(){
        return curSkill2 ;
    }
    public static String getStatusTypePartner(){
        return curType ;
    }
    public static String getStatusNamePartner(){
        return curname ;
    }
    public static int getStatusCodePartner(){
        return curcode ;
    }

    public static void mainAct(){
        int event = 0;
        Scanner EventPersonAct = new Scanner(System.in);
        do{
            System.out.println("._____________________________________.");
            System.out.println("|\t  MAIN ACTIVITY               |");
            System.out.println("|\t 1 : SIMULATE FIGHT           |");
            System.out.println("|\t 2 : Status PARTs             |");
            System.out.println("|\t 3 : BACK TO MAIN MENU        |");
            System.out.println("|_____________________________________|");
            event = EventPersonAct.nextInt();
            if(event == 1){
                Random ran = new Random();
                int randx = ran.nextInt(6);
               
                System.out.println("|\t 1 : SIMULATE FIGHT           |");
                if(randx == 0){
                    System.out.println("|\tYour foes is MURASAME (Fire)  |");
                    FIRE.simulateFight(randx);
                }
                else if (randx == 1){
                    System.out.println("|\tYour foes is ASTRE (Fire)     |");
                    FIRE.simulateFight(randx);
                }
                else if (randx == 2){
                    System.out.println("|\tYour foes is WINDOM (Dirt)    |");
                    DIRT.simulateFight(randx);

                }
                else if (randx == 3){
                    System.out.println("|\tYour foes is DAGGER (Dirt)    |");
                    DIRT.simulateFight(randx);
                }
                else if(randx == 4){
                    System.out.println("|\tYour foes is GINN (Water)     |");
                    WATER.simulateFight(randx);
                }
                else if (randx == 5){
                    System.out.println("|\tYour foes is GOUF (Water)     |");
                    WATER.simulateFight(randx);
                }
            }
            else if(event == 2){
                System.out.println("._____________________________________.");
                System.out.println("|\t 3 : Status PARTs             |");
                System.out.println("|\tYour Partner is "+ curname );
                System.out.println("|\tYour HP Partner is "+ curHP );
                System.out.println("|\tYour SP Partner is "+ curSP );
                System.out.println("|\tYour DMG Partner is "+ curDMG  );
                System.out.println("|\tYour SKILL1 Partner is "+ curSkill1 );
                System.out.println("|\tYour SKILL2 Partner is "+ curSkill2 );
                System.out.println("|\tYour TYPE Partner is "+ curType);
                System.out.println("|\tYour Partner Strong with "+ curStrong);
                System.out.println("|\tYour Partner Weak with "+ curWeak);
                System.out.println("|_____________________________________|");
            }
           else if(event == 3){
               break;
           }
       }while(event != 3); //EventPersonAct.close();
    }

}
   
    