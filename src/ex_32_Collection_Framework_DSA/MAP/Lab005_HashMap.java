package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab005_HashMap {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("id1", 1);
        map.put("id1", 3);//latest one will be printed
        map.put("id2", 5);
        map.put("id3", 6);
        map.put("id4", 3);
        map.put("id5", null);
        map.put("id6", null);
        map.put(null, 102);
        map.put(null, 103);//only one null key value is allowed and it is overriden

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id5"));
        System.out.println(map.containsValue(4));

        System.out.println(map.keySet());//all keys
        System.out.println(map.values()); //all values

        System.out.println(map.get("id6"));
        System.out.println(map.remove("id2"));
        System.out.println(map);
    }
}
