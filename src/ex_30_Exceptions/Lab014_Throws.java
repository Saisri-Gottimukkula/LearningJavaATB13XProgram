package ex_30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab014_Throws {
    public static void main(String[] args) {

    }
    static void file1() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("c://text.txt");
    }
}

//Throws is used with methods
//try-catch is used with block