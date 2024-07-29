package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SortedUniqueElement {
    static TreeSet<Integer> sortUnique(int[] array){
        TreeSet<Integer> treeset=new TreeSet<>();
        for(int i:array)
        {
            treeset.add(i);
        }
        return treeset;
    }
    public static void main(String[] args){

        System.out.println("Enter the number of elements");
        Scanner scannerobject=new Scanner(System.in);
        int number=scannerobject.nextInt();
        int[] array=new int[number];
        System.out.println("enter elements");
        for(int i=0;i<number;i++){
            int num=scannerobject.nextInt();
            array[i]=num;
        }
        System.out.print("Tree Set : "+sortUnique(array)+"\n");
    }
}
