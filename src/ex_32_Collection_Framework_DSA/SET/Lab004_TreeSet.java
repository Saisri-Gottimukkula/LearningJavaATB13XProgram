package ex_32_Collection_Framework_DSA.SET;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab004_TreeSet {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        // Black and red tree to store the mechanism
        // order maintained, Natural sorting is done
        // Natural sorting - ASCII values
        //no duplicates

        ts.add("Apple");
        ts.add("Watermelon");
        ts.add("banana");
        ts.add("banana");
        ts.add("dragon");
        ts.add("apple");
        ts.add("Banana");

        //ts.add(null); null cannot be sorted
        //ts.add(123); treeset doesnt allow multiple datatypes becoz it cannot be sorted

        System.out.println(ts);
//        System.out.println(ts.isEmpty());
//        System.out.println(ts.size());
//        System.out.println(ts.contains("Apple"));


    }
}


//First it will store capital and then smaller