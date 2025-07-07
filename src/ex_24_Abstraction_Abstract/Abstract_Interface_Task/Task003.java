package ex_24_Abstraction_Abstract.Abstract_Interface_Task;
/*Abstract Class with Constructor
Description: Show that abstract class can have constructor. Print message from constructor and method.
Expected Output:
Abstract class constructor called
Method from abstract class*/

public class Task003 {
    public static void main(String[] args) {
        Realconst rc = new Realconst();
        rc.construct();

    }
}

abstract class Const{
    Const(){
        System.out.println("Abstract class constructor called");
    }

    void construct(){
        System.out.println("Method from abstract class");
    }
}

class Realconst extends Const{

}
