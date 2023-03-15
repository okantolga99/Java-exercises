class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    void speak(){
        System.out.println("Animal speaking....");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    void speak() {
        System.out.println(this.name + " meows....");
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    void speak() {
        System.out.println(this.name + " barks....");
    }
}
class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(this.name + " roars....");
    }
}

public class Main {
    public static void main(String[] args) {
       Animal Animal1 = new Cat("Felix");
       Animal Animal2 = new Dog("Lily");
       Animal Animal3 = new Lion("Simba");
        Animal1.speak();
        Animal2.speak();
        Animal3.speak();

    }

    }
