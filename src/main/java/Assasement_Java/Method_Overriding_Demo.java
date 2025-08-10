package Assasement_Java;

public class Method_Overriding_Demo {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        p.dispaly();
        c.display();

    }
}

class Parent
{
    void dispaly()
    {
        System.out.println("Parent class display method ");
    }
}

class Child extends  Parent
{
    void display()
    {
        System.out.println( "Child class display method");
    }
}
