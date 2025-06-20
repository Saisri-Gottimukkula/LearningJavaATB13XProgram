package ex_03_Increment_Decrement;

import java.sql.SQLOutput;

public class Lab001_PreIncrement {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; //preincrement - it will increment first and stores the value
        System.out.println(a);
        System.out.println(b);
    }
}
//expression and result table
//lineno. / a  / b result
//    7   / 10 / NA
//   8   /  11 / 11