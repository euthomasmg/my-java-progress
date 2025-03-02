package fundamentals.challenge;

import java.util.Scanner;

public class FahrenheittoCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor em F° para converter em C°: ");
        double f = input.nextDouble();

        double conversao = f - 32;
        conversao = conversao / 1.8;

        System.out.printf("F°: %.2f", conversao );



        input.close();
    }
}
