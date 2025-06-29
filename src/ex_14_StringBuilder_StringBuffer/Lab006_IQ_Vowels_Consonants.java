package ex_14_StringBuilder_StringBuffer;

import java.util.Scanner;

public class Lab006_IQ_Vowels_Consonants {
    public static void main(String[] args) {
        //count no. of vowels and consonants
        int vowel = 0;
        int consonant = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        String input = scan.next();
        input =  input.toLowerCase();
        System.out.println(input);

        for(int i = 0; i<input.length();i++){
            char ch = input.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                vowel++;
            }
            else{
                consonant++;
            }
        }

        System.out.println("vowels :" + vowel);
        System.out.println("consonants: " + consonant);
    }
}

//spaces also considered as consonants