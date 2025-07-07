package ex_26_Static;

public class Lab001_static {
    public static void main(String[] args) {
        First f = new First();
        First f1 = new First();
        First f2 = new First();
        System.out.println(First.a);
        First.a = 13;
        System.out.println(First.a);
        System.out.println(f1.a);
        System.out.println(f2.a);

        System.out.println(f1.b);
        System.out.println(f2.b);
        //System.out.println(First.b);

    }
}

class First{
    static int a = 10;

    int b = 20;
}


//if we declare any variable, method, class as static then it is common to all. no need to create object refernce
// if it is common we declare it as static
