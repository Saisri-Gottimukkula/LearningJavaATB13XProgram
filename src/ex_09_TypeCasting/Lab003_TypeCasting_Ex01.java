package ex_09_TypeCasting;

public class Lab003_TypeCasting_Ex01 {
    public static void main(String[] args) {
        long phone = 9856734671l;
        short phone1 = (short)phone; //implicity not allowed but explicitly allowed but there will be data loss
        System.out.println(phone1);
    }
}
