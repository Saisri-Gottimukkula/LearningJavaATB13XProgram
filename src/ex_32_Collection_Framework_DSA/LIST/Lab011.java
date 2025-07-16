package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab011 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(90);
        marks.add(100);
        marks.add(30);
        marks.add(68);
        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.reverse(marks);
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);


    }
}

//Collection - Interface
//Collection - Class -> it contains complete method which set,queue,List