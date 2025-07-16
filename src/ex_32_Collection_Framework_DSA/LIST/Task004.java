package ex_32_Collection_Framework_DSA.LIST;
/*  In this program, you’ll compare how fast Java can add elements to an ArrayList versus a LinkedList.
You will:
Create two separate lists: one ArrayList and one LinkedList.
Add 100,000 numbers (from 0 to 99,999) to each list using a loop.
Use System.currentTimeMillis() to measure how much time it takes to add the elements.
Print the time taken for both lists.
Hint :-
System.currentTimeMillis() gives you the current time in milliseconds.
Subtract the end time from the start time to get the duration.
You don’t need to print all the 100,000 numbers, just print the time taken.
Expected Output:
ArrayList time: 8 ms
LinkedList time: 12 ms */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task004 {
    public static void main(String[] args) {
        List array = new ArrayList();
        List linked = new LinkedList();

        long startArrayTime = System.currentTimeMillis();

        for(int i=0; i<=99999; i++){
            array.add(i);
        }

        long endArrayTime = System.currentTimeMillis();
        long timetaken = endArrayTime - startArrayTime;


        //Linkedlist time

        long startLinkedTime = System.currentTimeMillis();

        for(int i=0; i<=99999; i++){
            linked.add(i);
        }

        long endLinkedTime = System.currentTimeMillis();
        long timetakenlinked = endArrayTime - startArrayTime;

        System.out.println("ArrayList time: " + timetaken + "ms");
        System.out.println("LinkedList time: " + timetakenlinked + "ms");
    }
}
