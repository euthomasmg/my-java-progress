package fundamentals.challenge;

import java.util.Scanner;

public class CelsiusFahrenheitto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor em C°: ");
        double c = input.nextDouble();

        double formula = (c * 1.8) + 32;

        System.out.printf("C°: %.2f", formula);
    }
}
