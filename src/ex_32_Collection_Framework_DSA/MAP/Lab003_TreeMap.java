package ex_32_Collection_Framework_DSA.MAP;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab003_TreeMap {
    public static void main(String[] args) {

        Map m = new TreeMap();
        //map -> Key, Value pair
        //Ex: name, saisri
        //Natural sorting based on key

        m.put("phone", 78901234);
        m.put("name", "saisri");
        m.put("roll.no.",123);



        System.out.println(m);
    }
}
