package ex_10_TernaryOperator;

public class Lab007_NestedTernary2 {
    public static void main(String[] args) {
        //maximum between three numbers
        int a = 2;
        int b = 9;
        int c = -11;
        String result = (a > b) ? "a is max" : ((b > c) ? "b is max" : "c is max");
        System.out.println(result);


    }
}
