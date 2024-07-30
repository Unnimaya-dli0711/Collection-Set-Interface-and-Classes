package collections;

import java.util.HashSet;
import java.util.Scanner;

public class CheckSubset {
    public static void main(String[] args){
        HashSet<Integer> hashset1=new HashSet<>();
        HashSet<Integer> hashset2=new HashSet<>();
        System.out.println("Enter the number of elements in set1");
        Scanner scannerobject=new Scanner(System.in);
        int number1=scannerobject.nextInt();
        System.out.println("Enter the number of elements in set2");
        int number2=scannerobject.nextInt();
        System.out.println("Enter elements in set1");
        for(int i=0;i<number1;i++){
            hashset1.add(scannerobject.nextInt());
        }
        System.out.println("Enter elements in set2");
        for(int i=0;i<number2;i++){
            hashset2.add(scannerobject.nextInt());
        }
        boolean flag=true;
        for(int i:hashset2){
            if(!hashset1.contains(i)){
                flag=false;
            }
        }
        System.out.println("Subset : "+flag);
    }
}
