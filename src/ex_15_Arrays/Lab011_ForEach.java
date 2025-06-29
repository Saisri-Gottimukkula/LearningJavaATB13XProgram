package ex_15_Arrays;

public class Lab011_ForEach {
    public static void main(String[] sai) {
       for(int i=0; i< sai.length; i++){
           System.out.println(sai[i]);
       }

        System.out.println("--------------------");

       for(String arg : sai){
           System.out.println(arg);
        }
    }
}


//for-each loop (also called enhanced for loop) is used to iterate over elements of arrays or collections (like ArrayList, HashSet, etc.) in a simple and readable way,
// especially when you don't need to know the index of the current element.

//for (type variable : collection) {
//        use variable
//        }