package control;
import javax.swing.*;
import java.util.jar.JarOutputStream;

public class IfElse {

    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog("Informe o número: ");

        int n1 = Integer.parseInt(value); //converter String em Number

        if (n1 % 2 == 0) {

            System.out.println("Número par");

        }

        if (n1 % 2 == 1) {

            System.out.println("Número impar");
        }

    }
}
