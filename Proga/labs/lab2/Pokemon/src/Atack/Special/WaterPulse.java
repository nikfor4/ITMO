package Atack.Special;

import ru.ifmo.se.pokemon.*;

public class WaterPulse extends SpecialMove {

    public WaterPulse() {
        super(Type.WATER, 100,100);
    }

    protected String describe() {
        return "использует специальную атаку Water Pulse";
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.2).condition(Status.PARALYZE));
    }
}
