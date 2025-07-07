package ex_24_Abstraction_Abstract.Abstract_Interface_Task;
/*Interface Polymorphism
Objective: Learn how interfaces support polymorphism – calling the same method on different implementations.
Steps:
Create an interface Playable with method play().
Create two classes: Guitar and Piano, both implement Playable.
Implement the play() method in both classes with different messages.
In main(), declare a reference of type Playable and assign it objects of Guitar and Piano one by one.
Call play() on each.
🔶 Expected Output:
Playing Guitar
Playing Piano*/

public class Task008 {
    public static void main(String[] args) {
        Playable instrument;  // Interface reference

        instrument = new Guitar(); // Assign Guitar object
        instrument.play();   // Output: Playing Guitar

        instrument = new Piano();
        instrument.play();
    }
}

interface Playable{
    void play();
}

class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable{

    @Override
    public void play() {
        System.out.println("Playing Piano");
    }
}
