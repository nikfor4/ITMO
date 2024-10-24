package Atack.Status;

import ru.ifmo.se.pokemon.*;

public class  DoubleTeam extends StatusMove {

    public DoubleTeam() {
        super(Type.NORMAL, 0,100);
    }
    @Override
    protected String describe() {
        return "использует специальную атаку Double Team";
    }

}
