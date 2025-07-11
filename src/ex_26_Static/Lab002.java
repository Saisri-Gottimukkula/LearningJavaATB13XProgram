package ex_26_Static;

public class Lab002 {
    public static void main(String[] args) {
        A1 var = new A1(12);
        A1 var2 = new A1(14);
        System.out.println(A1.b);
        System.out.println(var.a);
        System.out.println(var2.a);
        System.out.println(var.b);
        System.out.println(var2.b);

        var.display();
        var2.display();
        A1.staicmethod();

    }
}


class A1{
    int a = 10; //non static - instance variable
    static int b = 20; //static variable

    A1(int a){
        this.a = a;
    }

    void display(){
        System.out.println(this.a);
        System.out.println(b); //static variables in the instance methods are allowed
    }

    static void staicmethod(){
        System.out.println("static method");
        //System.out.println(this.a); static method cannot access the non static varaible
        System.out.println(b); //static variables can be accessed in static methods
    }
    static class C{
        // we never use this static class in automation because we dont want to share all the cases
    }
}