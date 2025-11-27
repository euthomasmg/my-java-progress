package classe;

public class Person {
    
    public int age;
    public String name;

    Person(int age, String name){
    
        this.age = age;
        this.name = name;

    }

    void display(){
        System.out.println("Meu nome é " + name + " e tenho " + age + " anos");
    }



}
