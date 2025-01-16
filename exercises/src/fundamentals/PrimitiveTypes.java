package fundamentals;

public class PrimitiveTypes {

    public static void main(String[] args) {

        //tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 5678;
        long pontosAcumulados = 3_134_845_223L;

        //tipos numéricos reais
        float salario = 11_455.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //tipos booleano
        boolean estaDeFerias = false; // true

        //Tipo caractere
        char status = 'A'; //ativo

        //Dias da empresa
        System.out.println(anosDeEmpresa * 365);

        //Números de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
