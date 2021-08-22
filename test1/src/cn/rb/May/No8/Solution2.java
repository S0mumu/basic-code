package cn.rb.May.No8;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author ：rb
 * @version:
 */
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if(s==null ||s.length()==0)
            return 0;
        HashMap<Character,Integer> myMap=new HashMap<>();
        myMap.put(s.charAt(0),0);
        int[] dp=new int[s.length()];
        dp[0]=1;
        int res=dp[0];
        for (int i = 1; i <s.length() ; i++) {
            if(!myMap.containsKey(s.charAt(i))){
                myMap.put(s.charAt(i),i);
                dp[i]=dp[i-1]+1;
            }else{
                int index=myMap.get(s.charAt(i));
                if(dp[i-1]<i-index){
                    dp[i]=dp[i-1]+1;
                }else{
                    dp[i]=i-index;
                }
                myMap.replace(s.charAt(i),i);
            }
            res=(res<dp[i])?dp[i]:res;

        }
        return res;
    }
}
