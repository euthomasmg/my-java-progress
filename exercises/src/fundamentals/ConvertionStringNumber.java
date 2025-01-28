package fundamentals;

import javax.swing.*;
import java.math.BigDecimal;

public class ConvertionStringNumber {

    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String n2 = JOptionPane.showInputDialog("Digite o primeiro número");

        System.out.println(n1 + n2);

        double number1 = Double.parseDouble(n1);
        double number2 = Double.parseDouble(n2);

        double soma = number1 + number2;
        System.out.println("Soma é " + soma);
        System.out.println("Média é " + soma / 2);


    }
}
