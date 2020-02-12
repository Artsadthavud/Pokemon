package GAMEPOKEMON2;

import java.util.*;

public class GAMEPOKEMON2 {
     public static void main(String[] args) {

         Scanner NamePerson = new Scanner(System.in);
         Scanner EventPerson = new Scanner(System.in);
        
// Set name player         
         System.out.print("\nEnter Your Name : ");
         String Nameper = NamePerson.next();
         POKEMONWORLD.setnamePlayer(Nameper);
         System.out.print("\nYour Name : "+ (POKEMONWORLD.getnamePlayer() )+"\n");
         int eventmain = 0;
         int checkCode = 99;
        do{
            POKEMONWORLD.MainMenu ();
            eventmain = EventPerson.nextInt();
            if(eventmain == 1){
                POKEMONWORLD.ChoosePartner();
                POKEMONWORLD.setStatusPartner();
                checkCode = POKEMONWORLD.returnCode();
            }
            else if (eventmain == 2){
                if(eventmain == 2 && checkCode >= 0 && checkCode <= 6){
                POKEMONWORLD.mainAct();
                }
                else {
                    System.out.println("\n**\tYOU SHOULD GO TO CHOOSE PARTNER FIRST    **");
                    }
            }
            else if (eventmain == 3){
                if(eventmain == 3 && checkCode >= 0 && checkCode <= 6){
                MAINTOWER.MainState();
                MAINTOWER.getCurStatusPartner();
                MAINTOWER.getTheTOWER();
                }
                else{
                    System.out.println("\n**\tYOU SHOULD GO TO CHOOSE PARTNER FIRST    **");  
                }
            }  
        }while(eventmain != 4);
     }  
}