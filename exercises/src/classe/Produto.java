package classe;

public class Produto {

    String name;
    double price;
    double discount;

    double precoComDesconto(){

        return price * ( 1 - (discount));
    }
}
