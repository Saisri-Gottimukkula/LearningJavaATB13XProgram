package ex_20_OOPS_Polymorphism.method_OverRiding;

public class Lab004_method_overRiding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound(); //this will always print the method for which object is created
    }
}


class Animal{

    void sound(){
        System.out.println("Dog is barking");
    }
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("barking");
    }
}


//this is called method overriding. we used same method in different class