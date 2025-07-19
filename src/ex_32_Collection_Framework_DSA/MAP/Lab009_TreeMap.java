package ex_32_Collection_Framework_DSA.MAP;

import java.util.Map;
import java.util.TreeMap;

public class Lab009_TreeMap {
    public static void main(String[] args) {

        Map<String, Integer> num = new TreeMap<>();
        num.put("Second", 2);
        num.put("Third",3);
        num.put("First", 1);

        System.out.println(num);
        //replacing the values
        num.replace("First", 12);
        num.replace("Second", 17);

        System.out.println(num);

        //remove the element

        num.remove("First");
        System.out.println(num);
    }
}


//as it is a tree map -> natural sorting is done