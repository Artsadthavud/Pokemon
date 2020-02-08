package GAMEPOKEMON2;

import java.util.Scanner;


public class POKEMONWORLD{

    private static String namePlayer;
    private String namePartner;
    private static int checkcode = 99;
   
    private static String curname ;
    private static int curcode = 99 ;
    private static int curHP = 0 ;
    private static int curSP = 0 ;
    private static int curDMG = 0 ;
    private static int curSkill1 = 0 ;
    private static int curSkill2 = 0 ;
    private static String curType  ;

    public static void setnamePlayer(String namePlay) {
        namePlayer = namePlay;
    }

    public static String getnamePlayer() {
        return namePlayer;
    }

    public static void MainMenu() {
        System.out.println("\n\t        MAIN MENU ");
        System.out.println("\t1 : Choose Your Partner ");
        System.out.println("\t2 : Choose You Activity ");
        System.out.println("\t3 :       Quit ");
    }

    public static void ChoosePartner() {
        int part = 0;
        int event = 0;

        Scanner eventtype = new Scanner(System.in);

        do {
            System.out.println("\t   Choose Your Partner ");
            System.out.println("\t Choose Your Partner Type ");
            System.out.println("\t       1 : FIRE ");
            System.out.println("\t       2 : DIRT ");
            System.out.println("\t       3 : WATER ");
            System.out.println("\t       4 : Back to main menu ");
            System.out.println("\t  What do you want : ");
            event = eventtype.nextInt();
            do {
                if (event == 1 && part != 3) {
                    System.out.println("\t   Choose Your Partner FIRE");
                    System.out.println("\t       1 : MURASAME ");
                    System.out.println("\t       2 : ASTREY ");
                    System.out.println("\n\t       3 : ฺ Back ");
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
                    } else {
                        System.out.println("\tBack");

                    }
                }
                if (event == 2 && part != 3) {
                    System.out.println("\t   Choose Your Partner DIRT");
                    System.out.println("\t       1 : WINDOM ");
                    System.out.println("\t       2 : DAGGER ");
                    System.out.println("\n\t       3 : ฺ Back ");
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
                    } else {
                        System.out.println("\tBack");
                    }
                }
                if (event == 3 && part != 3) {
                    System.out.println("\t   Choose Your Partner WATER");
                    System.out.println("\t       1 : GINN ");
                    System.out.println("\t       2 : GOUF ");
                    System.out.println("\n\t       3 : ฺ Back ");
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
                    } else {
                        System.out.println("\tBack");
                    }
                }
            } while (part != 3);
        } while (event != 4 && (part == 0 || part == 3));
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
            curcode = checkcode;
        }
    }



}
   
    