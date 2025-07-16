package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab002_hashset {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        // Hasing mechanism to store the element means it will have unique hashcode
        //e1->hashcode(xyz), e2->hashcode(abc)
        // No order maintained
        // No duplicates
        hs.add("Apple");
        hs.add("Watermelon");
        hs.add("banana");
        hs.add("banana");
        hs.add("dragon");
        hs.add(null);
        hs.add(null); //null can be added only once

        System.out.println(hs);
        System.out.println("----------------------");

        for(String s : hs){
            System.out.println(s);
        }
        System.out.println("-----------------");

        Iterator iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
