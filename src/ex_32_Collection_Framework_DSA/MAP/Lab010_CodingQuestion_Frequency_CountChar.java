package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab010_CodingQuestion_Frequency_CountChar {
    public static void main(String[] args) {

        String input = "Programming";

        Map<Character,Integer> freq = new HashMap<>();

        //P,r,o,g,r,.....
        for(char c : input.toCharArray()){ //it will go through one by one character

            //P : 1
            //r : 1+1 =2
            //o : 1
            //g : 2
            //a : 1
            //m : 2
            //i : 1
            //n : 1
            freq.put(c, freq.getOrDefault(c,0) +1);
        }

        System.out.println(freq);
    }
}
