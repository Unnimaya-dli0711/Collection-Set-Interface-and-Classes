package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String [] args){
        String string="hello";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<string.length();i++){
            int freq=0;
            for(int j=0;j<string.length();j++){

                if(string.charAt(i)==string.charAt(j)){
                    freq++;
                }
            }
            if(!hashMap.containsKey(string.charAt(i))){
                hashMap.put(string.charAt(i),freq);
            }
        }
        System.out.println(hashMap);
    }
}
