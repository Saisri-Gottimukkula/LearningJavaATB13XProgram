package ex_31_Generics;

public class Lab003_generic_Usage {
    public static void main(String[] args) {
        Generic g = new Generic(3);
        Generic g1 = new Generic(3.2);
        Generic g2 = new Generic(true);
        Generic g3 = new Generic("saisri");
    }
}

//T is a placeholder only -> it can be any data type
class Generic <T>{
    private T a;

    public Generic(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}