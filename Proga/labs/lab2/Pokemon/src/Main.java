import Poke.*;
import ru.ifmo.se.pokemon.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Cosmog("Cosmog", 10);
        Pokemon p2 = new Smoochum("Smoochum", 10);
        Pokemon p3 = new Eelektrik("Eelektrik", 10);
        Pokemon p4 = new Eelektross("Eelektross", 10);
        Pokemon p5 = new Tynamo("Tynamo", 10);
        Pokemon p6 = new Jynx("Jynx", 10);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
        }
    }
