package cn.rb.test1.demo28;

import java.util.*;

public class Solution {
    /*
    public char firstUniqChar(String s) {
        if(s.length()==0||s==null)
            return ' ';
        HashMap<Character,Integer> myMap=new HashMap();
        for (int i = 0; i <s.length() ; i++) {
            if(!myMap.containsKey(s.charAt(i))){
                myMap.put(s.charAt(i),1);
            }else{
                myMap.replace(s.charAt(i),myMap.get(s.charAt(i))+1);
            }
        }
//
//        List<Character> mylist=new ArrayList<>();
//
//        for (char key:myMap.keySet()) {
//            if (myMap.get(key)==1){
//                mylist.add(key);
//            }
//        }
//        char re=' ';
//        int smallindex=s.length();
//        for (int i = 0; i <mylist.size() ; i++) {
//            if(s.indexOf(mylist.get(i).toString())<smallindex){
//                smallindex=s.indexOf(mylist.get(i).toString());
//                re=mylist.get(i);
//            }
//        }
//        return re;
        for (int i = 0; i <s.length() ; i++) {
            if(myMap.get(s.charAt(i))==1)
                return s.charAt(i);
        }
        return ' ';
    }
*/
    public char firstUniqChar(String s){
        HashMap<Character,Boolean> myHashMap=new LinkedHashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            myHashMap.put(s.charAt(i),!myHashMap.containsKey(s.charAt(i)));
        }
        for (Map.Entry<Character,Boolean> e:myHashMap.entrySet()) {
            if(e.getValue())
                return e.getKey();
        }
        return ' ';
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.firstUniqChar("abaccdeff"));
    }
}
