package OOPSConcepts.interfaces;

public class Lab01_InterfaceImplemetClass_ex01 {
    public static void main(String[] args) {
        Document e = new Document();
        e.Print();
        e.show();

    }
}

interface Showable{
    void show();
}
interface Printable{

    void Print();
}

class Document implements Showable,Printable
{

    @Override
    public void show() {
        System.out.println("Show the Documents for verification");
    }

    @Override
    public void Print() {
        System.out.println("Print the documents for submission");

    }
}
