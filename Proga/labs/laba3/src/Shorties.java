import java.util.ArrayList;

public class Shorties extends Character {

    public Shorties(Places places) {
        super("коротышки", places);
    }
    public String Fill(){
        ArrayList<String> actions = new ArrayList<String>();
        actions.add("тротуары");
        actions.add("мостовые");
        actions.add("дороги");
        return name + " заполнили все " + Street.active(actions);
    }
    public String Sprinkle(){

        String[] place  = {"домов", "небытия", "неба"};
        int place_num = (int) (Math.random() * 3);

        String[] speed  = {"Уже", "Скоро", "Только"};
        int speedNum = (int) (Math.random() * 3);

        return speed[speedNum] + " высыпавшиеся с " + place[place_num] + " " + Fill() + ".";

    }
}
