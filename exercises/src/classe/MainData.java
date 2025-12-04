package classe;

public class MainData {

    public static void main(String[] args) {

        Data data1 = new Data();

        Data data2 = new Data(20, 9, 2003);

        Data data3 = new Data(06, 12, 2004);

        data1.imprimitDataFormatada();
        data2.imprimitDataFormatada();
        data3.imprimitDataFormatada();
    }
}
