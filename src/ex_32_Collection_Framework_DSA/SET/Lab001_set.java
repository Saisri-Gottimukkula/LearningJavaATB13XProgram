package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab001_set {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set ls = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("saisri");
        hs.add("sai");
        hs.add("saisri"); //duplicates are not allowed in set. It will not give error but it will not store
        hs.add("apple");
        System.out.println("hashset: " + hs);//random order

        ls.add("saisri");
        ls.add("sai");
        ls.add("saisri");
        ls.add("apple");
        System.out.println("Linked Hashset: " + ls);//order is maintained

        ts.add("saisri");
        ts.add("sai");
        ts.add("saisri");
        ts.add("apple");
        System.out.println("Treeset: " + ts);//natural sorting
    }
}
