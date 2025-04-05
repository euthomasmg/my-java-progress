package control.challenge;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double value = input.nextDouble();

        if (value >= 0 && value <= 10){

            if (value % 2 == 0) {

                System.out.print("Número esta entre 0 e 10 e é par");
            } else {

                System.out.print("Número esta entre 0 e 10 e não é par");
            }
        }
        else {

            System.out.println("Número informado não esta entre 0 e 10 e não é par");

        }
    }
}
