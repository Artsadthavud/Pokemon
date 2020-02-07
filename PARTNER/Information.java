package PARTNER;
    public  class Information {
        public static void choosepartner() {
            System.out.println("\nChoose your Partner: ");
            System.out.println(" 1 : Carl The Injoker");
            System.out.println(" 2 : Mortred The Phantom Assassin");
            System.out.println(" 3 : Yanero The Juggernaut");
            System.out.println(" 4 : Lanaya The Templar Assassin");
            System.out.println(" 5 : Rylai The Crystal Maiden");
        }
        public static void mainAct() {
            System.out.println("\n 1 : BATTLE Creep");
            System.out.println(" 2 : Attack The Roshan (Recommend LV 35+)");
            System.out.println(" 3 : Rest at Fountain (Coming Soon)");
            System.out.println(" 4 : Figth with Other (Coming Soon)");
            System.out.println(" 5 : Quit the game");
            System.out.println("What do you want to do ?");   
        }
        public static void currentact(){
            System.out.println("\nWhat do you want to do ?");
            System.out.println(" 1 : Normal Hit ");
            System.out.println(" 2 : Use Skill ");
            System.out.println(" 3 : Regen MANA ");
            System.out.println(" 4 : Regen HP ");
            System.out.println(" 5 : Quit the battle ");
        }

        // status current while fight BATTLE CREEP
        public static void statucurhp(float creephp, float parthp) {
            System.out.println("\n CURRENT STATUS \n");
            System.out.print("Creep HP : ");
            System.out.println(creephp); 
            System.out.print("\nPartner HP : ");
            System.out.println(parthp);
        }
        public static void statuscurmana(float mana) {
            System.out.print("Partner MANA : ");
            System.out.println(mana);
        }
        public static void statuscurdmg(float dmg) {
            System.out.print("Partner DAMAGE : ");
            System.out.println(dmg);
        }
        public static void statuscurskillmanacost(float skill,float manacost){
            System.out.print("Partner SKILL : ");
            System.out.println(skill);
            System.out.print("Partner SKILL MANACOST : ");
            System.out.println(manacost);
        }
        public static void statuslv(int lv) {
            System.out.print("Partner LEVEL : ");
            System.out.println(lv);
        }
    
        
        // status current while ATTACK ROSHAN
        public static void statucurhpRS(float creephp, float parthp) {
            System.out.println("\n CURRENT STATUS \n");
            System.out.print("Creep HP : ");
            System.out.println(creephp); 
            System.out.print("\nPartner HP : ");
            System.out.println(parthp);
        }
        public static void statuscurmanaRS(float mana) {
            System.out.print("Partner MANA : ");
            System.out.println(mana);
        }
        public static void statuscurdmgRS(float dmg) {
            System.out.print("Partner DAMAGE : ");
            System.out.println(dmg);
        }
        public static void statuscurskillmanacostRS(float skill,float manacost){
            System.out.print("Partner SKILL : ");
            System.out.println(skill);
            System.out.print("Partner SKILL MANACOST : ");
            System.out.println(manacost);
        }
        public static void statuslvRS(int lv) {
            System.out.print("Partner LEVEL : ");
            System.out.println(lv);
        }


    }
