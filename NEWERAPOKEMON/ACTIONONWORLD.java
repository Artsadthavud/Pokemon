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
        System.out.println(" 1 : Meet your partner");
        System.out.println(" 2 : TOWER");
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
        System.out.println(" What do you want to do ?");
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
        System.out.println("WELLCOME TO GUNGEMON ");
        System.out.println("PLEASE ENTER YOUR NAME ");
        String Name = inputPlayerName();
        ACTIONONWORLD.setNamePlayer(Name);
        System.out.println(" Welcome to Gungemon " + Name);
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

    public int loopCheck(int Number){
        int count = 0;
      
        return count;
    }
    public void checkMax(LIFEPOKEMON lifepokemon){

    
    }
}