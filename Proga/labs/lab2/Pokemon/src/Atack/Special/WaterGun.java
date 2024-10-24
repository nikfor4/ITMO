package Atack.Special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class WaterGun extends SpecialMove {

    public WaterGun() {
        super(Type.WATER, 40,100);
    }
    @Override
    protected String describe() {
        return "использует специальную атаку Water Gun";
    }

}
