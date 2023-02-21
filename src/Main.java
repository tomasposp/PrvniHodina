import Models.Zlomek;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Zlomek z1 = new Zlomek(5, 3);
        Zlomek z2 = new Zlomek(8,5);

        System.out.println(z1.toString());

    }
}