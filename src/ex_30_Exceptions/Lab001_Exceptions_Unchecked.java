package ex_30_Exceptions;

public class Lab001_Exceptions_Unchecked {
    public static void main(String[] args) {
        System.out.println("Starting of the program");
        String input_user = args[0]; //.ArrayIndexOutOfBoundsException
        Integer a = Integer.parseInt(input_user); //.NumberFormatException
        Integer output = 100/a; //.ArithmeticException

        System.out.println(output);
        System.out.println("Ending of the program");
    }
}


//check the output by giving 0, string saisri, empty value -> you will get exceptions