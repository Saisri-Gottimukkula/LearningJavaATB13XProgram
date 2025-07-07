package ex_24_Abstraction_Abstract;

public class Lab002_Abstract {
    public static void main(String[] args) {
 /*here we dont know engine class exist (we are hiding the implementation details) and we are showing only the
 essential details*/
        Cars c = new Cars();
        c.drive();
        //Engine e = new Engine(); we cannot create engine object here we are hiding it by using abstract
    }
}


abstract class Engine{    abstract void startcar();
    abstract void stopcar();

    void checkEngine(){
        System.out.println("Everything is good!");
    }
}

class Cars extends Engine{


    @Override
    void startcar() {
        System.out.println("Starting the car");
    }

    @Override
    void stopcar() {
        System.out.println("stopping the car");
    }

    void drive(){
        startcar();
        stopcar();
        checkEngine();
    }
}

