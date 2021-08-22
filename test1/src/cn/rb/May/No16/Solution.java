package cn.rb.May.No16;

import java.util.HashMap;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        if(s==null||s.length()==0)
            return 0;
        int res=1;//记录子串的个数
        int cur=0;
        HashMap<Character,Integer> myHashMap=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if(myHashMap.get(s.charAt(i))==null){
                myHashMap.put(s.charAt(i),i);
            }else {
                if(cur<myHashMap.get(s.charAt(i)) + 1)
                    cur = myHashMap.get(s.charAt(i)) + 1;
                myHashMap.replace(s.charAt(i), i);
            }
            if(res<i-cur+1)
                res=i-cur+1;

        }
        return res;
    }
}
