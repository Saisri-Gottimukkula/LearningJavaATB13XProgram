package ex_14_StringBuilder_StringBuffer;

public class Lab005_StringBuilder_StringBuffer_Functions {
    public static void main(String[] args) {
       StringBuilder s1 = new StringBuilder("Hello");
       s1.append("World");
       System.out.println(s1);

       s1.delete(1,3); //delete the characters from 1 to 3
        System.out.println(s1);

        s1.replace(5,7,"sss");//replace 5 to 7 characters with "sss"
        System.out.println(s1);


    }
}

