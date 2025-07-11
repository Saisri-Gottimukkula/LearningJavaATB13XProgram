package ex_27_IIB;

public class Lab002_IIB2 {
    public static void main(String[] args) {
        new A1(); //object created
    }
}

class A1{
    A1(){
        System.out.println("Default Contsructor");
    }

    {
        System.out.println("IIB 1");
    }

    {
        System.out.println("IIB 2");
    }

    static{
        System.out.println("static- i will be called first as class is laoded first");
    }

}