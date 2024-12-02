//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character Dmitry = new Character("Дмитрий", Places.PAVEMENTS);
        Znayka Znayka = new Znayka(Places.STREET);
        Shorties Shorties = new Shorties(Places.PAVEMENTS);

        System.out.print(Shorties.Sprinkle());
        System.out.print(" ");
        int rand = (int) (Math.random() * 1);
        if (rand == 1){
            System.out.println(Znayka.Think(Places.STREET,Boolean.TRUE));
        }
        else {
            System.out.println(Znayka.Think(Places.STREET,Boolean.FALSE));
        }

    }
}