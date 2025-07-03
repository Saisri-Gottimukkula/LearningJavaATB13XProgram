package ex_17_Task;

import java.util.Scanner;

public class Lab003_ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the site url domain");
        String site = sc.next();

        switch(site)
        {
            case "example.com" :
                System.out.println(" The website type is: Commercial website");
                break;
            case ("example.org") :
                System.out.println("The website type is: Non-profit organization");
                break;
            case ("example.edu") :
                System.out.println("The website type is: Educational institution");
                break;
            case ("example.gov") :
                System.out.println("The website type is: Government website");
                break;
            case ("example.net") :
                System.out.println("The website type is: Network-related website");
                break;
            case ("example.info") :
                System.out.println("The website type is: Informational website");
                break;
            case ("example.xyz") :
                System.out.println("The website type is: Unknown or other types of websites");
                break;
        }

    }
}
