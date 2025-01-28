package fundamentals;

public class ConvertionNumberString {

    public static void main(String[] args) {

        Integer n1 = 10000;
        System.out.println(n1.toString().length()); //convertendo um int em um String
                                                    //usando o metodo .lenght para ler a quantidade de digitos que tem na String
                                                    //que só é disponível quando o "valor" é String

        int n2 = 100000;
        System.out.println(Integer.toString(n2).length()); //convertendo um valor primitivo para uma String

        System.out.println(("" + n2).length());
        System.out.println(("" + n1).length());
    }
}
