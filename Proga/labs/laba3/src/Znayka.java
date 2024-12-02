import java.util.ArrayList;

public class Znayka extends Character {


    public Znayka(Places places){
        super("Знайка", places);
    }


    public String Think(Places places, Boolean seem){
        this.name = "Знайке";
        ArrayList<String> actions = new ArrayList<String>();
        actions.add("волнуется");
        actions.add("клокочет");
        actions.add("кипит");
        if (seem){
        return Lot.See(Boolean.TRUE) + name + " казалось, что улица " + Street.active(actions);
        }
        else {
            return Lot.See(Boolean.TRUE) + name + " не казалось, что улица " + Street.active(actions);
        }
        }

    }


