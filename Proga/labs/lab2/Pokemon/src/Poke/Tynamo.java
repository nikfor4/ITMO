package Poke;
import Atack.Special.*;

import Atack.Status.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Tynamo  extends  Pokemon{
    public Tynamo(String name, int lvl){
        super(name, lvl);
        this.setType(Type.ELECTRIC);
        this.setStats(35,55,40,45,40,60);
        super.addMove(new ThunderWave());
        super.addMove(new ChargeBeam());


    }
}
