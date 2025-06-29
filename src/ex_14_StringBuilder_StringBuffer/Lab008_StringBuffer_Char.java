package ex_14_StringBuilder_StringBuffer;

public class Lab008_StringBuffer_Char {
    public static void main(String[] args) {
       StringBuffer s1 = new StringBuffer("Hello");
        System.out.println(s1.charAt(2));

       s1.setCharAt(2,'t');
        System.out.println(s1);


    }
}

