package ex_32_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab009_Vector {
    public static void main(String[] args) {

        Vector<String> vect = new Vector<>();
        vect.add("Item1");
        vect.add("Item2");
        vect.add("Item3");
        vect.add("Item4");
        vect.add("Item5");
        System.out.println(vect);

        //list iterator is available only in list

        ListIterator iterator = vect.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------");
        //hasprevious will print in reverse elements

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println("-------------------------------");

        Iterator iterator2 = vect.listIterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
