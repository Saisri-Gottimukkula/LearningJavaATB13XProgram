package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab004_hashmap {
    public static void main(String[] args) {

        Map<String, Integer> vehicles = new HashMap<>();

        vehicles.put("Honda",1);
        vehicles.put("BMW",2);
        vehicles.put("I10",1);
        vehicles.put("I10",3);//if we have duplicate value, key will be replaced with latest value

       // vehicles.put(1, "suzuki"); this is not allowed as you gave string, integer

        System.out.println(vehicles.size()); //size will return key values

        for(String key: vehicles.keySet()){
            //System.out.println("Keys: " + key );
            System.out.println(key + " Values: " + vehicles.get(key));
        }

        //checking if key exist

        if(vehicles.containsKey("Honda")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //clearing the map

        vehicles.clear();
        System.out.println("after clearing the map: " + vehicles.size());



    }
}
