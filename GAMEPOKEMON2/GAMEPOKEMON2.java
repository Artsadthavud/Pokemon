package GAMEPOKEMON2;

import java.util.*;

public class GAMEPOKEMON2 {
     public static void main(String[] args) {

         Scanner NamePerson = new Scanner(System.in);
         Scanner EventPerson = new Scanner(System.in);
         Scanner eventtype = new Scanner(System.in);
// Set name player         
         System.out.print("\nEnter Your Name : ");
         String Nameper = NamePerson.next();
         POKEMONWORLD.setnamePlayer(Nameper);
         System.out.print("\nYour Name : "+ (POKEMONWORLD.getnamePlayer() ));
        
         int event = 0;
         int codepart = 99 ;
        do{
            POKEMONWORLD.MainMenu ();
            event = EventPerson.nextInt();
            if(event == 1){
                POKEMONWORLD.ChoosePartner();
                codepart = POKEMONWORLD.returnCode() ;
               POKEMONWORLD.setStatusPartner();
            }
            System.out.print(codepart);

        }while(event != 3);EventPerson.close();NamePerson.close();eventtype.close();
     } 

   

    
}