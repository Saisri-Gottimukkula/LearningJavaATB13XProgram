package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task005 {
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> arrayList = new ArrayList<>();
        // Create a LinkedList
        List<Integer> linkedList = new LinkedList<>();

        // Measure time for ArrayList
        long startArrayTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endArrayTime = System.currentTimeMillis();
        long arrayDuration = endArrayTime - startArrayTime;

        // Measure time for LinkedList
        long startLinkedTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long endLinkedTime = System.currentTimeMillis();
        long linkedDuration = endLinkedTime - startLinkedTime;

        // Print the results
        System.out.println("ArrayList time: " + arrayDuration + " ms");
        System.out.println("LinkedList time: " + linkedDuration + " ms");
    }
}
