package classe;

public class MainProduto {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89, 0.25);

        var p2 = new Produto();
        p2.name = "Black Pen";
        p2.price = 12.56;
        p2.discount = 0.29;

        System.out.println(p2.name);
        System.out.println(p1.name);

        double priceFinal1 = p1.precoComDesconto();
        double priceFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (priceFinal2 + priceFinal1) / 2;

        System.out.println(priceFinal1);
        System.out.println(priceFinal2);
        System.out.printf("Média do carrihno = R$%.2f\n", mediaCarrinho);

        System.out.println(Produto.pi);
    }
}
