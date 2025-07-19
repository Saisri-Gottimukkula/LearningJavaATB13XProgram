package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab001_HashMap {
    public static void main(String[] args) {

       // Map m = new Map(); we cannot add object becoz it is incomplete class

        Map m = new HashMap();
        //map -> Key, Value pair
        //Ex: name, saisri
        //no order

        m.put("name", "saisri");
        m.put("roll.no.",123);
        m.put("phone", 78901234);
        System.out.println(m);
    }
}
//no order maintained