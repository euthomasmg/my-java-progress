package fundamentals.operators;

public class Assignment {

    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b
        c -= a; // c = c - a
        c *= b; // c = c * b
        c /= a; // c = c / a

        c++; // c = c + 1

        System.out.println(c);

        c %= 2; // c = c % 2; 0 ou 1 (% = resto da divisão)

        System.out.println(c);
    }
}
