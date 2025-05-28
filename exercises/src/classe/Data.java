package classe;

public class Data {

    int day;
    int month;
    int year;

    String obterDataFormatada() {
        return String.format("%d/%d/%d", day, month, year);
    }

    void imprimitDataFormatada() {
        System.out.println(obterDataFormatada());
    }

}
