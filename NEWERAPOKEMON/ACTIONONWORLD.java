package NEWERAPOKEMON;


public class ACTIONONWORLD extends NEWERAPOKEMON {
   

    protected static String NamePlayer;

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
    

}
