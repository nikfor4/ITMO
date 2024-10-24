package Poke;
import Atack.Physical.*;

import ru.ifmo.se.pokemon.Type;


public class Jynx  extends  Smoochum{
    public Jynx(String name, int lvl){
        super(name, lvl);
        this.setType(Type.ICE);
        this.setStats(65,50,35,115,95,95);
        super.addMove(new DoubleSlap());
    }
}
