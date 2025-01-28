package fundamentals;

import javax.swing.*;
import java.util.Scanner;

public class ConversionChallenge {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Me informe seus ultimos 3 salarios");
        String n1 = entry.nextLine().replace(",", ".");
        String n2 = entry.nextLine().replace(",", ".");
        String n3 = entry.nextLine().replace(",", ".");

        double number1 = Double.parseDouble(n1);
        double number2 = Double.parseDouble(n2);
        double number3 = Double.parseDouble(n3);

        double media = (number1 + number2 + number3) / 3;

        System.out.printf("A média do salario é R$%.2f", media);

        entry.close();

    }
}
