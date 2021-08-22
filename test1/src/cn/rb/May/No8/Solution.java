package cn.rb.May.No8;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        if(s==null ||s.length()==0)
            return -1;
        int count=0;
        Set<Character> mySet;
        for (int i = 0; i <s.length()-count ; i++) {
            mySet=new HashSet<>();
            int temp=i;
            while(temp<s.length() && !mySet.contains(s.charAt(temp))){
                mySet.add(s.charAt(temp));
                temp++;
            }
            if(count<mySet.size()){
                count=mySet.size();
            }
            if(count==s.length())
                break;
        }
        return count;
    }
}
