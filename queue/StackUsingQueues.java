package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueues {
    static Queue<Integer> queue1=new LinkedList<>();
    static Queue<Integer> queue2=new LinkedList<>();

    static class Stack{
        static void push(int element){
            queue2.add(element);
            while (!queue1.isEmpty()){
                queue2.add(queue1.peek());
                queue1.remove();
            }
            Queue<Integer>swap=queue1;
            queue1=queue2;
            queue2=swap;
        }
        static void pop(){
            if (queue1.isEmpty())
                return;
            queue1.remove();
        }
    }
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(queue1.peek());
        stack.pop();
        System.out.println(queue1.peek());
        stack.pop();
        System.out.println();
    }
}
