package mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {
    public static void main(String[] args){
        Map<Character,Integer> mp=new HashMap<>();
        Map<Integer,Character>tmap=new TreeMap<>();
        mp.put('a',5);
        mp.put('b',2);
        mp.put('c',7);
        for(Map.Entry <Character,Integer>m:mp.entrySet()){
            m.getValue();
            System.out.println(m.getValue());
            tmap.put(m.getValue(),m.getKey());
        }
        System.out.println(tmap);
    }
}
