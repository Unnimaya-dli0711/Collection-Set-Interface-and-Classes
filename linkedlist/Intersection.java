package linkedlist;

import java.util.LinkedList;

public class Intersection {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        LinkedList<Integer> linkedListNew = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(3);
        linkedList1.add(5);
        linkedList2.add(1);
        linkedList2.add(3);
        linkedList2.add(2);
        for(int i:linkedList1){
            if(linkedList2.contains(i)){
                linkedListNew.add(i);
            }
        }
        System.out.println(linkedListNew);
    }
}
