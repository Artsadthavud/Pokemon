package GAMEPOKEMON2;

import java.util.Scanner;

public class MAINTOWER extends POKEMONWORLD {

    public static void MainState(){
        System.out.println("\tTHE DARK TOWER");

    }
    public static void getCurStatusPartner(){
        int HP = getStatusHpPartner();
        int SP = getStatusSpPartner();
        int DMG = getStatusDmgPartner();
        int SKILL1 = getStatusSkill1Partner();
        int SKILL2 = getStatusSkill2Partner();
        int CODE = getStatusCodePartner();
        String NAME = getStatusNamePartner();
        String TYPE = getStatusTypePartner();
    }

    public static void getTheTOWER(){
        Scanner event = new Scanner(System.in);
        int eventT = event.nextInt();
        do{
        System.out.println("|\t1 :  START        |");
        System.out.print("\t3 : BACK");
        if (eventT == 1){
            System.out.print("\tStart The Tower of Death");
            
        }
        else if (eventT == 3){
            break;
        }
        }while(eventT != 3);
    }

}