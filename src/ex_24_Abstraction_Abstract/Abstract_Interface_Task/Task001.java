package ex_24_Abstraction_Abstract.Abstract_Interface_Task;
/*Animal Sound - Abstract Method Implementation
Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.
Expected Output: Dog barks
Cat meows*/

public class Task001 {
    public static void main(String[] args) {
       Cat c = new Cat();
       Dog d = new Dog();
       c.makeSound();
       d.makeSound();
    }
}


abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

}