package Atack.Special;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {

    public Thunder() {
        super(Type.ELECTRIC, 110,70);
    }

    protected String describe() {
        return "использует специальную атаку Thunder";
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.3).condition(Status.PARALYZE));
    }
}
