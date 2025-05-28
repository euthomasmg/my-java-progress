package classe;

public class MainData {

    public static void main(String[] args) {

        Data data1 = new Data();

        data1.day = 20;
        data1.month = 9;
        data1.year = 2003;

        Data data2 = new Data();

        data2.year = 2004;
        data2.day = 6;
        data2.month = 12;

        System.out.println(data2.obterDataFormatada());
        System.out.println(data1.obterDataFormatada());

        data2.imprimitDataFormatada();
    }
}
