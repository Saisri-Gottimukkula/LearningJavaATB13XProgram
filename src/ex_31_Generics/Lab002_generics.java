package ex_31_Generics;

public class Lab002_generics {
    public static void main(String[] args) {
        sum(3, 4);
        sum(3.2, 1.2);
        sum("sai", "sri");

    }

    static <G> G sum(G a, G b, G c) {//if it has return type we need to add like this
        System.out.println(a);
        System.out.println(b);
        return null;
    }
    static <T> void sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
    }


}


//here you can use any thing like T, S. saisri