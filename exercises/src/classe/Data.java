package classe;

public class Data {

    int day;
    int month;
    int year;

    Data(){
        day = 1;
        month = 1;
        year = 1970;
    }

    Data(int dia, int mes, int ano){
        day = dia;
        month = mes;
        year = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", day, month, year);
    }

    void imprimitDataFormatada() {
        System.out.println(obterDataFormatada());
    }


    //definir um construtor padrão e criar outro construtor que vai receber dia mes e ano como parametro
    //obs: quando for chamado o construtor padrão que a data seja 01/01/1970

}
