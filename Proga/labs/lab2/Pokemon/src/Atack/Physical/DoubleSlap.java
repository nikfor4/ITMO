package Atack.Physical;

import ru.ifmo.se.pokemon.*;

public class DoubleSlap extends PhysicalMove {

    public DoubleSlap() {
        super(Type.NORMAL, 15,85);
    }
    @Override
    protected String describe() {
        return "использует специальную атаку Ice Beam";
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.1).condition(Status.NORMAL));
    }
}
