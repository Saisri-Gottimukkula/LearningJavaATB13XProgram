package ex_32_Collection_Framework_DSA.MAP;
/*Program: Word Frequency Counter Using HashMap
Description:Takes a sentence and prints how many times each word appears using HashMap.
Input: "java is easy and java is powerful"
Output:
java -> 2
is -> 2
easy -> 1
and -> 1
powerful -> 1 */

import java.util.HashMap;
import java.util.Map;

public class Task001 {
    public static void main(String[] args) {

        String input = "java is easy and java is powerful";

        String[] words = input.toLowerCase().split(" ");

        Map<String, Integer> freqword = new HashMap();

        for(String word : words){

            if(freqword.containsKey(word)){
                freqword.put(word, freqword.get(word) + 1);
            } else {
                freqword.put(word, 1); // else add with count 1
            }
        }

        // Print the result
        for (String key : freqword.keySet()) {
            System.out.println(key + " -> " + freqword.get(key));
        }
    }


}
