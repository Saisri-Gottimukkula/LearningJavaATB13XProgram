package ex_10_TernaryOperator;

public class Lab003_Ternary_Ex03 {
    public static void main(String[] args) {
        //maximum number between two numbers using ternary operators
        int a=10;
        int b=20;
       // System.out.println(Math.max(a,b)); we have inbuilt function but we are not using this
        String maximum = a>b ? "a is maximum" : "b is maximum";
        System.out.println(maximum);

    }
}
