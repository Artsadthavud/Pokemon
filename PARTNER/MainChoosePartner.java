package PARTNER;

public class MainChoosePartner {

    public static int choosemainhp(int event) {
        int ans = 0 ;
        if(event == 1){   
            InJoker infopartner = new InJoker(); 
            ans = infopartner.Injoker_hp ;
        }
        else if(event == 2){
            PA infopartner = new PA();
            ans = infopartner.PA_hp ;
        }
        else if (event == 3){
            Juggernaut infopartner = new Juggernaut();
            ans = infopartner.Juggernaut_hp ;
        }
        else if (event == 4){
            TA infopartner = new TA();
            ans = infopartner.TA_hp ;
        }
        else if (event == 5){
            Maiden infopartner = new Maiden();
            ans = infopartner.Maiden_hp ;
        }
        return ans;
    }
    public static int choosemainmana(int event) {
        int ans = 0;
        if(event == 1){
            InJoker infopartner = new InJoker(); 
            ans = infopartner.Injoker_mana ;
        }
        else if(event == 2){
            PA infopartner = new PA();
            ans = infopartner.PA_mana ;
        }
        else if (event == 3){
            Juggernaut infopartner = new Juggernaut();
            ans = infopartner.Juggernaut_hp ;
        }
        else if (event == 4){
            TA infopartner = new TA();
            ans = infopartner.TA_hp ;
        }
        else if (event == 5){
            Maiden infopartner = new Maiden();
            ans = infopartner.Maiden_hp ;
        }
        return ans;
    }

    public static int choosemaindmg(int event) {
        int ans = 0;
        if(event == 1){
            InJoker infopartner = new InJoker(); 
            ans = infopartner.Injoker_dmg ;
        }
        else if(event == 2){
            PA infopartner = new PA();
            ans = infopartner.PA_dmg ;
        }
        else if (event == 3){
            Juggernaut infopartner = new Juggernaut();
            ans = infopartner.Juggernaut_dmg ;
        }
        else if (event == 4){
            TA infopartner = new TA();
            ans = infopartner.TA_dmg ;
        }
        else if (event == 5){
            Maiden infopartner = new Maiden();
            ans = infopartner.Maiden_dmg ;
        }
        return ans;
    }
    public static int choosemainskill(int event) {
        int ans = 0;
        if(event == 1){
            InJoker infopartner = new InJoker(); 
            ans = infopartner.Injoker_skill ;
        }
        else if(event == 2){
            PA infopartner = new PA();
            ans = infopartner.PA_skill ;
        }
        else if (event == 3){
            Juggernaut infopartner = new Juggernaut();
            ans = infopartner.Juggernaut_skill ;
        }
        else if (event == 4){
            TA infopartner = new TA();
            ans = infopartner.TA_skill ;
        }
        else if (event == 5){
            Maiden infopartner = new Maiden();
            ans = infopartner.Maiden_skill ;
        }
        return ans;
    }
    public static int choosemainmanacost(int event) {
        int ans = 0;
        if(event == 1){
            InJoker infopartner = new InJoker(); 
            ans = infopartner.Injoker_skill_mana ;
        }
        else if(event == 2){
            PA infopartner = new PA();
            ans = infopartner.PA_skill_mana ;
        }
        else if (event == 3){
            Juggernaut infopartner = new Juggernaut();
            ans = infopartner.Juggernaut_skill_mana ;
        }
        else if (event == 4){
            TA infopartner = new TA();
            ans = infopartner.TA_skill_mana ;
        }
        else if (event == 5){
            Maiden infopartner = new Maiden();
            ans = infopartner.Maiden_skill_mana ;
        }
        return ans;
    }
    public static int mainlv(int event) {
        int ans = 0;
        if(event == 1){
            InJoker infopartner = new InJoker(); 
            ans = infopartner.Injokelv ;
        }
        else if(event == 2){
            PA infopartner = new PA();
            ans = infopartner.PAlv ;
        }
        else if (event == 3){
            Juggernaut infopartner = new Juggernaut();
            ans = infopartner.Juggernautlv ;
        }
        else if (event == 4){
            TA infopartner = new TA();
            ans = infopartner.TAlv ;
        }
        else if (event == 5){
            Maiden infopartner = new Maiden();
            ans = infopartner.Maidenlv ;
        }
        return ans;
    }

    public static void maindetailpart(int event) {
        
        if(event == 1){
            InJoker.infoInjoker();
        }
        else if(event == 2){
            PA.infoPA();
        }
        else if (event == 3){
            Juggernaut.infoJuggernaut();
        }
        else if (event == 4){
            TA.infoTA();
        }
        else if (event == 5){
            Maiden.infoMaiden();
           
        }
     
    }

}