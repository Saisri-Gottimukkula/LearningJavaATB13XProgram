package ex_31_Generics;

public class Lab001_generics {
    public static void main(String[] args) {
        sum(3,4);
        sum(3.2,1.2);
        sum("sai","sri");

    }


    static void sum(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
    static void sum(double a, double b) {
        System.out.println(a);
        System.out.println(b);
    }
    static void sum(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
}