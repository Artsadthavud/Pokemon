package NEWERAPOKEMON;

import java.util.ArrayList;

public class INVENTORYSYSYEM extends NEWERAPOKEMON {
 
    protected static ArrayList<String> INVENT = new ArrayList<String>();

    public static void addItemInventory(String name) {
        INVENT.add(name);
    }

    public static void addManyItemInventory(String name , int amount) {
        for (int i = 0 ; i != amount ; i++){
            INVENT.add(name);
        } 
       
    }

    public static void useIteminventory(String name){
        int check = 0 ;
        while(INVENT.size() != check ){
            if(INVENT.get(check) == name){
                INVENT.remove(check);
                break;
            }
            check +=1;
        }
    }

    public static int checkInventory(){
        int count = 0;
        count = INVENT.size();
        return count;
    }

    public static int checkThing(String name) {
        int count = 0 ;
        int check = 0 ;
        while(INVENT.size() != check){
            if(INVENT.get(check).equals(name)){
                count += 1;
            }
            check += 1;
        }
        return count;
    }
}   