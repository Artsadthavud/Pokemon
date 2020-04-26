package NEWERAPOKEMON;

public class ADDBASEITEM extends NEWERAPOKEMON {
    public static void addBaseItem(){
        for (int i = 0 ; i < 10 ; i++){
        INVENTORYSYSYEM.addItemInventory("Potion");
        INVENTORYSYSYEM.addItemInventory("Mana");
        INVENTORYSYSYEM.addItemInventory("Food");
        }
    }
}