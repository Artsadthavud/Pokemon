package NEWERAPOKEMON;
import java.util.*;

public class NEWERAPOKEMON {
    public static void main(String[] args) {
    // add POKEMON TO WORLD
        // add FIRE POKEMON
        FIRE MURASAME = new FIRE();
            MURASAME.namePokemon("MURASAME");
            MURASAME.hpPokemon(850);
            MURASAME.spPokemon(450);
            MURASAME.dmgPokemon(120);
        FIRE ASTREY = new FIRE();
            ASTREY.namePokemon("ASTREY");
            ASTREY.hpPokemon(825);
            ASTREY.spPokemon(455);
            ASTREY.dmgPokemon(112);
        // add WATER POKEMON
        WATER GINN = new WATER();
            GINN.namePokemon("GINN");
            GINN.hpPokemon(880);
            GINN.spPokemon(500);
            GINN.dmgPokemon(110);
        WATER GOUF = new WATER();
            GOUF.namePokemon("GOUF");
            GOUF.hpPokemon(895);
            GOUF.spPokemon(460);
            GOUF.dmgPokemon(115);
        // add DIRT POKEMON
        DIRT WINDOM = new DIRT();
            WINDOM.namePokemon("WINDOM");
            WINDOM.hpPokemon(920);
            WINDOM.spPokemon(420);
            WINDOM.dmgPokemon(110);
        DIRT DAGGER = new DIRT();
            DAGGER.namePokemon("DAGGER");
            DAGGER.hpPokemon(900);
            DAGGER.spPokemon(400);
            DAGGER.dmgPokemon(111);

        System.out.println("WELLCOME TO GUNGEMON");
        System.out.print(MURASAME.getName());
    }

   
}