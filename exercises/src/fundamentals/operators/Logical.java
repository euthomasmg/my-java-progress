package fundamentals.operators;

import java.sql.SQLOutput;

public class Logical {

    public static void main(String[] args) {

        boolean condition1 = true;
        boolean condition2 = 3 > 7;

        System.out.println(condition1 && !condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 ^ condition2);
        System.out.println(!!condition1);
        System.out.println(!condition2);

        System.out.println("Tabela verdade E (END)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\n Tabela verdade OR (ou )");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\n Tabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\n Tabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);


    }
}
