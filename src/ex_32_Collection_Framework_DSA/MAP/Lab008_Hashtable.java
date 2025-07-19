package ex_32_Collection_Framework_DSA.MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab008_Hashtable {
    public static void main(String[] args) {
        //key, value null values allowed
        //Synchronised, slow and legacy class, thread safe

        Map<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1,"ht1");
        ht1.put(1, "ht2"); //duplicates not allowed,it will override
        ht1.put(2, "ht3");
        ht1.put(3, "ht4");
        ht1.put(4, "ht5");

        // ht1.put(5, null);//it will not allow null value
        // ht1.put(null, "ht6); //it will not allow null key
        System.out.println(ht1);

        //since hashtable is legacy class, enumeration is also allowed
        //only in hashtable

        Enumeration<Integer> e = ((Hashtable<Integer, String>) ht1).keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }



        Map<Integer, String> ht2 = new HashMap<>();
        ht2.put(1,"ht1");
        ht2.put(1, "ht2"); //duplicates not allowed,it will override
        ht2.put(2, "ht3");
        ht2.put(3, "ht4");
        ht2.put(4, "ht5");
        ht2.put(5,null);
        ht2.put(null, "ht6");
        ht2.put(null, null);
        System.out.println(ht2);

    }
}
