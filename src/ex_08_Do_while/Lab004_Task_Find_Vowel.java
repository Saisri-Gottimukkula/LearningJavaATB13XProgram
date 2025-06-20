package ex_08_Do_while;

import java.util.Scanner;

public class Lab004_Task_Find_Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scan.next().toLowerCase().charAt(0); //we are converting it to lowercase and even if someone enters string it will take first character

        
//        if(ch =='a'||ch=='e'|| ch == 'i'||ch == 'o'||ch =='u'){
//            System.out.println("It is a Vowel");
//        } else if (!(ch>='a' && ch<='z')) {
//            System.out.println("Its not an alphabet");
//
//        } else{
//            System.out.println("It is a consonant");
//        }
//        (or)
        if(ch =='a'||ch=='e'|| ch == 'i'||ch == 'o'||ch =='u'){
            System.out.println("It is a Vowel");
        } else if ((ch>='a' && ch<='z')) {
            System.out.println("Its a consonant");

        } else{
            System.out.println("Its not an alphabet");
        }
    }
}


//any way we can use