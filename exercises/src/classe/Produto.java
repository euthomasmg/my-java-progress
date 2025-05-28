package classe;

public class Produto {

    String name;
    double price;
    double discount;

    public double precoComDesconto(double descontoDoGerente){
        return price * ( 1 - (discount + descontoDoGerente));
    }
}
