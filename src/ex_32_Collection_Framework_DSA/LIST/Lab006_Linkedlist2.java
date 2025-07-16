package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab006_Linkedlist2 {
    public static void main(String[] args) {

        List<String> Animals = new LinkedList(); //only strings can be stored
        Animals.add("Lion");
        Animals.add("Tiger");
        Animals.add("Elephants");
        Animals.add("Cheetah");
        Animals.add("Deer");

        System.out.println("Linkedlist: " + Animals);

        System.out.println("First Element: " + Animals.getFirst());
        System.out.println("Second Element: " + Animals.getLast());

        Animals.removeFirst();
        System.out.println("After removing first: " + Animals);

        Animals.removeLast();
        System.out.println("After removing last: " + Animals);

        System.out.println(Animals.size());

    }
}
