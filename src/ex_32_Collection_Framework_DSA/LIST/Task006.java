package ex_32_Collection_Framework_DSA.LIST;
/* Create a LinkedList with fruits: Apple, Banana, Mango.
Insert Orange at index 1 and print the final list.
Expected Output: Fruits List: [Apple, Orange, Banana, Mango] */

import java.util.LinkedList;
import java.util.List;

public class Task006 {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Linkedlist: " + fruits);

        fruits.add(1,"Orange");
        System.out.println("Fruits List: " + fruits);

        fruits.set(2,"Papaya");
        System.out.println("Fruits List: " + fruits);
    }
}


//add -> to add element
//set -> replace the element