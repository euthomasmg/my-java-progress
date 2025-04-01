package control;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar a palavra magica!");
            System.out.print("Quer sair? ");
            texto = input.next();

        } while(!texto.equalsIgnoreCase("please"));

        System.out.println("Muito bem!");

        input.close();


    }
}
