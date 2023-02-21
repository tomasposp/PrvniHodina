import Models.Zlomek;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Zlomek z1 = new Zlomek(5, 3);
        Zlomek z2 = new Zlomek(8, 5);
        Zlomek z3 = new Zlomek(5, 3);



        System.out.println(z1.toString());
        if (z1.equals(z3)){
            System.out.println("z1 equals z3");

        }
        else if (z1 != z3){
            System.out.println("z1 != z3");
        }
        System.out.println("z1 společný dělitel");

    }
}