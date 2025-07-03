package ex_19_OOPS_Inheritance.Multilevel_Inheritance;

public class Lab002_Multilevel_validobjects {
    public static void main(String[] args) {

        Father s1 = new Son();
        s1.gold();

        Grandfather f1 = new Grandfather();
        f1.home();

        Grandfather s2 = new Son();
        s2.home();

        Son amit = new Son();
        amit.gold();

        //invalid objects

//        Son s3 = new Father();
//        Father f2 = new Grandfather();

    }
}
