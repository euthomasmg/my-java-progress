package fundamentals.challenge;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor da altura do triangulo: ");
        double height = input.nextDouble();

        System.out.print("Informe o valor da base do triangulo: ");
        double base = input.nextDouble();

        double area = (height * base) / 2;

        System.out.printf("A area do triangulo é: %.2f", area);


    }
}
