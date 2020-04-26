package NEWERAPOKEMON;


public class COMBATSYSTEM extends NEWERAPOKEMON {
 
    public static int calculateSystem(int Value, int change){
        int sum = 0;

        if(Value - change > 0) {
            sum = Value - change;
        }

        else if (Value - change < 0 || Value - change == 0) {
            sum = 0;
        }
        
        return sum;
    }
    
}   