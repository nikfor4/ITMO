package Poke;
import Atack.Physical.WakeUpSlap;
import Atack.Special.*;
import Atack.Status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Smoochum  extends  Pokemon{
    public Smoochum(String name, int lvl){
        super(name, lvl);
        this.setType(Type.ICE);
        this.setStats(45,30,15,85,65,65);
        super.addMove(new WakeUpSlap());
        super.addMove(new DoubleTeam());
        super.addMove(new Blizzard());

    }
}
