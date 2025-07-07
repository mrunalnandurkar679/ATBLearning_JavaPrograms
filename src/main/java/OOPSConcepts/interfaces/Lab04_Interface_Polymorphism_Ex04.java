package OOPSConcepts.interfaces;

public class Lab04_Interface_Polymorphism_Ex04 {
    public static void main(String[] args) {
       Playable piano = new Piano();
       Playable guitar = new Guitar();
       piano.play();
       guitar.play();

    }
}


interface Playable
{
    void play();

}

class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("Played Guitar");
    }
}

class Piano implements Playable{

    @Override
    public void play() {
        System.out.println("played Piano");
    }
}