package ex_25_Interface;

public class Lab004_Interface_Multiple_Inheritance {
    public static void main(String[] args) {
        SonA son = new SonA();
        son.money();
    }


}

interface FatherA{
    void money();
}

interface FatherB{
    void money();
}

class SonA implements FatherA,FatherB{

    @Override
    public void money() {
        System.out.println("Son has his own money");
    }
}