package linkedlist;

import java.util.LinkedList;

public class MergeList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        LinkedList<Integer> linkedListNew = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(3);
        linkedList1.add(5);
        linkedList2.add(2);
        linkedList2.add(4);
        linkedList2.add(6);
        int j = 0, k = 0;

        int i=0;
        while(j<linkedList1.size() && k<linkedList2.size()){
            if (linkedList1.get(j) < linkedList2.get(k)){
                linkedListNew.add(linkedList1.get(j));
                j++;
                i++;
            }else {
                linkedListNew.add(linkedList2.get(k));
                k++;
                i++;
            }
        }
        while (j<linkedList1.size()){
            linkedListNew.add(linkedList1.get(j));
            j++;
            i++;
        }
        while (k<linkedList2.size()){
            linkedListNew.add(linkedList2.get(k));
            k++;
            i++;
        }
        System.out.println(linkedListNew);
    }
}
