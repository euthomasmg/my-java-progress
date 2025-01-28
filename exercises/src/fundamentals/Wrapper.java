package fundamentals;

import javax.crypto.spec.ChaCha20ParameterSpec;
import java.util.Scanner;

public class Wrapper {

    public static void main(String[] args) {

        // byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("10000"); //converte uma String para um número inteiro.
        Long l = 10000L;

        // para converter para tipos primitivos, basta tirar a letra maiúscula da variavel.

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);

        Float f = 123.10F;
        System.out.println(f);

        Boolean bo = Boolean.parseBoolean("true"); //converter uma String pra um valor boolean
        System.out.println(bo);

        Character c = '#';
        System.out.println(c + "...");

    }
}
