package ex_24_Abstraction_Abstract.Abstract_Interface_Task;
/* Interface Constants
Objective: Demonstrate how to use constants (public static final variables) in interfaces.
Steps:
Create an interface SpeedLimit with a constant MAX_SPEED = 120.
In a class Car, access and print the constant.
Do not modify the constant—it should behave like a final value.
Expected Output:
Max Speed is: 120*/

public class Task007 {
    public static void main(String[] args) {
        Car_1 c1 = new Car_1();
        c1.showspeed_limit();
    }
}

interface SpeedLimit{
    int MAX_SPEED = 120;
}

class Car_1 implements SpeedLimit{
    void showspeed_limit(){
        System.out.println("Max Speed is: " + MAX_SPEED);
    }
}
