package ex_09_TypeCasting;

public class Lab004_TypeCasting_Ex02 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 0.43f;
        //int total = course + GST; //implicitly not allowed
        int total = course + (int)GST; //here there will be data loss thats why we need to be careful while selecting the datatype
        System.out.println(total);

        float total1 = (float)course + GST;
        System.out.println(total1);


    }
}

//converting string or character to integer is not compatible -> this is not type casting