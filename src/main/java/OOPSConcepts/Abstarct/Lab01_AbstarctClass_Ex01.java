package OOPSConcepts.Abstarct;

public class Lab01_AbstarctClass_Ex01 {
    public static void main(String[] args) {
       Dog d = new Dog() ;
       d.makesound();
       Cat c = new Cat ();
        c.makesound();
        Animal a = new Dog();
        //Class Animal is an Abstract class so we can create a refernce object by using Subclass
        // we can call concrete method os Abstarct class with teh child class object refrence
        a.legs();  // concrete method of the Abstratc class
        a.makesound();  //this is Abstract method of Parent class but same method called in child class
        //hence it will call child class concrete method only.
    }
}

abstract class Animal
// animal is a Abstratc class and it contains ABstarct method
// if the same method has to extend into the child class which is a concrete class then we need to override same method and make it concrete
        {
            public abstract void makesound();
            void legs()
            {
                System.out.println("Animal can vary with legs");
            }
                }

                class Dog extends Animal
                {
                    @Override
                    public void makesound() {
                        System.out.println("Dog make sound bow bow");
                    }
                }

                class Cat extends Animal{

                    @Override
                    public void makesound() {
                        System.out.println("cat makes sound meow meow");
                    }
                }
