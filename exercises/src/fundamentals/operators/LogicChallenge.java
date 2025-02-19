package fundamentals.operators;

public class LogicChallenge {

    public static void main(String[] args) {

        /*Você vai ter DOIS TRBABALHOS para apresentar semana que vem,
        e esse dois trabalhos PODEM ou NÃO serem confirmados.

        trabalho na terça (V ou F)
        trabalho na quita (V ou F)

        se os DOIS trabalhos derem CERTOS (V) voocê vai comprar uma TV de 50 polegadas.
        se apenas UM dos trabalhos derem CERTOS (V) voc~e vai comprar uma TV 32 polegadas.
        e nos dois cenarios, sua familia vai tomar sorvete quando for comprar a TV de 32 ou 50 polegadas.

        e caso nenhum dos trabalhos derem certo, sua familia vai ficar em casa e não vai comprar TV
        * */

        boolean work1 = false;
        boolean work2 = false;

        boolean comprouTV50 = work1 && work2;
        boolean comprouTV32 = work1 ^ work2;
        boolean comprouSorvete = work1 || work2;

        //operador Unário!
        boolean maisSaldavel = !comprouSorvete;

        System.out.println("Comprou a TV 50\"? " + comprouTV50);
        System.out.println("Comprou a TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Mais saldavel? " + maisSaldavel);

    }
}
