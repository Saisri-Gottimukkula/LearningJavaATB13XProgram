package ex_30_Exceptions;

public class Lab015_Throw {
    public static void main(String[] args) {

    }

    static void dividebyzero(int a){
        if(a == 0){
            throw new ArithmeticException("Error a == 0");
        }
    }
}


//throw -> if you want to give explicitly that something error is there