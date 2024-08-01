package stack;
import java.util.*;
public class ReverseStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    static void reverse()
    {
        while (!stack1.isEmpty()){
            int data=stack1.peek();
            stack2.push(data);
            stack1.pop();
        }
    }
    public static void main(String[] args)
    {
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        System.out.println("Original Stack");
        System.out.println(stack1);
        reverse();
        System.out.println("Reversed Stack");
        System.out.println(stack2);
    }
}
