package ex_14_StringBuilder_StringBuffer;

public class Lab001_StringBuffer_Builder {
    public static void main(String[] args) {
        String name = "saisri";
        String name1 = new String("saisri");

        StringBuffer s1 = new StringBuffer("saisri");
        StringBuilder s2 = new StringBuilder("saisri");

        System.out.println(name);
        System.out.println(name1);
        System.out.println(s1);
        System.out.println(s2);
    }
}

//all creates string but string buffer and string builder are mutable