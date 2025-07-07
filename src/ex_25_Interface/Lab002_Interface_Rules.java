package ex_25_Interface;

public class Lab002_Interface_Rules {
    public static void main(String[] args) {

    }
}

interface Polygon1{
    void getarea(int length, int breadth);

//    void completefun(){
//        //here in interface complete function is not possible
//    }

    default void complfun(){
        //but we can add complete function in interface by using default function
        System.out.println("It is possible!");
    }

    default void complfun1(){
        //we can add multiple default functions in an interface
    }

    static void compfun(){
        //we can also add complete function by using static
    }
}

class Rectangle1 implements Polygon1{

    @Override
    public void getarea(int length, int breadth) {
        System.out.println("Area of Rectangle: " + length * breadth);
    }
}

