package ex_15_Arrays;

public class Lab010_String_CLI {
    public static void main(String[] args) {
       for(int i=0; i< args.length; i++){
           System.out.println(args[i]);
       }
    }
}


//here we will give input using CLI arguments
//in place of numbers we can give string also as it is string array
//in place of args we can use any name as it is a variable