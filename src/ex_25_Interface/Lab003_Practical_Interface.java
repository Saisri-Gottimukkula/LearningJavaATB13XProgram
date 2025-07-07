package ex_25_Interface;

public class Lab003_Practical_Interface {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.drive();
    }
}
interface brake{
    void applybreak();
}

interface engine1{
    void startcar();
    void stopcar();
}

class Car1 implements brake,engine1{//here multiple inheritance is possible becoz both are incomplete

    @Override
    public void applybreak() {
        System.out.println("Applying brake");
    }

    @Override
    public void startcar() {
        System.out.println("Starting Car!");
    }

    @Override
    public void stopcar() {
        System.out.println("Stopping Car!");
    }

    void drive(){
        startcar();
        applybreak();
        stopcar();
    }
}