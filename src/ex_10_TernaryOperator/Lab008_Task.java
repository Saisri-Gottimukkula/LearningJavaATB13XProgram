package ex_10_TernaryOperator;

public class Lab008_Task {
    public static void main(String[] args) {
//        Grade Calculation Using Nested Ternary
//        Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.

        int marks = 44;
        String Grades = (marks>=90) ? "Grade A+" : ((marks>=75) ? "Grade A" : ((marks>=60) ? "Grade B" : "Grade C"));
        System.out.println(Grades);

    }
}
