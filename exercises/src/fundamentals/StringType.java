package fundamentals;

import java.util.Scanner;

public class StringType {

    public static void main(String[] args) {

        System.out.println();

        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));


        entrada.close();
    }
}
