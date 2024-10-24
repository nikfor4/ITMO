package Poke;
import Atack.Physical.*;
import Atack.Special.*;
import Atack.Status.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Eelektrik  extends  Tynamo{
    public Eelektrik(String name, int lvl){
        super(name, lvl);
        this.setType(Type.ELECTRIC);
        this.setStats(65,85,70,75,70,40);
        super.addMove(new Spark());


    }
}
