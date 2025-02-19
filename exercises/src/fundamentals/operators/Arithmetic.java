package fundamentals.operators;

public class Arithmetic {

    public static void main(String[] args) {

        //int n1 = 2 + 4;
        //int n2 = (int) Math.pow(n1, 3); //potencia *é a mesma coisa que n1 elevado a 3*


        int result1, result2;

        result1 = 1 - 5;
        result2 = 2 - 7;

        int multiplicationResult = 6 * 5;
        double multiplicationResultElevation = Math.pow(multiplicationResult, 2);
        multiplicationResultElevation = (int) multiplicationResultElevation / 6;

        int multiplicationResult2 = result1 * result2;
        multiplicationResult2 = multiplicationResult2 / 2;
        double multiplicationResultElevation2 = Math.pow(multiplicationResult2, 2);

        int result = (int) multiplicationResultElevation - (int) multiplicationResultElevation2;

        double resultElevation3 = Math.pow(result, 3);
        double value = Math.pow(10, 3);

        System.out.println(resultElevation3 / value);






    }
}
