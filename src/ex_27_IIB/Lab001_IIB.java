package ex_27_IIB;

public class Lab001_IIB {
    public static void main(String[] args) {
    A a = new A();
    A b = new A();
    }
}


class A {

    A() {
        System.out.println("Default Constructor");
    }

    {
        System.out.println("Hi, I'm IIB");
        System.out.println("If ypu want to execute or call something when object is created");
    }

    {
        System.out.println("Hi, I'm IIB2");
        System.out.println("If ypu want to execute or call something when object is created");

    }
    static {
        System.out.println("Hi I'm static");
    }

    static {
        System.out.println("Hi I'm static2");
    }
}

//IIB will be called when object is created. we can add multiple no. of IIB block
//static block is called only once when class is loaded