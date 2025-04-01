package control;

import java.util.Scanner;

public class ChallnegeWhile {

    public static void main(String[] args) {

        //calcular a media das notas de uma turma de 5 alunos (feito)
        //vai digitar uma nota valida de 0 a 10 (feito)
        //armazenar em uma variavel "total", e ir somando cada nota que for adicionando (feito)
        //usar uma outra variavel para ver a quantidade de notas digitadas (feito)
        //quando o usuario digitar -1 ele vai calcular a média de todas as notas digitadas e sair do programa

        Scanner input = new Scanner(System.in);

        int i = 1;
        int notasDigitadas = 0;
        double somaNotas = 0;
        double finalizar = -1;


        while (i <= 5) {

            System.out.print("Informe a nota do aluno " + i + ": ");
            double aluno = input.nextDouble();

            if (aluno == finalizar){

                break;
            }

            else if (aluno <= 10) {

                somaNotas += aluno;

                notasDigitadas++;

                i++;

            }
            else {

                System.out.println("Nota invalida!!!");
            }

        }

        System.out.println("Notas Digitadas: " + notasDigitadas);
        System.out.println("Soma das notas é: " + somaNotas);

        double media = somaNotas / notasDigitadas;

        System.out.println("Médias das notas: " + media);
    }
}
