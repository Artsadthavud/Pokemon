package GAMEPOKEMON2;
import java.util.Random;
   

public class FIRE extends POKEMONWORLD {
    
    protected static String type = "Fire";
    protected static String StrongWith = "Dirt";
    protected static String WeakWith = "Water";

    protected static String codename;
    protected static int code;
    protected static int HP ;
    protected static int SP ;
    protected static int DAMAGE ;
    protected static int skill1 ;
    protected static int skill2 ;

    public static void simulateFight(int ranx) {
        Random ran = new Random();
        int randy = ran.nextInt(4) ;
        
        if(ranx == 2 || ranx == 3){
            if(randy >0){
                System.out.println("|\t        YOU WIN !!!           |");
            }
            else{
                System.out.println("|\t        YOU LOSE !!!          |");
            }
        }
        else if(ranx == 0 || ranx == 1){
            if(randy >1){
                System.out.println("|\t        YOU WIN !!!           |");
            }
            else{
                System.out.println("|\t        YOU LOSE !!!          |");
            }
        }
        else if (ranx == 4 || ranx == 5){
            if(randy >2){
                System.out.println("|\t        YOU WIN !!!           |");
            }
            else{
                System.out.println("|\t        YOU LOSE !!!          |");
            }
        }
    }
}



