package ex_08_Do_while;

public class Lab001_Do_while_EX01 {
    public static void main(String[] args) {
        int i =0;
        do{
            System.out.println("This will print atleast one time");
            System.out.println(i);
            i++;
        }
        while(i<10);



    }
}

//while loop -> init,condition,body,updation(increment or decrement)
//if condition is false it will not execute

//do while loop -> init,body(1),condition,updation
//even condition is false, atleast once the body will execute