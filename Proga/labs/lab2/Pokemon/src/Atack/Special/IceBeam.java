package Atack.Special;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {

    public IceBeam() {
        super(Type.ICE, 90,100);
    }
    @Override
    protected String describe() {
        return "использует специальную атаку Ice Beam";
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.1).condition(Status.FREEZE));
    }
}
