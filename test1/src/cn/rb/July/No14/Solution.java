package cn.rb.July.No14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int count=0;
        int max_count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(!hashMap.containsKey(s.charAt(i))) {
                count++;
                if (max_count < count) {
                    max_count = count;
                }
            }
            else{

                    count=i-hashMap.get(s.charAt(i));
                    if (max_count < count) {
                        max_count = count;
                    }
                    Iterator<Map.Entry<Character, Integer>> iterator =hashMap.entrySet().iterator();
                    while(iterator.hasNext()){
                        Map.Entry<Character, Integer> next = iterator.next();
                        if(next.getValue()<hashMap.get(s.charAt(i))){
                            iterator.remove();
                        }

                    }

            }
            hashMap.put(s.charAt(i),i);
        }
        return max_count;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.lengthOfLongestSubstring(new String("pwwkew"));
    }

}
