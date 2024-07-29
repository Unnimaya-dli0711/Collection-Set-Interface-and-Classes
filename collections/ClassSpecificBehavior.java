package collections;

import java.util.*;

public class ClassSpecificBehavior {
    public static void main(String[] args){
        HashSet<Integer> hashset=new HashSet<>();
        TreeSet<Integer> treeset=new TreeSet<>();
        LinkedHashSet<Integer> linkedhashset=new LinkedHashSet<>();
        System.out.println("Enter the number of elements");
        Scanner scannerobject=new Scanner(System.in);
        int number=scannerobject.nextInt();
        System.out.println("enter elements");
        for(int i=0;i<number;i++){
            int num=scannerobject.nextInt();
            hashset.add(num);
            linkedhashset.add(num);
            treeset.add(num);
        }
        System.out.print("Hash Set : "+hashset+"\n");
        System.out.print("Linked Hash Set : "+linkedhashset+"\n");
        System.out.print("Tree Set : "+treeset+"\n");
    }
}
