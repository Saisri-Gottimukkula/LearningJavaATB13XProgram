package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab010_List {
    public static void main(String[] args) {

        List fruits1 = new ArrayList();
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Mango");
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("Kiwi");
        fruits2.add("Dragon");
        fruits2.add("Guava");
        System.out.println(fruits2);

        List Vegetables = new ArrayList();
        Vegetables.add("Brinjal");
        Vegetables.add("Potato");
        Vegetables.add("Beans");
        System.out.println(Vegetables);

        List AllTogether = new ArrayList();
        AllTogether.add(fruits1);
        AllTogether.add(fruits2);
        AllTogether.add(Vegetables);
        System.out.println(AllTogether);

        System.out.println(AllTogether.get(1));



    }
}
