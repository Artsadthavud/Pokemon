package NEWERAPOKEMON;

import java.util.ArrayList;

public class BAG extends NEWERAPOKEMON{
    
    static ArrayList<LIFEPOKEMON> BAG = new ArrayList<LIFEPOKEMON>();


	public static void partner(LIFEPOKEMON partner) {
        BAG.add(partner);
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
}