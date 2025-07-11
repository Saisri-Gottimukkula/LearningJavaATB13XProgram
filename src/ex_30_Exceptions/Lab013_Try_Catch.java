package ex_30_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab013_Try_Catch {
    public static void main(String[] args) {
        System.out.println("Starting");

        try {
            FileReader f = new FileReader(new File("c:/text.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

       System.out.println("End");


    }
}