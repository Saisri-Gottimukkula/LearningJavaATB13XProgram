package ex_30_Exceptions;

public class Task004 {
    public static void main(String[] args) {
        System.out.println(" case1:Generic Catch");
        String str= null;
        try {
           str =  str.toLowerCase();
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("case2:Specific Catch");
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


    }
}
