package fundamentals;

public class PrimitiveVsObject {

    public static void main(String[] args) {

        String s = new String("Texto");
        s.toUpperCase();

        // Wrappers são a versão objeto dos tipos primitivos
        int n1 = 123;
        System.out.println(n1);

        /*

        byte: 1 byte (8 bits)
        boolean: 1 byte (8 bits)
        short: 2 bytes (16 bits)
        char: 2 bytes (16 bits)
        int: 4 bytes (32 bits)
        float: 4 bytes (32 bits)
        long: 8 bytes (64 bits)
        double: 8 bytes (64 bits)

         */


    }
}
