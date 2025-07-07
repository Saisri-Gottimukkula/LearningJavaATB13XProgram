package ex_17_Task;

public class Lab006_Pali_number {
    public static void main(String[] args) {
        int num = 11211;
        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;           // get last digit
            rev = rev * 10 + digit; // build reversed number
            num = num / 10;                 // remove last digit
        }

        if(original==rev){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}
