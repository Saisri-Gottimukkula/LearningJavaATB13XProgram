package ex_32_Collection_Framework_DSA.LIST;
/*Description:Create a LinkedList and add the following numbers:
10, 20, 30, 40.
Reverse the list and print the output.
Expected Output: Reversed List: [40, 30, 20, 10]*/

import java.util.ArrayList;
import java.util.List;

public class Task002 {
    public static void main(String[] args) {

        List a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println("ArrayList: " + a);
        System.out.println("Reversed List: " + a.reversed());
    }
}
