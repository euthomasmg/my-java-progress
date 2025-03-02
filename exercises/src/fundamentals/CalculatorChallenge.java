package fundamentals;

import java.util.Scanner;

public class CalculatorChallenge {

    public static void main(String[] args) {

        //ler número 1
        //ler número 2
        // + - * / %

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de n1: ");
        double n1 = input.nextDouble();

        System.out.print("Informe o valor de n2: ");
        double n2 = input.nextDouble();

        System.out.print("Escolha um operador (+ - * / %): ");
        String operador = input.next(); //pegar o valor que vai ser informado e colocar dentro da Variavel

        double resultado = "+".equals(operador) ? n1 + n1 : 0;
        resultado = "-".equals(operador) ? n1 - n1 : resultado;
        resultado = "*".equals(operador) ? n1 * n1 : resultado;
        resultado = "/".equals(operador) ? n1 / n1 : resultado;
        resultado = "%".equals(operador) ? n1 % n1 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f ", n1, operador, n2, resultado);


        input.close();

    }
}
