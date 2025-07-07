package ex_23_Super;

public class Lab001_super {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.Father(3));
        Son s1 = new Son();
        System.out.println(s1.Son("4BHK", 200));
    }
}

class Father{
    int money = 1000;
    String property = "3 BHK";
    int car;

    Father(){
        System.out.println(money);
        System.out.println("-------");
    }

    int Father(int car1){
       this.car = car1;
       return car1;
    }

}

class Son extends Father{
    int sonmoney = 100;

    Son(){
        System.out.println(property);
    }

    String Son(String property1, int money1){
        super.property = property1;
        this.money = money1;
        return property1 + money1;
    }
}
