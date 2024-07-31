package linkedlist;

import java.util.LinkedList;

public class CheckPalindrome {
    public static void main(String[] args){
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        int flag=0;
       for(int i=0;i<linkedList.size()/2;i++){
           if(linkedList.get(i)!=linkedList.get(linkedList.size()-i-1)){
               flag=1;
               break;
           }
       }
       if(flag==0)
            System.out.println("True");
       else System.out.println("False");
    }
}
