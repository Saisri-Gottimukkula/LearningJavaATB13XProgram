package ex_32_Collection_Framework_DSA.LIST;
/* Create an ArrayList of cities: Mumbai, Delhi, Pune.
Check if Pune is present in the list. Print a message accordingly.
(you can use If Condition to check the Pune city and you can take the City name from User)
Expected Output: Pune is in the list.*/

import java.util.ArrayList;
import java.util.List;

public class Task003 {
    public static void main(String[] args) {

        List n = new ArrayList();
        n.add("Mumbai");
        n.add("Delhi");
        n.add("Pune");
        System.out.println(n);

        if(n.contains("Pune")){
            System.out.println("Pune is in the list");
        }
        else{
            System.out.println("Pune is not in the list");
        }

    }
}
