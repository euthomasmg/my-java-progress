package classe;

public class MainData {

    public static void main(String[] args) {

        Data data1 = new Data();

        data1.day = 20;
        data1.month = "Setembro";
        data1.year = 2003;

        var data2 = new Data();

        data2.year = 2004;
        data2.day = 6;
        data2.month = "Dezembro";

        System.out.println(data2.year);
    }
}
