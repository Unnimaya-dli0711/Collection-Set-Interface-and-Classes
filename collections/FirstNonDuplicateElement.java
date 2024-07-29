package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FirstNonDuplicateElement {
    public static void main(String[] args){
        LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<>();
        LinkedHashSet<Integer> linkedHashSet1=new LinkedHashSet<>();
        System.out.println("Enter the number of elements");
        Scanner scannerobject=new Scanner(System.in);
        int number=scannerobject.nextInt();
        System.out.println("enter elements");
        for(int i=0;i<number;i++){
            int data=scannerobject.nextInt();
            if(linkedhashset.contains(data))
                 linkedHashSet1.add(data);
            linkedhashset.add(data);
        }
        //System.out.print("Linked Hash Set : "+linkedhashset+"\n"+linkedHashSet1);
        boolean value=linkedhashset.removeAll(linkedHashSet1);
        //System.out.println(linkedhashset);
        Iterator iterator = linkedhashset.iterator();
        int first = (int) iterator.next();
        System.out.println("First Non duplicate Element : "+first);
    }

}
