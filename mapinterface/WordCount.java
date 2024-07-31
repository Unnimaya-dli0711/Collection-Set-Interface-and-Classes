package mapinterface;

import java.util.HashMap;

public class WordCount {
    public static void main(String [] args){
        String string="hello hi hello bye";
        String[] arraystring=string.split(" ");
        HashMap<String,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arraystring.length;i++){
            int freq=0;
            for(int j=0;j<arraystring.length;j++){
                if(arraystring[i].equals(arraystring[j])){
                    freq++;
                }
            }
            if(!hashMap.containsKey(arraystring[i]))
                hashMap.put(arraystring[i],freq);
        }
        System.out.println(hashMap);
    }
}
