package ex_31_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab004 {
    public static void main(String[] args) {
        List NormalList = new ArrayList();
        NormalList.add(100);
        NormalList.add("saisri");
        NormalList.add(4.5);

        List <Integer> integerList = new ArrayList();
        integerList.add(10);
        //integerList.add("saisri"); we can add only integers
    }
}


//list is the collection of frameworks -> collection of  items 7, 8, saisri