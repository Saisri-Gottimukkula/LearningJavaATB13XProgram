package ex_29_Wrapper_Class;

public class Lab004_Conversion_String {
    public static void main(String[] args) {

        String a = "data";

        //conversion of string to wrapper

        Integer b = Integer.parseInt(a);
        Integer c = Integer.valueOf(a);

        //string to primitive

        int aa = Integer.parseInt(a);

        //wrapper to string
        System.out.println(a.toString());

        //primitive to string

        int num = 10;
        Integer num1 = num;
        System.out.println(num1.toString()); //output: "10"
    }
}
