package fundamentals.challenge;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        double a = input.nextDouble();

        System.out.print("Informe o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Informe o valor de C: ");
        double c = input.nextDouble();

        double delta = (Math.pow(b, 2)) - (4 * a * c);

        System.out.printf("Delta: %.2f\n", delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: %.2f" ,x2);

        input.close();





    }
}
