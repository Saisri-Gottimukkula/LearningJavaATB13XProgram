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
        System.out.println(hs);
    }
}
