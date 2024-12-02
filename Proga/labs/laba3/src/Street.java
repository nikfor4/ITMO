import java.util.*;

public class Street {



    private static ArrayList<String> generate(ArrayList<String> actions){
        Collections.shuffle(actions);
        return actions;
    }

    protected static String active(ArrayList<String> actions){
        ArrayList<String> ans = generate(actions);
        StreetCondition condition = new StreetCondition(ans.get(0), ans.get(1), ans.get(2));
        return condition.CONDITION_1() + ", " + condition.CONDITION_2() + " и " + condition.CONDITION_3();
    }

}
