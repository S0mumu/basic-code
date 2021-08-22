package cn.rb.April.No15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        if(!check(s1,s2))
            return false;
        for (int i = 1; i <s1.length(); i++) {
            //确定分割点
            String a=s1.substring(0,i);
            String b=s1.substring(i);
            String c=s2.substring(0,i);
            String d=s2.substring(i);
            if(isScramble(a,c)&& isScramble(b,d))
                return true;
            c=s2.substring(0,s2.length()-i);
            d=s2.substring(s2.length()-i);
            if(isScramble(a,d) && isScramble(b,c))
                return true;
        }
        return false;
    }

    public boolean check(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        int[] count1=new int[26];
        int[] count2=new int[26];
        for (int i = 0; i <s1.length() ; i++) {
            count1[s1.charAt(i)-'a']++;
        }
        for (int j=0;j<s2.length();j++){
            count2[s2.charAt(j)-'a']++;
        }
        for (int i = 0; i <count1.length ; i++) {
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }
}
