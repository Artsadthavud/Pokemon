package GAMEPOKEMON2;

import java.util.Random;
import java.util.Scanner;

public class MAINTOWER extends POKEMONWORLD {
    protected static String nameFoes;
    protected static int checkfoes = 8;
    private static int FHP = 0 ;
    private static int FSP = 0 ;
    private static int FDMG = 0 ;
    private static int FSkill1 = 0 ;
    private static int FSkill2 = 0 ;
    private static String FType  ;
    private static String FWeak ;
    private static String FStrong ;

    public static void MainState() {
        System.out.println("\tTHE DARK TOWER");
    }

    public static void setFoesName(String nameFoes) {
        MAINTOWER.nameFoes = nameFoes;
    }

    public static String getFoesName() {
        return nameFoes;
    }
    public static void getCurStatusPartner() {
        int HP = getStatusHpPartner();
        int SP = getStatusSpPartner();
        int DMG = getStatusDmgPartner();
        int SKILL1 = getStatusSkill1Partner();
        int SKILL2 = getStatusSkill2Partner();
        int CODE = getStatusCodePartner();
        String NAME = getStatusNamePartner();
        String TYPE = getStatusTypePartner();
    }

    public static void displayFoes() {
        String namefoes = getFoesName();
        System.out.println("\tTHE DARK TOWER");
        System.out.println("\t YOUR FOES is " + namefoes);
    }

    public static void displayAttck() {

    }
    public static void setCodeFoes(int checkfoes){
        MAINTOWER.checkfoes = checkfoes ;
    }

    public static int getCodeFoes(){
        return checkfoes;
    }

    public static void setFoesStatus(){
        int c = getCodeFoes();
        if(c == 0){
            FHP = FOESFIRE.getHPfoesF();
            FSP = FOESFIRE.getSPfoesF();
            FDMG = FOESFIRE.getDMGfoesF();
            FSkill1 =FOESFIRE.getSKILL1foesF();
            FSkill2 = FOESFIRE.getSKILL2foesF();
            FType = FOESFIRE.getTYPEfoesF();
            FStrong = FOESFIRE.getStrongfoesF();
            FWeak = FOESFIRE.getWeakfoesF();
            nameFoes = FOESFIRE.getNAMEfoesF();
        }
        else if(c == 1){
            FHP = FOESDIRT.getHPfoesD();
            FSP = FOESDIRT.getSPfoesD();
            FDMG = FOESDIRT.getDMGfoesD();
            FSkill1 =FOESDIRT.getSKILL1foesD();
            FSkill2 = FOESDIRT.getSKILL2foesD();
            FType = FOESDIRT.getTYPEfoesD();
            FStrong = FOESDIRT.getStrongfoesD();
            FWeak = FOESDIRT.getWeakfoesD();
            nameFoes = FOESDIRT.getNAMEfoesD();
        }
        else if(c == 2){
            FHP = FOESWATER.getHPfoesW();
            FSP = FOESWATER.getSPfoesW();
            FDMG = FOESWATER.getDMGfoesW();
            FSkill1 =FOESWATER.getSKILL1foesW();
            FSkill2 = FOESWATER.getSKILL2foesW();
            FType = FOESWATER.getTYPEfoesW();
            FStrong = FOESWATER.getStrongfoesW();
            FWeak = FOESWATER.getWeakfoesW();
            nameFoes = FOESWATER.getNAMEfoesW();
        }
    }

    public static void displayFoesStatus(){
        System.out.println("\t"+nameFoes +" HP "+ FHP);
        System.out.println("\t"+nameFoes +" SP "+ FSP);
        System.out.println("\t"+nameFoes +" DAMAGE "+ FDMG);
        System.out.println("\t"+nameFoes +" SKILL1 "+ FSkill1);
        System.out.println("\t"+nameFoes +" SKILL2 "+ FSkill2);
        System.out.println("\t"+nameFoes +" TYPE "+ FType);
        System.out.println("\t"+nameFoes +" STRONG WITH "+ FStrong);
        System.out.println("\t"+nameFoes +" WEAK WITH "+ FWeak);

    }

    public static void foesFirstStep(){
        Random randz = new Random();
        int ran = randz.nextInt(3);
        if (ran == 0) {
            setFoesName(FOESFIRE.getNAMEfoesF());  
            setCodeFoes(0);
            setFoesStatus();
        }
        else if (ran == 1){
            setFoesName(FOESDIRT.getNAMEfoesD());
            setCodeFoes(1);
            setFoesStatus();
        }
        else if (ran == 2){
            setFoesName(FOESWATER.getNAMEfoesW());
            setCodeFoes(2);
            setFoesStatus();
        }
    }

    public static void resultfight(int hprx,int hpfx){

    }

    public static void getTheTOWER() {
        Scanner event = new Scanner(System.in);
        int eventT = 9;
        int eventnd = 0;
        setFoesStatus();
        do {
            System.out.println("._____________________________________.");
            System.out.println("\t1 :  START TO TRAIN    ");
            System.out.println("\t2 : Check Status");
            System.out.println("\t3 : BACK");
            System.out.println("._____________________________________.");
            eventT = event.nextInt();
            if (eventT == 1) {
                System.out.println("\tStart TRAIN Tower of Death\n");
                foesFirstStep();
                displayFoes();
                displayFoesStatus();
                int hpr = getStatusHpPartner() ;
                int hpf = FHP ;
                int spr = getStatusSpPartner();
                do{
                    System.out.println("._____________________________________.");
                    System.out.println("\t 1 : HIT TO THE FOES ");
                    System.out.println("\t 2 : SKILL1 TO THE FOES ");
                    System.out.println("\t 3 : SKILL2 TO THE FOES ");
                    System.out.println("\t 4 : REGEN HP ");
                    System.out.println("\t 5 : REGEN SP ");
                    System.out.println("\t 6 : back ");
                    System.out.println("._____________________________________.");
                    eventnd = event.nextInt();
                        if(eventnd == 1){
                            System.out.println("\t HIT TO THE FOES ");
                            hpr = chaneToHitSkill(hpr, FDMG, FSkill1, FSkill2);
                            hpf = chaneFoesDodg(hpf, getStatusDmgPartner()); 
                            reportHowFoesHit(getcheckHowFoesHit());
                             if(hpr > 0 && hpf > 0){
                                System.out.println("._____________________________________.");
                                System.out.println("\t YOUR CURRENT HP : "+hpr);
                                System.out.println("\t YOUR CURRENT SP : "+spr);
                                System.out.println("._____________________________________.");
                                System.out.println("\t FOES CURRENT HP : "+hpf);
                             }else if (hpr <= 0 && hpf > 0){
                                System.out.println("\t YOUR PARTNER IS DEAD haha");
                                System.out.println("\t YOU SHALL NOT PASS ");
                                break;
                             }
                             else if (hpr > 0 && hpf <= 0){
                                System.out.println("\t YOUR FOES IS DEAD  ");
                                break;
                             }
                             else if (hpr <= 0 && hpf <= 0){
                                System.out.println("\t WAR Is Over ");
                                break;
                             }
                            }
                        else if(eventnd == 2){
                            spr = manaWhileFight(spr, 1);
                            hpr = chaneToHitSkill(hpr, FDMG, FSkill1, FSkill2);
                            if(spr>0){
                                hpf = chaneFoesDodg(hpf, getStatusSkill1Partner());
                            }
                            else if(spr <=0){
                                System.out.println("\t!!!! NOT ENOUGH SP !!!!");
                                spr = spr + 60 ;
                            }
                                 reportHowFoesHit(getcheckHowFoesHit()); 
                                 System.out.println("\t SKILL1 TO THE FOES ");
                            if(hpr > 0 && hpf > 0){
                                System.out.println("._____________________________________.");
                                System.out.println("\t YOUR CURRENT HP : "+hpr);
                                System.out.println("\t YOUR CURRENT SP : "+spr);
                                System.out.println("._____________________________________.");
                                System.out.println("\t FOES CURRENT HP : "+hpf);
                             }else if (hpr <= 0 && hpf > 0){
                                System.out.println("\t YOUR PARTNER IS DEAD haha");
                                System.out.println("\t YOU SHALL NOT PASS ");
                                break;
                             }
                             else if (hpr > 0 && hpf <= 0){
                                System.out.println("\t YOUR FOES IS DEAD  ");
                                break;
                             }
                             else if (hpr <= 0 && hpf <= 0){
                                System.out.println("\t WAR Is Over ");
                                break;
                             }
                            }
                        else if(eventnd == 3){
                            System.out.println("\t SKILL2 TO THE FOES ");
                            spr = manaWhileFight(spr, 2);
                            if(spr>0){
                                hpf = chaneFoesDodg(hpf, getStatusSkill2Partner());
                            }
                            else if(spr <=0){
                                System.out.println("\t!!!! NOT ENOUGH SP !!!!");
                                spr = spr + 100 ;
                            }
                                hpr = chaneToHitSkill(hpr, FDMG, FSkill1, FSkill2);
                            reportHowFoesHit(getcheckHowFoesHit());
                            if(hpr > 0 && hpf > 0){
                                System.out.println("._____________________________________.");
                                System.out.println("\t YOUR CURRENT HP : "+hpr);
                                System.out.println("\t YOUR CURRENT SP : "+spr);
                                System.out.println("._____________________________________.");
                                System.out.println("\t FOES CURRENT HP : "+hpf);
                             }else if (hpr <= 0 && hpf > 0){
                                System.out.println("\t YOUR PARTNER IS DEAD haha");
                                System.out.println("\t YOU SHALL NOT PASS ");
                                break;
                             }
                             else if (hpr > 0 && hpf <= 0){
                                System.out.println("\t YOUR FOES IS DEAD  ");
                                break;
                             }
                             else if (hpr <= 0 && hpf <= 0){
                                System.out.println("\t WAR Is Over ");
                                break;
                             }
                            }
                        else if (eventnd == 4){
                                System.out.println("\t REGEN HP ");
                                    spr = manaWhileFight(spr, 2);
                                if(spr>0){
                                    hpr = regenHpWhileFight(hpr);
                                }
                                else if(spr <=0){
                                    System.out.println("\t!!!! NOT ENOUGH SP !!!!");
                                    spr = spr + 100 ;
                                }
                                hpr = chaneToHitSkill(hpr, FDMG, FSkill1, FSkill2);  
                                reportHowFoesHit(getcheckHowFoesHit());
                                if(hpr > 0 && hpf > 0){
                                    System.out.println("._____________________________________.");
                                    System.out.println("\t YOUR CURRENT HP : "+hpr);
                                    System.out.println("\t YOUR CURRENT SP : "+spr);
                                    System.out.println("._____________________________________.");
                                    System.out.println("\t FOES CURRENT HP : "+hpf);
                                 }else if (hpr <= 0 && hpf > 0){
                                    System.out.println("\t YOUR PARTNER IS DEAD haha");
                                    System.out.println("\t YOU SHALL NOT PASS ");
                                    break;
                                 }
                                 else if (hpr > 0 && hpf <= 0){
                                    System.out.println("\t YOUR FOES IS DEAD  ");
                                    break;
                                 }
                                 else if (hpr <= 0 && hpf <= 0){
                                    System.out.println("\t WAR Is Over ");
                                    break;
                                 }
                        } 
                    else if(eventnd == 5){
                        System.out.println("\t REGEN SP ");
                        spr = manaWhileFight(spr, 3);
                        hpr = chaneToHitSkill(hpr, FDMG, FSkill1, FSkill2);
                        reportHowFoesHit(getcheckHowFoesHit());  
                        if(hpr > 0 && hpf > 0){
                            System.out.println("._____________________________________.");
                            System.out.println("\t YOUR CURRENT HP : "+hpr);
                            System.out.println("\t YOUR CURRENT SP : "+spr);
                            System.out.println("._____________________________________.");
                            System.out.println("\t FOES CURRENT HP : "+hpf);
                         }else if (hpr <= 0 && hpf > 0){
                            System.out.println("\t YOUR PARTNER IS DEAD haha");
                            System.out.println("\t YOU SHALL NOT PASS ");
                            break;
                         }
                         else if (hpr > 0 && hpf <= 0){
                            System.out.println("\t YOUR FOES IS DEAD  ");
                            break;
                         }
                         else if (hpr <= 0 && hpf <= 0){
                            System.out.println("\t WAR Is Over ");
                            break;
                         }
                    }  
                        
                }while(eventnd != 6);
            }
        else if (eventT == 2){
            displayPartSatus();
        }
        else if (eventT == 3){
            break;
        }
        }while(eventT != 3);
    }

}