package ex_19_OOPS_Inheritance.task;

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.doEat();
    }
    protected void eat(){
        System.out.println("Animal is eating");
    }
}
