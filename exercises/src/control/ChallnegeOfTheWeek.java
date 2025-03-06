package control;

import java.util.Scanner;

public class ChallnegeOfTheWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("informe o número da semana: ");
        int semana = input.nextInt();

        if (semana == 1) {

            System.out.println("Domingo");
        }
        else if (semana == 2) {

            System.out.println("Segunda");
        }
        else if (semana == 3) {

            System.out.println("Terça");
        }
        else if (semana == 4){

            System.out.println("Quarta");
        }
        else if (semana == 5){

            System.out.println("Quinta");
        }
        else if (semana == 6){

            System.out.println("Sexta");
        }
        else if (semana == 7){

            System.out.println("Sabado");
        } else {

            System.out.println("Número invalido");
        }



        input.close();


    }
}
