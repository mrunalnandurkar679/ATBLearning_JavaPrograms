package Assasement_Java;



public class Animal_sounds
{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();


    }

}

class Animal
{
    void sound()
    {
        System.out.println("make sound");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog makes sound bow bow");
    }

}

class Cat extends Animal
{
    void sound ()
    {
        System.out.println("cat makes noise meow meow");
    }

}
