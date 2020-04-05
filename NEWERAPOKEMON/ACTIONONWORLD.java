package NEWERAPOKEMON;

import java.util.Scanner;

public class ACTIONONWORLD extends NEWERAPOKEMON {
   

    protected static String NamePlayer;

    // choose class partner
    public static void choosePartner() {
        System.out.println("Choose Class Of Partner");
        System.out.println("1 : FIRE ");
        System.out.println("2 : WATER");
        System.out.println("3 : DIRT");
        System.out.println("4 : back");
    }

    // main state
    public static void mainMenu() {
        System.out.println("MAIN MENU ");
        System.out.println(" 1 : Status");
        System.out.println(" 2 : Meet your partner");
        System.out.println(" 3 : Quit");
    }

    // choose fire partner
    public static void fireChoosePartner() {
        System.out.println("Choose your Partner");
        System.out.println("1 : MURASAME ");
        System.out.println("2 : ASTREY");
        System.out.println("3 : Back");
    }

    // choose water partner
    public static void waterChoosePartner() {
        System.out.println("Choose your Partner");
        System.out.println("1 : GINN ");
        System.out.println("2 : GOUF");
        System.out.println("3 : Back");
    }

    // choose dirt partner
    public static void dirtChoosePartner() {
        System.out.println("Choose your Partner");
        System.out.println("1 : WINDOM ");
        System.out.println("2 : DAGGER");
        System.out.println("3 : Back");
    }

    public static void meetPartner() {
        System.out.println("1 : Feed Your Partner");
        System.out.println("2 : Touch Head Partner");
        System.out.println("3 : Change Name Partner");
        System.out.println("4 : Back");
    }

    public static void showStatus(LIFEPOKEMON lifepokemon) {
        System.out.println(lifepokemon.getName());
        System.out.println(lifepokemon.getHP());
        System.out.println(lifepokemon.getSP());
        System.out.println(lifepokemon.getDMG());
        System.out.println(lifepokemon.getcLass());
    }

    // first meet at game to enter name && choose partner
    public static void firstMeetSetName() {
        System.out.println("WELLCOME TO GUNGEMON");
        System.out.println("PLEASE ENTER YOUR NAME");
        String Name = inputPlayerName();
        ACTIONONWORLD.setNamePlayer(Name);
        System.out.println(" Welcome to Gungemon "+Name);
        System.out.println(" Choose Your Partner");

    }

    // for input name
    public static String inputPlayerName() {
        Scanner NamePerson = new Scanner(System.in);
        String NamePerSon = NamePerson.next();
        return NamePerSon;
}

// set name from input
    public static void setNamePlayer(String NamePlayer) {
        ACTIONONWORLD.NamePlayer = NamePlayer;
    }

//get name to use
    public String getNamePlayer() {
        return NamePlayer;
    }

// fist meet partner after choose
    public static void firstMeetPartner(LIFEPOKEMON lifepokemon) {
        Scanner eventChangeNamePartner = new Scanner(System.in);
       
        boolean checkmain = true;
        boolean checkNameCall = true;
        boolean checkChangeName = true;

        System.out.println(" MEET PARTNER ");
        System.out.println(lifepokemon.getName() + " : Hi Partner my Name is " + lifepokemon.getName() + " Nice to meet you !!!");
        System.out.println(NamePlayer + " : Hi partner my Name is " + NamePlayer + " Nice to meet you too !!!");
        System.out.println(lifepokemon.getName() + " : You can call me "+ lifepokemon.getName()+ " or you will call me other ? ");
        // choise to call name 


        while(checkmain != false) {
            System.out.println(" 1 : YES  I will call you" + lifepokemon.getName());
            System.out.println(" 2 : NO I will call you other Name");
            int eventChangeName = eventChangeNamePartner.nextInt();
                if(eventChangeName == 1){
                    System.out.println(NamePlayer + " : YES  I will call you" + lifepokemon.getName());
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
                    System.out.println(" 2 : NO you can call me othet Name ");
                        while(checkChangeName != false){
                            int eventchecknamecall = eventChangeNamePartner.nextInt();
                                if(eventchecknamecall == 1){
                                    System.out.print(lifepokemon.getName() + " : OK partner I will call you " + NamePlayer + "I Love this name");
                                    checkChangeName  = false;
                                }
                                else if(eventchecknamecall == 2){
                                    System.out.println(lifepokemon.getName() + " : Then what name you want me to call you ?");
                                    String NamePartner = eventChangeNamePartner.next();
                                    setNamePlayer(NamePartner);
                                    System.out.print(lifepokemon.getName() + " : OK partner I will call you " + NamePlayer);
                                    checkChangeName  = false;
                                }
                    }
                checkNameCall = false;

            }
        }


    }



}