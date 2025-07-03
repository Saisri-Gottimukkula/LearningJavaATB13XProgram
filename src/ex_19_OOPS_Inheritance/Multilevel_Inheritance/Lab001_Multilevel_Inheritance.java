package ex_19_OOPS_Inheritance.Multilevel_Inheritance;

public class Lab001_Multilevel_Inheritance { //runner class
    public static void main(String[] args) {

        Grandfather gf = new Grandfather();
        gf.home();
        gf.gold();

        System.out.println("----------------");

        Father f = new Father();
        f.home(); //home is present in both father and grandfather function but this will print the father function home as we created object for father
        f.car();
        f.gold();

        System.out.println("--------------------");

        Son s = new Son();
        s.home();
        s.gold();
        s.car();
    }
}
