package linkedlist;

import java.util.LinkedList;

public class NthFromEnd {
    public static void main(String[] args){
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        int n=2;
        int remove=linkedList.size()-n;
        linkedList.remove(remove);
        System.out.println(linkedList);
    }
}
