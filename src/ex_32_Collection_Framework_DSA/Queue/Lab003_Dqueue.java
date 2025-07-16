package ex_32_Collection_Framework_DSA.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.*;


public class Lab003_Dqueue {
    public static void main(String[] args) {

        ArrayDeque<Integer> deck = new ArrayDeque<>();
        deck.push(2);
        deck.push(4);
        System.out.println(deck);
        Iterator iterator = deck.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
