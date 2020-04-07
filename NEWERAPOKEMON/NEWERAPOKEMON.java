package NEWERAPOKEMON;
import java.util.*;

public class NEWERAPOKEMON {
    public static void main(String[] args) {
    
    //build bag for get pokemon to player and world
        ArrayList<LIFEPOKEMON> MYPOKEMON = new ArrayList<LIFEPOKEMON>();
        ArrayList<LIFEPOKEMON> POKEMONWORLD = new ArrayList<LIFEPOKEMON>();
    // add POKEMON TO WORLD
    // name, class, hp, sp, dmg
        // add FIRE POKEMON
        LIFEPOKEMON MURASAME = new FIRE();
            MURASAME.addStatusPokemon("MURASAME","FIRE", 850, 450, 120);
            MURASAME.setMaxStatus(850, 450);
            POKEMONWORLD.add(MURASAME);

        LIFEPOKEMON ASTREY = new FIRE();
            ASTREY.addStatusPokemon("ASTREY","FIRE", 825, 455, 112);
            ASTREY.setMaxStatus(825, 455);
            POKEMONWORLD.add(ASTREY);

        // add WATER POKEMON
        LIFEPOKEMON GINN = new WATER();
            GINN.addStatusPokemon("GINN","WATER", 880, 500, 110);
            GINN.setMaxStatus(880, 500);
            POKEMONWORLD.add(GINN);
            
        LIFEPOKEMON GOUF = new WATER();
            GOUF.addStatusPokemon("GOUF","WATER", 895, 460, 115);
            GOUF.setMaxStatus(895, 460);
            POKEMONWORLD.add(GOUF);
           
        // add DIRT POKEMON
        LIFEPOKEMON WINDOM = new DIRT();
            WINDOM.addStatusPokemon("WINDOM","DIRT", 920, 420, 110);
            WINDOM.setMaxStatus(920, 420);
            POKEMONWORLD.add(WINDOM);
           
        LIFEPOKEMON DAGGER = new DIRT();
            DAGGER.addStatusPokemon("DAGGER","DIRT", 900, 400, 111);
            DAGGER.setMaxStatus(900, 400);
            POKEMONWORLD.add(DAGGER);

// scanner for input value state player choose
       
        Scanner EventPerson = new Scanner(System.in);
       
// sign name player    
        ACTIONONWORLD.firstMeetSetName();

// CHOOSE PARTNER
          do{ 
            // choose class partner
            ACTIONONWORLD.choosePartner();
            Scanner ChoosePartner = new Scanner(System.in);
            int EventChoosePartner = ChoosePartner.nextInt();

            // choose class fire
            if(EventChoosePartner == 1){
                ACTIONONWORLD.fireChoosePartner();
                int partnerNumber = ChoosePartner.nextInt();
                if(partnerNumber == 1){
                    MYPOKEMON.add(MURASAME);
                    System.out.println(MURASAME.getName());
                    break;
                }
                else if(partnerNumber == 2){
                    MYPOKEMON.add(ASTREY);
                    break;
                }
                else if(partnerNumber == 3){
                    break;
                }
            }
            //choose class water
            else if(EventChoosePartner == 2){
                ACTIONONWORLD.waterChoosePartner();
                int partnerNumber = ChoosePartner.nextInt();
                if(partnerNumber == 1){
                    MYPOKEMON.add(GINN);
                    break;
                }
                else if(partnerNumber == 2){
                    MYPOKEMON.add(GOUF);
                    break;
                }
                else if(partnerNumber == 3){
                    break;
                }
            }
            //choose class dirt
            else if(EventChoosePartner == 3){
                ACTIONONWORLD.dirtChoosePartner();
                int partnerNumber = ChoosePartner.nextInt();
                if(partnerNumber == 1){
                    MYPOKEMON.add(WINDOM);
                    break;
                }
                else if(partnerNumber == 2){
                    MYPOKEMON.add(DAGGER);
                    break;
                }
                else if(partnerNumber == 3){
                    break;
                }
            }
            else if(EventChoosePartner == 4){
                break;
            }
        }while(true);


        //first meet partner
        MEET.firstMeetPartner(MYPOKEMON.get(0));
        // back to main menu when complete to choose partner && set name
        boolean  check = true ;
        while(check != false){

            ACTIONONWORLD.mainMenu();
            int eventmain = 0;
            int subevent = 0;

            eventmain = EventPerson.nextInt();
            if (eventmain == 3) {
                check = false;
            }
            // show status partner
            else if (eventmain == 1){
            // for check pokrmon in bag
            int numberofpokemon = 0 ;
            int countnumofpokemon = 0;
            int eventmeetpartner = 0;
            int eventChooosetoFeed = 0;
                // SHOW STATUS CURRENT POKEMON
                while(MYPOKEMON.size() != numberofpokemon) {
                    countnumofpokemon += 1;
                    numberofpokemon += 1;
                }
                    System.out.println(" You have POKEMON : " + countnumofpokemon);
                    // main action meet partner
                    while(numberofpokemon != 0){
                        if(countnumofpokemon == 1){
                            //pass act meetPartner
                            System.out.println("TEST ");
                        }
                        else if(countnumofpokemon > 1){
                            System.out.println("Choose partner : ");
                            eventChooosetoFeed = EventPerson.nextInt();
                        }

                            while(eventmeetpartner != 4){
                                ACTIONONWORLD.meetPartner();
                                eventmeetpartner = EventPerson.nextInt();
                                    if (eventmeetpartner == 4){
                                        break;
                                    }
                                    // eat to heal hp 
                                    else if(eventmeetpartner == 1){
                                        int Feed = 200;
                                        LIFEPOKEMON.eat(MYPOKEMON.get(eventChooosetoFeed),Feed);
                                    }
                                    // commu to heal sp
                                    else if(eventmeetpartner == 2){
                                        ACTIONONWORLD.CommunicateHealSP();
                                        ACTIONONWORLD.TouchheadAct(MYPOKEMON.get(eventChooosetoFeed));
                                    }
                                    else if(eventmeetpartner == 3){
                                        String Name = ACTIONONWORLD.inputName();
                                        ACTIONONWORLD.setName(Name, MYPOKEMON.get(eventChooosetoFeed));
                                        System.out.println(" SHOW NAME " + MYPOKEMON.get(eventChooosetoFeed).Name);
                                    }
                            }
                        break;
                    }
            }
            else if(eventmain == 2){
                do{
                ACTIONONWORLD.meetPartner();
                subevent = EventPerson.nextInt();
            }while(subevent != 4);
            }
        } 
    }

  
   
}
