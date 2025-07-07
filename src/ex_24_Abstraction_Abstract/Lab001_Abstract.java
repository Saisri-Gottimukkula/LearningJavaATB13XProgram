package ex_24_Abstraction_Abstract;

public class Lab001_Abstract {
    public static void main(String[] args) {
        Car c = new Car();
        //Father f = new Father();//this is abstract in nature
        Son s = new Son();
        Father f = new Son();
        s.loan50k();
        s.loan25k();
        f.loan25k();
        f.loan50k();
    }
}

//this is a concrete class or complete class becoz we dont have abstract here
//for this we can create a object
class Car{
    void done(){
    }
}

//this is an incomplete class and we cannot create object for this
abstract class Father{
    //this is called the abstarct function
   abstract void loan50k();

    //this is a complete function
    void loan25k(){
        System.out.println("25k loan cleared");
    }
}

class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("Son cleared the 50k loan");
    }
}