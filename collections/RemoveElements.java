package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveElements {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner scannerobject = new Scanner(System.in);
        int number = scannerobject.nextInt();
        TreeSet<Integer> treeset=new TreeSet<>();
        for(int i=0;i<number;i++)
        {
            treeset.add(scannerobject.nextInt());
        }
        System.out.println("Enter the limit");
        int limit=scannerobject.nextInt();
        for(int i:treeset){
            if(i>=limit)
                System.out.println(i);
        }

    }
}
