package ex_25_Interface;

public class Lab006_Abstract_Interface {
}

abstract class Incomplete_Abstract{
    int a= 10;

    Incomplete_Abstract(){
        System.out.println("constructor");
    }
    abstract void display();
    void display1(){
        a = 25;
        System.out.println("print");
    }
}

interface Incomplete_Interface{
    int a= 10; //final

    void display();

//    Incomplete_Interface(){
//        System.out.println("constructor");
//    }

   default void display3(){
       //a=25;
        System.out.println("print");
    }
}

//in interface a is final we cant change the value but in abstract we can chnage
//we can create constructor in abstract but not in interface