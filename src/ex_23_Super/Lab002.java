package ex_23_Super;

public class Lab002 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        a.Animal();
    }
}
class God{
    int gold = 100;

    void sound(){
        System.out.println("Gods!!");
    }

    God(){
        System.out.println("God Default Constructor");
    }
}
class Animal extends God{
    void sound(){
        super.sound();
        //super(); we cannot call default constructor here by using super. It should be called under another constructor only
    //constructors are called in constructors only
    }
    Animal(){
        super();
    }

   void Animal(){
        System.out.println(super.gold);

    }
}