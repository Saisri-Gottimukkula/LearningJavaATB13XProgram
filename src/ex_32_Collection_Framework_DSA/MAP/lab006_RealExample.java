package ex_32_Collection_Framework_DSA.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lab006_RealExample {
    public static void main(String[] args) {

        Map<String,Object> student1 = new HashMap<>();
        student1.put("name", "saisri");
        student1.put("Roll.no", 2);
        student1.put("Phone", 67890345678l);
        student1.put("Adress1", "Hyderabad");
        student1.put("Address2", 678954);

        Map<String,Object> student2 = new HashMap<>();
        student2.put("name", "Tejasree");
        student2.put("Roll.no", 3);
        student2.put("Phone", 90345678l);
        student2.put("Adress1", "Delhi");
        student2.put("Address2", 890123);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
