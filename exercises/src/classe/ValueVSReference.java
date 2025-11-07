package classe;

public class ValueVSReference {

    public static void main(String[] args) {

       double a = 2;
       double b = a; //atribuição por valor (tipo primitivo)

       a++;
       b--;

        System.out.println(a + " " + b);

        Data data1 = new Data(1, 6, 2025);
        Data data2 = data1; //atribuição por referencia (objeto)

        data1.day = 31;
        data2.month = 12;
        data1.year = 2025;
  
        System.out.println(data1.obterDataFormatada());
        System.out.println(data1.obterDataFormatada());
    }

    static void voltarDataParaValorPadrao(Data day){

        
        day.day = 1;
    }
}
