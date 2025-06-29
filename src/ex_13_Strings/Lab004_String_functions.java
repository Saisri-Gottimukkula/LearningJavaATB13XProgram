package ex_13_Strings;

public class Lab004_String_functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c); //for character we have only print method

        String value = "ABCDE";
        System.out.println(value.toUpperCase());
        System.out.println(value.toLowerCase());
        System.out.println(value.length());
        System.out.println(value.concat("EFGH"));
    }
}