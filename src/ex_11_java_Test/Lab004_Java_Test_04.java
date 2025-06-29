package ex_11_java_Test;

public class Lab004_Java_Test_04 {
    public static void main(String[] args){
        int original = 5;
        System.out.println("original: " + original);
        System.out.println("Pre-increment: " + (++original));
        System.out.println("Post-increment: " + (original++));
        System.out.println("value after increment: " + (original));
        System.out.println("Pre-decrement: " + (--original));
        System.out.println("Post-decrement: " + (original--));
        System.out.println("Final Value " + (original));

    }
}
