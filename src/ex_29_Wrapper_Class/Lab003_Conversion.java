package ex_29_Wrapper_Class;

public class Lab003_Conversion {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; /* Here we are converting datatype to wrapper class. when we convert
        from small to big value automatically JVM will do this is called Boxing*/

        //Primitive to Wrapper (Auto boxing)

        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);

        Integer b1 = 90;
        int c = b1;//this is called unboxing wrapper is removed
        System.out.println(c);
    }
}


//wrapper can be done to same datatypes like int to Integer