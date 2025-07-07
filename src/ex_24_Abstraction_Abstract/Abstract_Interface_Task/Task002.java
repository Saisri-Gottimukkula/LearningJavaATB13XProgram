package ex_24_Abstraction_Abstract.Abstract_Interface_Task;
/*Bank Interest Calculation
Description: Abstract class Bank with abstract method getInterestRate(). Classes SBI and HDFC implement it.
Expected Output:
SBI Interest Rate: 6.5%
HDFC Interest Rate: 7.0%*/

public class Task002 {
    public static void main(String[] args) {
        Bank b = new SBI(); //dynamic dispatch
        System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

        Bank c = new HDFC(); //dynamic dispatch
        System.out.println("HDFC Interest Rate: " + c.getInterestRate() + "%");
    }
}

abstract class Bank{
    abstract double getInterestRate();
}

class SBI extends Bank{

    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank{

    @Override
    double getInterestRate() {
        return 7.0;
    }
}