package linkedlist;

import java.util.LinkedList;

public class RemoveValue {
    public static void main(String[] args){
        LinkedList<Integer> linkedList=new LinkedList<>();
        LinkedList<Integer> linkedListNew=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(5);
        int remove=3;
        for(int i:linkedList){
            if(remove!=i){
                linkedListNew.add(i);
            }
        }

        System.out.println(linkedListNew);
    }
}
