package ex_13_Strings;

public class Lab003_Immutable {
    public static void main(String[] args) {
       String one = "Hello";
      // one.concat("World");
       one = one.concat("World");//concat adds or merges the value
        System.out.println(one);

    }
}