package ex_19_OOPS_Inheritance.Hierarchial_Inheritance;

public class Lab001_HI {
    public static void main(String[] args) {
        Son1 s1 = new Son1();
        s1.home();
        s1.money();

        Son2 s2 = new Son2();
        s2.home();
        s2.money();

        Son2 s3 = new Son2();
       // s3.home1(); //son1 and son2 cannot share. only they can take from father. so this is not possible

    }
}

class Father{
    void home(){
        System.out.println("BHk2");
    }

    void money(){
        System.out.println("2 CR");
    }
}

class Son1 extends Father{
    void home1(){
        System.out.println("BHK3");
    }
}

class Son2 extends Father{
    void car(){
        System.out.println("maruthi");
    }
}