package fundamentals.challenge;

import java.util.Scanner;

public class SquareCube {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.print("Informe o valor de n1: ");
        double n1 = input.nextDouble();

        double cube = Math.pow(n1, 3);

        double square = Math.pow(n1, 2);

        System.out.printf("Quadrado: %.2f\n", square);
        System.out.printf("Cubo: %.2f", cube);

        input.close();

    }
}
