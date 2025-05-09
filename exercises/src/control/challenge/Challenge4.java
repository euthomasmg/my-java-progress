package control.challenge;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {

        /*
        Criar um programa que receba um número e diga se ele é um número primo.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int n1 = input.nextInt();

        int contadorDeDivisores = 0;

        for (int i = 1; i <= n1; i++) {

            if (n1 % i == 0) {

                contadorDeDivisores++;
            }
        }

        if (n1 < 2 || contadorDeDivisores > 2) {
            System.out.println("Não é primo!");
        } else {
            System.out.println("É primo!");
        }

        input.close();

    }
}
