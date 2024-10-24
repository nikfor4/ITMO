package Poke;
import Atack.Physical.*;
import Atack.Special.*;
import Atack.Status.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Eelektross  extends  Eelektrik{
    public Eelektross(String name, int lvl){
        super(name, lvl);
        this.setType(Type.ELECTRIC);
        this.setStats(85,115,80,105,80,50);
        super.addMove(new Spark());


    }
}
