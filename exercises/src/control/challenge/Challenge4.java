package control.challenge;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {

        /*
        Criar um programa que receba um número e diga se ele é um número primo.
        Depois, refatore-o usando switch/case em vez de if.
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

        switch (contadorDeDivisores) {
            case 2:
                System.out.println("É primo!");
                break;
            default:
                System.out.println("Não é primo!");
                break;
        }

        input.close();
    }
}
