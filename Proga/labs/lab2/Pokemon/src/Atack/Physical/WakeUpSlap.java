package Atack.Physical;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {

    public WakeUpSlap() {
        super(Type.PSYCHIC, 70,11);
    }
    @Override
    protected String describe() {
        return "использует специальную атаку Ice Beam";
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.1).condition(Status.FREEZE));
    }
}
