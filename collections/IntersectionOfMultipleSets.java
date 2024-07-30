package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfMultipleSets {
    public static void main(String[] args){
        ArrayList<HashSet<Integer>> listof_set=new ArrayList<>();
        System.out.println("Enter the number of elements in list");
        Scanner scannerobject=new Scanner(System.in);
        int size=scannerobject.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements in "+i+" set");
            int number=scannerobject.nextInt();
            HashSet<Integer> hashset=new HashSet<>();
            for(int j=0;j<number;j++){
               hashset.add(scannerobject.nextInt());
            }
            listof_set.add(hashset);
        }
        System.out.println(listof_set);
        for(int i:listof_set.get(0)){
            int flag=0;
            for(int j=0;j<listof_set.size();j++){
                if(!listof_set.get(j).contains(i)){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }
}
