package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab002 {
    public static void main(String[] args) {

        List l = new ArrayList();//Dynamic Dispatch (List is the father of arraylist)
       // ArrayList l = new ArrayList();  //we can add like this also
        l.add(34);
        l.add("saisri");
        l.add(true);

        //this is the advantage of list we can add multiple data types
        // size is not fixed

    }
}
