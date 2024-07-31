package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChar {
    public static void main(String[] args){
        String str="hellohe";
        Map<Character,Integer> mp=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(!mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),1);

            }else {
                int freq=mp.get(str.charAt(i));
                mp.put(str.charAt(i),freq+1);
            }
        }
        for(Map.Entry m:mp.entrySet()){
             
            if(m.getValue().equals(1))
                System.out.println("Non repeative char : "+m.getKey());
        }
    }
}
