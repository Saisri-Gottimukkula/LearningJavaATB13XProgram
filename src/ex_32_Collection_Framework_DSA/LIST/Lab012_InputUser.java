package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab012_InputUser {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer>  age = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String ContinueInput = "Y"; //control variable for input loop
        while(ContinueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter name");
            String name = sc.next();
            names.add(name);

            System.out.println("Enter Age");
            int age1 = sc.nextInt();
            age.add(age1);

            sc.nextLine();
            System.out.println("Do you want to add another record ? (Y/N): ");
            ContinueInput = sc.nextLine();

        }

        for(Object o1 : names){
            System.out.println(o1);
        }

        for(Object o2 : age){
            System.out.println(o2);
        }

        sc.close();
    }
}
