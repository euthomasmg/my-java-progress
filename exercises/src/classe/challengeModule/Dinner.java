package classe.challengeModule;

public class Dinner {
    
    public static void main(String[] args) {
        
        Food f1 = new Food(0.223, "Rice");
        Food f2 = new Food(0.340, "Potato");

        People p = new People("Thomas", 79.8);

        System.out.println(p.presentation());
        
        p.food(f1);

        System.out.println(p.presentation());

        p.food(f2);

        System.out.println(p.presentation());
    }
}
