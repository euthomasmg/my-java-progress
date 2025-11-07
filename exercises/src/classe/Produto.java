package classe;

public class Produto {

    String name;
    double price;
    static double discount = 0.25;

    Produto(){

    }

    //construtor

    Produto(String nomeInicial, double precoInicial){
        name = nomeInicial;
        price = precoInicial;
    }

    public double precoComDesconto(double descontoDoGerente){
        return price * ( 1 - (discount + descontoDoGerente));
    }

    public double precoComDesconto(){
        return price * ( 1 - discount);
    }

}
