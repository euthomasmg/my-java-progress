package classe;

public class Produto {

    String name;
    double price;
    double discount;

    Produto() {

    }

    Produto(String nomeInicial) {
        name = nomeInicial;
    }

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
