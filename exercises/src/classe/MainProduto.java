package classe;

public class MainProduto {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto();
        p2.name = "Black Pen";
        p2.price = 12.56;

        Produto.discount = 0.29;

        System.out.println(p2.name + " " + p1.precoComDesconto());
        System.out.println(p1.name);
        System.out.println(Produto.discount);

    }
}
