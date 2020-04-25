package NEWERAPOKEMON;

import java.util.ArrayList;
import java.util.Scanner;

public class ACTIONONWORLD extends NEWERAPOKEMON {
   

    protected static String NamePlayer;

    // choose class partner
    public static void choosePartner() {
        System.out.println("Choose Class Of Partner");
        System.out.println("1 : FIRE ");
        System.out.println("2 : WATER");
        System.out.println("3 : DIRT");
        System.out.println("4 : Back");
    }

    // main state
    public static void mainMenu() {
        System.out.println("MAIN MENU ");
        System.out.println(" 1 : Meet your partner");
        System.out.println(" 2 : GYM");
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
        System.out.println("1 : Feed Your Partner(can heal HP partner)");
        System.out.println("2 : Communicate with Partner(can heal SP partner)");
        System.out.println("3 : Change Name Partner");
        System.out.println("4 : Back");
    }

    public static void showStatus(LIFEPOKEMON lifepokemon) {
        System.out.println("NAME :" + lifepokemon.getName());
        System.out.println("HP :" + lifepokemon.getHP());
        System.out.println("SP :" + lifepokemon.getSP());
        System.out.println("DAMAGE :" + lifepokemon.getDMG());
        System.out.println("CLASS" + lifepokemon.getcLass());
        System.out.println("LEVEL :" + lifepokemon.LEVEL);
        System.out.println("XP :" + lifepokemon.XP);
    }

    // first meet at game to enter name && choose partner
    public static void firstMeetSetName() {
        System.out.println("WELLCOME TO GUNGEMON ");
        System.out.println("PLEASE ENTER YOUR NAME ");
        String Name = inputName();
        ACTIONONWORLD.setNamePlayer(Name);
        System.out.println(" Welcome to Gungemon " + Name);
        System.out.println(" Choose Your Partner");

    }

    // for input name
    public static String inputName() {
        Scanner NamePerson = new Scanner(System.in);
        String NamePerSon = NamePerson.next();
        return NamePerSon;
}

// set name from input
    public static void setNamePlayer(String NamePlayer) {
        ACTIONONWORLD.NamePlayer = NamePlayer;
    }
// set name partner
public static void setName(String Name, LIFEPOKEMON lifepokemon) {
    lifepokemon.Name = Name;
}

//get name to use
    public static String getNamePlayer() {
        return NamePlayer;
    }

    public int loopCheck(int Number){
        int count = 0;
      
        return count;
    }
    public static int checkBag(ArrayList<LIFEPOKEMON> mYPOKEMON){
        int numberofpokemon = 0 ;
        int countnumofpokemon = 0;
        while(mYPOKEMON.size() != numberofpokemon) {
            countnumofpokemon += 1;
            numberofpokemon += 1;
        }
        return countnumofpokemon;
    }

    public static void CommunicateHealSP(){
        System.out.println(" 1 : Touch head ");
        System.out.println(" 2 : Talk to partner ");
        System.out.println(" 3 : Back");
    }

    public static void touchHeadComm(){
        System.out.println(" 1 : put hand out from head partner");
        System.out.println(" 2 : put hand on continous");
    }
    public static void TouchheadAct(LIFEPOKEMON lifepokemon){
        Scanner eventtouch = new Scanner(System.in);

        // show choise to do with partner
        CommunicateHealSP();

        // execute after choose act
        int evenComm = eventtouch.nextInt();
        if(evenComm == 1){
        System.out.println(NamePlayer + " : What do you feel?");
            if(lifepokemon.cLass == "FIRE"){
                System.out.println(lifepokemon.Name + " : Put your hand out of my head if not i will burn your hand !!");
                LIFEPOKEMON.updateTrusting(lifepokemon, -5);
                touchHeadComm();
                int eventtouchhead = eventtouch.nextInt();
                    if(eventtouchhead == 1){
                        System.out.println(lifepokemon.Name + " : Good !!");
                        LIFEPOKEMON.discommmuSP(lifepokemon, 5);
                        LIFEPOKEMON.updateTrusting(lifepokemon, -5);
                        showStatus(lifepokemon);                    
                    }
                    else if(eventtouchhead == 2){
                        System.out.println(lifepokemon.Name + " : Put your hand out of my head NOWWWW !!");
                        LIFEPOKEMON.discommmuSP(lifepokemon, 200);
                        LIFEPOKEMON.updateTrusting(lifepokemon, -20);
                        showStatus(lifepokemon);
                    }
            }
            
            else if(lifepokemon.cLass == "WATER"){
                System.out.println(lifepokemon.Name + " : Pretty good !!");
                LIFEPOKEMON.commuPartner(lifepokemon, 200);
                LIFEPOKEMON.updateTrusting(lifepokemon, 20);
                showStatus(lifepokemon);
            }
            else if(lifepokemon.cLass == "DIRT"){
                System.out.println(lifepokemon.Name + " : Why human like to touch head other species I dont like but not hate");
                LIFEPOKEMON.commuPartner(lifepokemon, 50);
                LIFEPOKEMON.updateTrusting(lifepokemon, 10);
                showStatus(lifepokemon);
            }
        }
        else if(evenComm == 2){
            
        }
            
    }

}