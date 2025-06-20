package ex_10_TernaryOperator;

public class Lab006_NestedTernary {
    public static void main(String[] args) {
        //age = 23
        //age < 18 -> minor
        //18 > age < 65 -> adult
        //age > 65 -> senior citizen

        int age = 70;
        String result = (age < 18) ? "Minor" :((age < 65) ? "adult" : "senior");
        System.out.println(result);

    }
}
//result = condition1 ? expression1 : (condition2 ? expression 2: expression 3);
//it is used when we have multiple conditions