package cn.rb.July.No15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public boolean checkInclusion(String s1,String s2){
        if(s1==null|| s2==null|| s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> hashMap1=new HashMap<>();
        for (int i = 0; i <s1.length() ; i++) {
           addHashMap(hashMap1,s1.charAt(i));
        }

        HashMap<Character,Integer>hashMap2=new HashMap<>();
        for (int i = 0; i <s1.length()-1 ; i++) {
            addHashMap(hashMap2,s2.charAt(i));
        }
        for (int i = s1.length()-1; i <s2.length() ; i++) {
            addHashMap(hashMap2,s2.charAt(i));
            if(checkHashMap(hashMap1,hashMap2)){
                return true;
            }
            deleteHashMap(hashMap2,s2.charAt(i-(s1.length()-1)));
        }
        return false;
    }

    public void addHashMap(HashMap<Character,Integer> hashMap,Character c){
        if(hashMap.containsKey(c)){
            hashMap.replace(c,hashMap.get(c)+1);
        }else{
            hashMap.put(c,1);
        }
    }
    public void deleteHashMap(HashMap<Character,Integer> hashMap,Character c){
        if(hashMap.get(c)==1){
            hashMap.remove(c);
        }else{
            hashMap.replace(c,hashMap.get(c)-1);
        }
    }
    public boolean checkHashMap(HashMap<Character,Integer> hashMap1,HashMap<Character,Integer> hashMap2){
        if(hashMap1==null|| hashMap2==null || hashMap1.size()!=hashMap2.size()) {
            return false;
        }
        Iterator<Map.Entry<Character, Integer>> iterator = hashMap1.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            if(hashMap2.get(next.getKey())==null || !hashMap2.get(next.getKey()).equals(next.getValue())){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.checkInclusion("ab","eidboaoo"));
    }
}
