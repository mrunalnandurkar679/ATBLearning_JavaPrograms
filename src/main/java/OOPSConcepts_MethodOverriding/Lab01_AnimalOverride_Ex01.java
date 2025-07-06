package OOPSConcepts_MethodOverriding;

public class Lab01_AnimalOverride_Ex01 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Cow cw = new Cow();
        a.sound();
        d.sound();
        c.sound();
        cw.sound();



    }

}

class Animal
{
    void sound ()
    {
        System.out.println("animal sound");
    }
}
class Dog extends Animal
{
    @Override
    void sound() {
        super.sound();
        System.out.println("Dog makes sound : Bark");
    }
}
class Cat extends Animal
{
    @Override
    void sound() {
        super.sound();
        System.out.println("Cat makes noise:  'meow' ");
    }
}

class Cow extends Animal
{
    @Override
    void sound() {
        super.sound();
        System.out.println("Cow makes noise : 'mooooo'");
    }
}