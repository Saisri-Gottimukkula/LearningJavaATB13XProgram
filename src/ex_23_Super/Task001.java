package ex_23_Super;

/*Program 1: Access parent class constructor using super()
Program 2: Access parent class method using super
Program 3: Access parent class variable using super*/

public class Task001 {
    public static void main(String[] args) {
        Child c = new Child();
        c.childbehaviour();
        c.childgold();
    }
}

class Parent{

    int gold = 10;

    Parent(){
        System.out.println("Parent default constructor");
    }

    void behaviour(){
        System.out.println("Parent behaviour");
    }

}

class Child extends Parent{

    Child(){
        super();
    }

    void childbehaviour(){
        super.behaviour();
    }

    void childgold(){
        System.out.println(super.gold);
    }
}

//1️⃣ Call parent constructor → super();
//2️⃣ Call parent method → super.methodName();
//3️⃣ Access parent variable → super.variable;