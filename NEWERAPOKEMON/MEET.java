package NEWERAPOKEMON;

import java.util.Scanner;

public class MEET extends NEWERAPOKEMON {
// fist meet partner after choose
public static void firstMeetPartner(LIFEPOKEMON lifepokemon) {
    Scanner eventChangeNamePartner = new Scanner(System.in);
    String NamePlayer = ACTIONONWORLD.NamePlayer;
    boolean checkmain = true;
    boolean checkNameCall = true;
    boolean checkChangeName = true;

    System.out.println(" MEET PARTNER ");
    System.out.println(lifepokemon.getName() + " : Hi Partner my Name is " + lifepokemon.getName() + " Nice to meet you !!!");
    System.out.println(NamePlayer + " : Hi partner my Name is " + NamePlayer + " Nice to meet you too !!!");
    System.out.println(lifepokemon.getName() + " : You can call me "+ lifepokemon.getName()+ " or you will call me other ? ");
    // choise to call name 

// check call pokemon
    while(checkmain != false) {
        System.out.println(" 1 : YES  I will call you" + lifepokemon.getName());
        System.out.println(" 2 : NO I will call you other Name");
        int eventChangeName = eventChangeNamePartner.nextInt();
            if(eventChangeName == 1){
                System.out.println(NamePlayer + " : YES  I will call you " + lifepokemon.getName());
                checkmain = false;
            }
            else if(eventChangeName == 2){
                System.out.println(NamePlayer + " : NO I will call you other Name : ");
                String NamePartner = eventChangeNamePartner.next();
                lifepokemon.addName(NamePartner);
                System.out.println(NamePlayer + "I will call you " + lifepokemon.getName());
                checkmain = false;
            }
    }
    
// check call yourself
    while(checkNameCall != false){
        System.out.println(lifepokemon.getName() + " : OK that's a good and I can you call " + NamePlayer + " ?");
        System.out.println(" 1 : YES you can call me " + NamePlayer);
        System.out.println(" 2 : NO you can call me other Name ");
        int eventChangeName = eventChangeNamePartner.nextInt();
            if(eventChangeName == 1){
                System.out.println(lifepokemon.getName() + " : OK then I will call you " + NamePlayer);
                checkNameCall = false;
            }
            else if(eventChangeName == 2){
                System.out.println(lifepokemon.getName() + " : Oh OK what name you want me to call ?");
                System.out.println(" 1 : Depend on you what do you want to call me ");
                System.out.println(" 2 : NO you can call me other Name ");
                    while(checkChangeName != false){
                        int eventchecknamecall = eventChangeNamePartner.nextInt();
                            if(eventchecknamecall == 1){
                                System.out.print(lifepokemon.getName() + " : OK partner I will call you " + NamePlayer + "I Love this name");
                                checkChangeName  = false;
                            }
                            else if(eventchecknamecall == 2){
                                System.out.println(lifepokemon.getName() + " : Then what name you want me to call you ?");
                                String NamePartner = eventChangeNamePartner.next();
                                ACTIONONWORLD.setNamePlayer(NamePartner);
                                System.out.print(lifepokemon.getName() + " : OK partner I will call you " + NamePlayer);
                                checkChangeName  = false;
                            }
                }
            checkNameCall = false;

        }
    }


}

}