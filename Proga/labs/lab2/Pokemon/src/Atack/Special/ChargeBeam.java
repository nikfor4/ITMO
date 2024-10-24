package Atack.Special;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {

    public ChargeBeam() {
        super(Type.ELECTRIC, 50,90);
    }
    @Override
    protected String describe() {
        return "использует специальную атаку Charge Beam";
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.7).condition(Status.POISON));
    }
}
