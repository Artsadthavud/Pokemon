package GAMEPOKEMON2;

import java.util.Random;
import java.util.Scanner;

public class MAINTOWER extends POKEMONWORLD {
    protected static String nameFoes;
    protected static int checkfoes = 8;
    public static void MainState() {
        System.out.println("\tTHE DARK TOWER");
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

    public static void setFoesName(String nameFoes) {
        MAINTOWER.nameFoes = nameFoes;
    }

    public static String getFoesName() {
        return nameFoes;
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
    public static void foesFirstStep(){
        Random randz = new Random();
        int ran = randz.nextInt(3);
        if (ran == 0) {
            setFoesName(FOESFIRE.getNAMEfoesF());  
            setCodeFoes(0);
        }
        else if (ran == 1){
            setFoesName(FOESDIRT.getNAMEfoesD());
            setCodeFoes(1);
        }
        else if (ran == 2){
            setFoesName(FOESWATER.getNAMEfoesW());
            setCodeFoes(2);
        }
    }

    public static void getTheTOWER() {
        Scanner event = new Scanner(System.in);
        int eventT = 9;
        int eventnd = 0;
        int eventst = 0;
        
        do {
            System.out.println("\t1 :  START        ");
            System.out.println("\t2 : Check Status");
            System.out.println("\t3 : BACK");
            eventT = event.nextInt();

            if (eventT == 1) {
                System.out.println("\tStart The Tower of Death");
                foesFirstStep();
                
                displayFoes();
                eventnd = event.nextInt();

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