package fundamentals;

public class StringTypes {

    public static void main(String[] args) {

        System.out.println("Hello World".charAt(6));


        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());

        String nome = "Thomas";
        String sobrenome = "Mayer Garcez";
        double salario = 2808.00;
        int idade = 21;

        //System.out.printf("O menimo %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("O menimo %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);

        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual")); //ele verifica se é verdadeiro ou falso, nesse contexto, se a fraase tem a palavra "qual"
        System.out.println("Frase qualquer".indexOf("qual")); //ele conta os caracteres até a palavra chegar
        System.out.println("Frase qualquer");


    }
}
