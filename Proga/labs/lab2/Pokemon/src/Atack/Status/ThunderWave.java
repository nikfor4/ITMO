package Atack.Status;

import ru.ifmo.se.pokemon.*;

public class  ThunderWave  extends StatusMove {

    public ThunderWave () {
        super(Type.ELECTRIC, 0,90);
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.25).condition(Status.PARALYZE));
    }

}
