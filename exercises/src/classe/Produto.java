package classe;

public class Produto {

    String name;
    double price;
    double discount;

    Produto(){

    }

    //construtor

    Produto(String nomeInicial, double precoInicial, double descontoIncial){
        name = nomeInicial;
        price = precoInicial;
        discount = descontoIncial;
    }


    public double precoComDesconto(double descontoDoGerente){
        return price * ( 1 - (discount + descontoDoGerente));
    }

    public double precoComDesconto(){
        return price * ( 1 - discount);
    }
}
