package ex_06_for_loop;

public class Lab010_For_continue {
        public static void main(String[] args) {
            //for loop can have break but not if loop
            for (int i = 0; i < 50; i++) {
                if (i == 5) {
                    continue; //we use continue to skip the code and go to the top (for loop)
                }
                System.out.println(i);
            }
        }

}
