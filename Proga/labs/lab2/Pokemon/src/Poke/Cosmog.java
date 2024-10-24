package Poke;
import Atack.Special.*;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Cosmog  extends  Pokemon{
    public Cosmog(String name, int lvl){
        super(name, lvl);
        this.setType(Type.PSYCHIC);
        this.setStats(43,29,31,29,31,37);
        super.addMove(new WaterPulse());
        super.addMove(new IceBeam());
        super.addMove(new WaterGun());
        super.addMove(new ShadowBall());

    }
}
