package ex_09_TypeCasting;

public class Lab002_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int value = 300;
       // byte b = value;//narrowing int to byte -> implicit narrowing is not allowed
        byte b1 = (byte)value;//narrowing ->explicit casting
        //explict narrwoing is allowed but there will be a dataloss
        System.out.println(b1);
    }
}
