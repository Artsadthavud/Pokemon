package PROFILEPLAYER;
public class CalculatStatus{
    // calculate hp/LV
    public static float calculatStatushp( int currenthp,int currentlv) {
        float anshp ;
            anshp = (float)currenthp + ((float)currentlv * ((float)currenthp/12)) ;
        return anshp;
    }
    // calculate mana/LV
    public static float calculatStatusmana( int currentmana,int currentlv) {
       float ansmana ;
           ansmana = (float )currentmana + ((float )currentlv * ((float )currentmana/12)) ;
        return ansmana ;
    }
    // calculate DMG/LV
    public static float calculatStatusdmg( int currentdmg,int currentlv) {
        float ansdmg ;
            ansdmg = (float )currentdmg + ((float )currentlv * ((float )currentdmg/12)) ;
         return ansdmg ;
     }
    // calculate DMG/LV
    public static float calculatStatusskill( int currentskill,int currentlv) {
        float ansskill ;
            ansskill = (float )currentskill + ((float )currentlv * ((float )currentskill/12)) ;
         return ansskill ;
    }
   // calculate DMG/LV
    public static float calculatStatusmanacost( int currentmanacost,int currentlv) {
        float ansmanacost ;
            ansmanacost = (float )currentmanacost + ((float )currentlv * ((float )currentmanacost/12)) ;
         return ansmanacost;
    }

    // calculate curhp
    public static float curhp( Float curhp, Float creepdamage) {
        float anscurhp;
        anscurhp = curhp - creepdamage;
        return anscurhp;
    }

}

