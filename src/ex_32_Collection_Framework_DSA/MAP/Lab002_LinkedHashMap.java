package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab002_LinkedHashMap {
    public static void main(String[] args) {

        Map m = new LinkedHashMap();
        //map -> Key, Value pair
        //Ex: name, saisri
        //order maintained

        m.put("name", "saisri");
        m.put("roll.no.",123);
        m.put("phone", 78901234);
        System.out.println(m);
    }
}
//order maintained