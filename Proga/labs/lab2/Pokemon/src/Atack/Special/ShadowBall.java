package Atack.Special;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {

    public ShadowBall() {
        super(Type.GHOST, 80,100);
    }
    @Override
    protected String describe() {
        return "использует специальную атаку Shadow Ball";
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.2).condition(Status.BURN));
    }
}
