package control;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;

        while (i <= 1){

            System.out.print("Enquanto você não digitar 'sair' essa pergunta nunca vai parar: ");
            String palavra = input.next();

            if (palavra.equalsIgnoreCase("sair")){

                i++;
            }

        }

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){

            System.out.println("Você diz: ");
            valor = input.next();


        }





    }
}
