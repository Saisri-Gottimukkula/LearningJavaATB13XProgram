package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.*;

public class Lab007_Map_Iterate {
    public static void main(String[] args) {

        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "saisri");
        student1.put("Roll.no", 2);
        student1.put("Phone", 67890345678l);
        student1.put("Adress1", "Hyderabad");
        student1.put("Address2", 678954);

        for(Map.Entry<String, Object> item: student1.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}