package mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args){
        int[] array=new int[5];
        array= new int[]{1, 1, 2, 3, 3};
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                int frequency=map.get(array[i]);
                map.put(array[i],frequency+1);
            }
        }
        for(Map.Entry m:map.entrySet()){

            if(!m.getValue().equals(1))
                System.out.println(" repeated values : "+m.getKey());
        }
        System.out.println(map);
    }
}
