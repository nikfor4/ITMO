package Atack.Special;

import ru.ifmo.se.pokemon.*;

public class Blizzard  extends SpecialMove {

    public Blizzard() {
        super(Type.ICE, 110,70);
    }

    protected String describe() {
        return "использует специальную атаку Ice Beam";
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.1).condition(Status.FREEZE));
    }
}
