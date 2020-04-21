package NEWERAPOKEMON;

import java.util.Scanner;

public class GYM extends NEWERAPOKEMON {

    public static void nameGym(){
        System.out.println(" 1 : PTOLEMAIOS GYM ");// for recover pokemon talk and center data 
        System.out.println(" 2 : JUNIUS SEVEN GYM");  // for fight with or ther random from full pool
        System.out.println(" 3 : TRAILBLAZER GYM"); // for adventur againt 3 god of CLASS
        System.out.println(" 4 : Back");
    }

    public static void mainGym(){
        Scanner event = new Scanner(System.in);
        boolean gymCheck = true ;
        while(gymCheck != false){
            nameGym();
            int eventGym = event.nextInt();
                if(eventGym == 1){
                    System.out.println(" 1 : PTOLEMAIOS GYM");// for recover pokemon talk and center data
                    PTOLEMAIOS();
                }
                else if(eventGym == 2){
                    System.out.println(" 2 : JUNIUS SEVEN GYM");  // for fight with or ther random from full pool 
                    JUNIUSSEVEN();
                }
                else if(eventGym == 3){
                    System.out.println(" 3 : TRAILBLAZER GYM"); // for adventur againt 3 god of CLASS
                    TRAILBLAZER();
                        // Chaos fire
                        // Gaia  dirt
                        // Abyss water
                }
        }

    } 

    public static void JUNIUSSEVEN(){
        

    }

    public static void PTOLEMAIOS(){
        MONEY.displayMoney();


    }

    public static void TRAILBLAZER(){


    }

}