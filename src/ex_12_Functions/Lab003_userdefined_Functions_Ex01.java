package ex_12_Functions;

public class Lab003_userdefined_Functions_Ex01 {
    public static void main(String[] args) {
        fun1();
        funct_int();
        funct_bool();
        funct_float();
    }
    static void fun1(){
        System.out.println("void - no return type");
    }
    static int funct_int(){
        System.out.println("It will return int datatype");
        return 10; //int and 10 should match (datatype and number should match)
    }

    static boolean funct_bool(){
        System.out.println("It will return boolean datatype");
        return true;
    }
    static float funct_float(){
        System.out.println("It will return float datatype");
        return 8.09f;
    }
    static long funct_long(){
        return 89l;
    }
    static String funct_string(){
        return "saisri";
    }

}
