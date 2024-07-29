package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MaintainOrder {
    public static void main(String[] args){
        LinkedHashSet<String> linkedhashset=new LinkedHashSet<>();
        System.out.println("Enter the number of elements");
        Scanner scannerobject=new Scanner(System.in);
        int number=scannerobject.nextInt();
        System.out.println("enter elements");
        for(int i=0;i<number;i++){
            String data=scannerobject.next();
            linkedhashset.add(data);
        }
        System.out.print("Linked Hash Set : "+linkedhashset+"\n");
    }
}
