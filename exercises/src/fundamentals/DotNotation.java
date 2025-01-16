package fundamentals;

public class DotNotation {

    public static void main(String[] args) {

        String s = "Bom dia X";

        s = s.replace("X", "SENHORA"); //esta subistituindo o X por SENHORA

        System.out.println(s);

        s = s.toUpperCase(); //deixa todas as letras maiúsculas

        System.out.println(s);

        s = s.concat("!!!"); //contatenar

        System.out.println(s);

        System.out.println("Meu nome é Thomas".toUpperCase()); //ele vai pegar meu valor literal e deixar tudo maiúscula

        String y = "Bom dia X".replace("X", "Thomas").toUpperCase().concat("!!!");
        System.out.println(y);

        //tipos primitivos não tem o operador "."
        int a = 3;
        //a
    }
}
