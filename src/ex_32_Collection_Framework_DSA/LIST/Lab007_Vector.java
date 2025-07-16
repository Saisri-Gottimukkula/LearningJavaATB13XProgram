package ex_32_Collection_Framework_DSA.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab007_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();

        v.add(10); //0
        v.add("saisri");//1
        v.add(true);//2
        v.add(30);//3
        v.add(10);//4

        System.out.println(v);
        v.remove(3);
        System.out.println(v);

        System.out.println(v.contains(true));

        System.out.println("---------Iterator_________");

        Iterator iterator = v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Enumeration<Object> enumeration = v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }//we are not going to use this anymore
    }
}


//vector is same as arraylist. only difference is it allows multi threading

