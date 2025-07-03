package ex_18_OOPS_Constructor;

public class Lab003 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2;
        new Cat();
        c1.drink();
        //c2.drink();//this will show error as c2 object is not created
        new Cat().drink();
    }
}


class Cat{
    String name;

    void drink(){
        System.out.println("cat is drinking milk");
    }
}