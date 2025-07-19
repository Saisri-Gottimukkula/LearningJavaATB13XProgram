package ex_32_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;

public class Lab001_Priority_queue {
    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue<>();
        q.add("Banana");
        q.add("Apple");

        System.out.println(q);

        System.out.println(q.peek()); //look in to first element
        System.out.println(q);

        System.out.println(q.poll());//will remove the first element
        System.out.println(q);
    }
}
