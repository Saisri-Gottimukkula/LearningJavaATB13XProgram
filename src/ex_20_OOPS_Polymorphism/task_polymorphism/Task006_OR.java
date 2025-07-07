package ex_20_OOPS_Polymorphism.task_polymorphism;
/*Task 1: Animal Sounds
Title: Override sound behavior in subclasses
Description:
Create a base class Animal with a method sound().
Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
Create an object of each class and call sound() to see how overriding provides different outputs using the same method
name.*/

public class Task006_OR {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
        Cow c1 = new Cow();
        c1.sound();

    }
}

class Animal{
    void sound(){
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}

class Cow extends Animal{
    void sound(){
        System.out.println("Moo");
    }
}