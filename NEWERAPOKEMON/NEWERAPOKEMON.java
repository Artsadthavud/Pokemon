package NEWERAPOKEMON;
import java.util.*;
public class NEWERAPOKEMON {
    public static void main(String[] args) {
        ArrayList<LIFEPOKEMON> MYPOKEMON = new ArrayList<LIFEPOKEMON>();
    // add POKEMON TO WORLD
        
        // add FIRE POKEMON
        LIFEPOKEMON MURASAME = new FIRE();
            MURASAME.namePokemon("MURASAME");
            MURASAME.hpPokemon(850);
            MURASAME.spPokemon(450);
            MURASAME.dmgPokemon(120);
            
        LIFEPOKEMON ASTREY = new FIRE();
            ASTREY.namePokemon("ASTREY");
            ASTREY.hpPokemon(825);
            ASTREY.spPokemon(455);
            ASTREY.dmgPokemon(112);
           
        // add WATER POKEMON
        LIFEPOKEMON GINN = new WATER();
            GINN.namePokemon("GINN");
            GINN.hpPokemon(880);
            GINN.spPokemon(500);
            GINN.dmgPokemon(110);
            
        LIFEPOKEMON GOUF = new WATER();
            GOUF.namePokemon("GOUF");
            GOUF.hpPokemon(895);
            GOUF.spPokemon(460);
            GOUF.dmgPokemon(115);
           
        // add DIRT POKEMON
        LIFEPOKEMON WINDOM = new DIRT();
            WINDOM.namePokemon("WINDOM");
            WINDOM.hpPokemon(920);
            WINDOM.spPokemon(420);
            WINDOM.dmgPokemon(110);
           
        LIFEPOKEMON DAGGER = new DIRT();
            DAGGER.namePokemon("DAGGER");
            DAGGER.hpPokemon(900);
            DAGGER.spPokemon(400);
            DAGGER.dmgPokemon(111);

        Scanner NamePerson = new Scanner(System.in);
        Scanner EventPerson = new Scanner(System.in);

        System.out.println("WELLCOME TO GUNGEMON");
          // sign name player
        System.out.println("PLEASE ENTER YOUR NAME");
        String NamePerSon = NamePerson.next();
        System.out.println(" Choose Your Partner");

          do{ ACTIONONWORLD.choosePartner();
           Scanner ChoosePartner = new Scanner(System.in);
            int EventChoosePartner = ChoosePartner.nextInt();
            if(EventChoosePartner == 1){
                System.out.println("Choose your Partner");
                System.out.println("1 : MURASAME ");
                System.out.println("2 : ASTREY");
                System.out.println("3 : Back");
                int partnerNumber = ChoosePartner.nextInt();
                if(partnerNumber == 1){
                    MYPOKEMON.add(MURASAME);
                    System.out.println(MURASAME.getName());
                }
                else if(partnerNumber == 2){
                    MYPOKEMON.add(ASTREY);
                }
                else if(partnerNumber == 3){
                    break;
                }
            }
            else if(EventChoosePartner == 2){
                System.out.println("Choose your Partner");
                System.out.println("1 : GINN ");
                System.out.println("2 : GOUF");
                System.out.println("3 : Back");
                int partnerNumber = ChoosePartner.nextInt();
                if(partnerNumber == 1){
                    MYPOKEMON.add(GINN);
                }
                else if(partnerNumber == 2){
                    MYPOKEMON.add(GOUF);
                }
                else if(partnerNumber == 3){
                    break;
                }
            }
            else if(EventChoosePartner == 3){
                System.out.println("Choose your Partner");
                System.out.println("1 : WINDOM ");
                System.out.println("2 : DAGGER");
                System.out.println("3 : Back");
                int partnerNumber = ChoosePartner.nextInt();
                if(partnerNumber == 1){
                    MYPOKEMON.add(WINDOM);
                }
                else if(partnerNumber == 2){
                    MYPOKEMON.add(DAGGER);
                }
                else if(partnerNumber == 3){
                    break;
                }
            }
            else if(EventChoosePartner == 4){
                break;
            }
        }while(true);
        boolean  check = true ;
        while(check = true){
            System.out.println("MAIN MENU ");
            
            System.out.println(" 1 : Status");
            System.out.println(" 3 : Quit");
            int eventmain = 0;
            eventmain = EventPerson.nextInt();
            if (eventmain == 3) {
                check = false;
            }
            else if (eventmain == 1){
            }
        } 
    }

   
}
