package ex_32_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab008_Stack {
    public static void main(String[] args) {

        Stack stack1 = new Stack();

        stack1.add("Java");
        stack1.add("python");
        stack1.add("c#");
        stack1.add(90);

        System.out.println(stack1);

        System.out.println(stack1.peek()); //it will look into the top element in the stack and print it

        stack1.pop();//it will remove the top element and print it without top element
        System.out.println(stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(30);
        stack2.push(40);
        stack2.push(50);
        System.out.println("stack2: " + stack2);

        Stack<String> stack3 = new Stack();
        stack3.push("Apple");
        stack3.push("banana");
        stack3.push("mango");
        System.out.println("stack3: " + stack3);
    }
}
