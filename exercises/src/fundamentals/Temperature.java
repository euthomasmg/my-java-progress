package fundamentals;

public class Temperature {

    public static void main(String[] args){

        //(F° - 32) x 5 / 9 = C°

        final double AJUSTE = 32;
        final double FATOR = 5 / 9.0; //o .0 depois do nove, o Java entende que voce esta trabalhando com números quebrados.
        double f = 86;
        double c = (f - AJUSTE) * FATOR;

        System.out.println(c);

        f = 9;
        c = (f - AJUSTE) * FATOR;

        System.out.println(c);

    }
}
