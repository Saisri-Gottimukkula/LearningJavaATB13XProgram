package ex_10_TernaryOperator;

public class Lab001_Ternary_Ex01 {
    public static void main(String[] args) {
        //age to vote
        int age = 10;
        String canIVote = age>18 ? "yes" : "No";
        System.out.println(canIVote);
    }
}

//Ternary - same like if else
//it works on condition
//syntax  result = condition ? expression1 : expression2;
//if it is true expression1
//if it is false expression 2