package classe;

public class AreaCirc {

    double raio; //atributo que pertence ao objeto
    static final double PI = 3.14; //atributo que pertence a classe (por conta do STATIC)

    AreaCirc(double raioInicial) {

        raio = raioInicial;
    }

    static double area(double raio){

        return raio * raio * PI;
    }
}
