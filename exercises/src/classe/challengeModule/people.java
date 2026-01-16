package classe.challengeModule;

public class People {
    //name, weight
    // método comer vai receber como parametro um outro objeto da classe food
    // classe food também vai ter o nome da comida e o peso da comida,

    double weight;
    String name;

    People(String name, double weight)
    {
        this.name = name;
        this.weight = weight;
    }

    void food(Food food)
    {
        if(food != null)
        {
            this.weight += food.weight;
        }
    }

    String presentation()
    {
        return "Hello, i am " + name + " and i have " + weight + "kg.";
    }
}
