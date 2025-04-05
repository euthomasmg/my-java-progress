package control.challenge;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = input.nextInt();

        if (ano % 4 == 0) {

            if (ano % 100 == 0 ) {

                System.out.println("Ano é Bicesto:");
            }
            else
            {
                System.out.println("Ano não é bicesto, porem é divisivel por 4");
            }

        }
        else
        {
            System.out.println("Ano não é bicesto!!");
        }


    }
}
