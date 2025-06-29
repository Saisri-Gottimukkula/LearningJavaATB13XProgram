package ex_13_Strings;

import java.util.Scanner;

public class Lab009_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a palindrome");
        String palindrome = scan.nextLine();
        String reversed = "";

        int pali_length = palindrome.length();
        for (int i = (pali_length - 1); i >=0; --i) {
            reversed = reversed + palindrome.charAt(i);
        }

        if(palindrome.toLowerCase().equals((reversed.toLowerCase()))){
            System.out.println(palindrome + "It is a palindrome");
        }
        else{
            System.out.println(palindrome + "It is not a palindrome");
        }

    }
}
