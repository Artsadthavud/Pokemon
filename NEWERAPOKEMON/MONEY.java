package NEWERAPOKEMON;

public class MONEY extends NEWERAPOKEMON{

    protected static int Money = 1000;

    public static void updateMoney(int Money){
        MONEY.Money = Money + MONEY.Money ;
    }

    public static int getMoney() {
        return Money;
    }


}