package ex_32_Collection_Framework_DSA.SET;

import java.util.LinkedHashSet;

public class Lab003_Linkedhashset {
    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();

        // Linkedhashset use linkedlist mechanism to store the element (scatter everywhere)
        // order maintained
        // No duplicates
        lhs.add("Apple");
        lhs.add("Watermelon");
        lhs.add("banana");
        lhs.add("banana");
        lhs.add("dragon");
        lhs.add(null);
        lhs.add(null); //null can be added only once

        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());
        System.out.println(lhs.contains("Apple"));


    }
}


//if order need to be maintained we need to use linkedhashset