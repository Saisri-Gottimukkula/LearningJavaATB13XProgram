package ex_12_Functions;

public class Lab002_userdefined_Functions {
    public static void main(String[] args) {
        // step 2: calling
        f1();
        name_of_the_function();
    }


        //step 1: Function definition / declaration
        static void f1() //void - it will not return anything
        {
            System.out.println("Hi");
        }

        //adding another function
        static void name_of_the_function(){
            System.out.println("hello");
        }

}
