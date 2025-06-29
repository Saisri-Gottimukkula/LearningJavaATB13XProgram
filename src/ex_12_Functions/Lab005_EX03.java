package ex_12_Functions;

public class Lab005_EX03 {
        //1. without parameters and no return type
        //2. without parameters but with return type
        //3. with parameters and without return type
        //4. with parameters and with return type
        public static void main(String[] args) {

        //1. without parameters and no return type
        greet_Without_PRT();

        //2. without parameters but with return type
        String result = greet_WithoutParameters_withRT();
            System.out.println(result);

        //3. with parameters and without return type
        greet_withparameters_withoutRT(30,"vinod",5000);

        //4. with parameters and with return type
        int result1 = greet_withPara_WithRT(5,9);
            System.out.println(result1);


    }

    //1. without parameters and no return type
    static void greet_Without_PRT(){
        System.out.println("hello without return type and without parameters");
    }
    //2. without parameters but with return type
    static String greet_WithoutParameters_withRT(){
        return "Hi saisri";
    }
    //3. with parameters and without return type
    static void greet_withparameters_withoutRT(int age,String name,int salary){
        System.out.println("age is:" + age + "\nname is : " + name + "\nsalary is: " + salary);
    }

    //4. with parameters and with return type
    static int greet_withPara_WithRT(int a, int b){
            return a+b;
    }
}
