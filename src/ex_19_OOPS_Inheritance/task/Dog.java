package ex_19_OOPS_Inheritance.task;

public class Dog extends Animal {

    void doEat(){
        System.out.println("Eating");
        super.eat();
    }
}
