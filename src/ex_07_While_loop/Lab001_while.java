package ex_07_While_loop;

public class Lab001_while {
    public static void main(String[] args) {
        int i = 1;
        while(i<50){
            System.out.println(i);
            i++;
        }

        for(int j=1;j<50;j++){
            System.out.println(j);

        }


    }
}

//both for and while loop are same but only difference is in while we can initialize outside the loop.
// we can do it in for loop also. If particularly we want to initialize outside the loop we can use while