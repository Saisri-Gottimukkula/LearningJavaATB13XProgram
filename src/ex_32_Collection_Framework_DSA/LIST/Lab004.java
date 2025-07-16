package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab004 {
    public static void main(String[] args) {

        // List list = new ArrayList(); by default it will store capacity of 10 elements

        List list = new ArrayList(10); //we can give length directly also

        list.add("1");// 0 (all the elements are stored in the index format)
        list.add("2");// 1
        list.add("3");// 2
        list.add("4");// 3
        list.add("5");// 4
        list.add("3");// 5
        list.add("3");// 6
        list.add("saisree");// 7

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("2"));
        System.out.println(list.contains(2));

        // size -> no. of elements stored
        // Length -> total length of array

        System.out.println(list.indexOf("3"));// this will print first index of 3
        System.out.println(list.lastIndexOf("3")); //this will print last index of 3

        System.out.println(list);

        System.out.println("--------------------");

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        for(Object o: list){ //for each loop
            System.out.println(o);
        }

        list.set(2,35); //adding an element
        System.out.println(list);

        list.remove(3); //removing an element
        System.out.println(list);

        list.clear(); //we can clear the array
        System.out.println(list);



    }
}

//even after adding default capacity as 10. if we add elements the size will get increased automatically