package ex_12_Functions;

public class Lab004_EX02_SumoftwoNumbers {
    public static void main(String[] args) {
        int result = sum_of_two_numbers(3,6);
        System.out.println(result);

        sum_of_two_numbers_no_return(3,8); //here we cannot call this as void will not return. we can just print this


    }
    static int sum_of_two_numbers(int a,int b){ //adding arguments -> datatype and a variable
        return a+b;
    }

    static void sum_of_two_numbers_no_return(int a,int b){ // with no return type
        System.out.println(a+b); // we can just print but not return

    }

}
