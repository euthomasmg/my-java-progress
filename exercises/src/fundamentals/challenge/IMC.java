package fundamentals.challenge;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inform sua altura: ");
        double height = input.nextDouble();

        System.out.print("Informe seu peso: ");
        double weight = input.nextDouble();

        double formula = weight / (Math.pow(height, 2));

        System.out.printf("Seu IMC é %.2f: ", formula);



    }
}
