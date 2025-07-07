package ex_17_Task;

public class Lab007_Pali_String {
    public static void main(String[] args) {
        String palindrome = "madam";
        String reverse_palindrome = "";


        for(int i=palindrome.length()-1; i>=0; i--) {
            reverse_palindrome = reverse_palindrome + palindrome.charAt(i);
        }

        if(palindrome.equals(reverse_palindrome)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
