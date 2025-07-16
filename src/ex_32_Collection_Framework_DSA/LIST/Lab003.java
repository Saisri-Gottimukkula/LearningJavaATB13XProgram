package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab003 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(45);
        array.add("sree");
        array.add(false);

        System.out.println(array);
        System.out.println(array.size());
        System.out.println(array.isEmpty());

        /* ArrayList <T> array = new ArrayList();
        we can alaso add generic in array list  */

        /*   ArrayList <Integer> array = new ArrayList();
        It will take only integers. so when we are want generic we should be careful */

        List array1 = new ArrayList();
        System.out.println(array1.isEmpty());
    }
}
