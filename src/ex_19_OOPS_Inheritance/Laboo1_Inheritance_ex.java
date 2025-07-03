package ex_19_OOPS_Inheritance;

public class Laboo1_Inheritance_ex {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold); //here son is using father gold as we inherited
        s1.bhk3();
        s1.bhk2(); //here son is using father bhk2 as we inherited
    }
}

class Father{
    int gold = 2000; //attributes of father

    void bhk2(){ //behaviour of father
        System.out.println("bhk2");
    }

}

class Son extends Father{

//    int gold = 2000; //attributes of father
//
//    void bhk2(){  //behaviour of father
//        System.out.println("bhk2");
//when we use extends keyword the attributes and behaviour which are in father class can be used in the child class

    void bhk3(){
        System.out.println("bhk3");
    }
}
