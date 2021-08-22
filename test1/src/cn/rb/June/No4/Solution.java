package cn.rb.June.No4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> result=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i <strs.length ; i++) {
            String temp=strs[i];
            char[] chars = temp.toCharArray();
            Arrays.sort(chars);
            String cur=new String(chars);
            if(map.get(cur)!=null){
               result.get(map.get(cur)).add(strs[i]);
            }else{
                map.put(cur,result.size());
                ArrayList<String> list=new ArrayList<>();
                list.add(strs[i]);
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
}
