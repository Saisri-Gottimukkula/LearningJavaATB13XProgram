package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;

public class Task001 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("Diapk");
        array.add("Ravi");
        array.add("Sneha");
        array.add("Priya");
        array.add("Anjali");
        System.out.println("ArrayList is: " + array);

        Iterator i = array.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("----------------------------");
        //Task002 - use removal

        ArrayList array1 = new ArrayList();
        array1.add("Amit"); //0
        array1.add("Neha");//1
        array1.add("Suresh");//2

        System.out.println("Arraylist is: " + array1);
        array1.remove(1);
        System.out.println("new Arraylist: " + array1);


    }
}
