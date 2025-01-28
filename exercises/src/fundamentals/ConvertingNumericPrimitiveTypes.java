package fundamentals;

public class ConvertingNumericPrimitiveTypes {

    public static void main(String[] args) {

        double a = 1; //converção implicita
        System.out.println(a);

        float b = (float) 1.12345; //converção explícita (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; //converção explícita (CAST)
        System.out.println(d);

        double e = 1.74893217849320;
        int f = (int) e; //converção explícita (CAST)
        System.out.println(f);
    }
}
